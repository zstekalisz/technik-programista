package pl.zste.desktop.cwiczenia;

import java.util.Random;

public class GenerowanieHasla {

	public static void main(String[] args) {
		String haslo = generujHaslo(2, true, true, true);
		System.out.println(haslo);

	}
	public static String generujHaslo(int ileZnakow, boolean litery, boolean cyfry, boolean specjalne) {
		String maleLitery = "qwertyuiopasdfghjklzxcvbnm";
		String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String cyferki = "1234567890";
		String specjal = "!@#$%^&*()_+=-";
		Random random = new Random();
		String haslo = "";
		if(litery && ileZnakow>0) {
			int index = random.nextInt(duzeLitery.length());
			String[] split = duzeLitery.split("");
			haslo = haslo+split[index];
			ileZnakow--;
			
		}
		if(cyfry && ileZnakow>0) {
			int index = random.nextInt(cyferki.length());
			String[] split = cyferki.split("");
			haslo = haslo+split[index];
			ileZnakow--;
		}
		if(specjalne && ileZnakow>0) {
			int index = random.nextInt(specjal.length());
			String[] split = specjal.split("");
			haslo = haslo+split[index];
			ileZnakow--;
		}
		for(int i = 0; i< ileZnakow; i++) {
			int index = random.nextInt(maleLitery.length());
			String[] split = maleLitery.split("");
			haslo = haslo+split[index];
		}
		return haslo;
	}

}
