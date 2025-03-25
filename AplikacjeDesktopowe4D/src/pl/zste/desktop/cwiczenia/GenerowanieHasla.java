package pl.zste.desktop.cwiczenia;

import java.util.Random;

public class GenerowanieHasla {

	public static void main(String[] args) {
		String haslo = generujHaslo(2, true, true, true);
		System.out.println(haslo);

	}
	public static String generujHaslo(int ileZnakow, boolean litery, boolean cyfry, boolean specjalne) {
		String literki = "qwertyuiopasdfghjklzxcvbnm";
		String duze = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String cyferki = "1234567890";
		String specjalki = "!@#$%^&*()_=+";
		
		String[] znaki = literki.split("");
		
		String haslo = "";
		Random r = new Random();
		if(litery && ileZnakow>0) {
			int index = r.nextInt(duze.length());
			String znak = duze.split("")[index];
			haslo = haslo + znak;
			ileZnakow--;		
		}
		if(cyfry && ileZnakow>0) {
			int index = r.nextInt(cyferki.length());
			String znak = cyferki.split("")[index];
			haslo = haslo + znak;
			ileZnakow--;
		}
		if(specjalne && ileZnakow>0) {
			int index = r.nextInt(specjalki.length());
			String znak = specjalki.split("")[index];
			haslo = haslo + znak;
			ileZnakow--;
		}
		
		for(int i=0; i<ileZnakow; i++) {
			int index = r.nextInt(znaki.length);
			String znak = znaki[index];
			haslo = haslo + znak;
		}
		
		return haslo;
	}

}
