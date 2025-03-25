package pl.zste.desktop.cwiczenia;

import java.util.Random;

public class GenerowanieHasla {

	public static void main(String[] args) {
		String haslo = generujHaslo(8, true, true, true);
		System.out.println(haslo);

	}
	public static String generujHaslo(int ileZnakow, boolean litery, boolean cyfry, boolean specjalne) {
		String literki = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		String cyferki = "1234567890";
		String specjalki = "!@#$%^&*()_=+";
		String wynik = "";
		if(litery) {
			wynik = wynik+literki;				
		}
		if(cyfry) {
			wynik = wynik+cyferki;
		}
		if(specjalne) {
			wynik = wynik+specjalki;
		}
		String[] znaki = wynik.split("");
		
		String haslo = "";
		Random r = new Random();
		for(int i=0; i<ileZnakow; i++) {
			int index = r.nextInt(znaki.length);
			String znak = znaki[index];
			haslo = haslo + znak;
		}
		
		return haslo;
	}

}
