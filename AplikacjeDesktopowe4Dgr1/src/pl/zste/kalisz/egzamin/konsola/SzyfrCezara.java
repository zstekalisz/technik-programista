package pl.zste.kalisz.egzamin.konsola;

import java.util.Scanner;

public class SzyfrCezara {
	
	private static String[] tab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", 
			"v", "w", "x", "y", "z"};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj tekst do zaszyfrowania : ");
		String doZaszyfrowania = scanner.nextLine();
		System.out.println("Podaj klucz do zaszyfrowania : ");
		int klucz = scanner.nextInt();
		String zaszyfrowany = zaszyfruj(doZaszyfrowania, klucz);
		System.out.println(zaszyfrowany);

	}
	
	public static String zaszyfruj(String tekst, int klucz) {
		klucz = klucz%26;
		String[] tabCrypt = new String[26];
		for(int i = 0; i<26; i++) {
			String litera = tab[i];
			int pozycja = i-klucz;
			if(pozycja<0) {
				pozycja = 26+pozycja;
			}
			if(pozycja>25 && klucz<0) {
				pozycja = pozycja-26;
			}
			tabCrypt[pozycja] = litera;
		}
		String[] split = tekst.split("");
		StringBuilder b = new StringBuilder();
		for(String s : split) {
			if(s.equals(" ")) {
				b.append(s);
				continue;
			}
			for(int i = 0; i<26; i++) {
				if(tab[i].equals(s)) {
					b.append(tabCrypt[i]);
				}
			}
			
		}
		return b.toString();
	}
	

	public static String odszyfruj(String tekst, int klucz) {
		klucz = klucz%26;
		String[] tabCrypt = new String[26];
		for(int i = 0; i<26; i++) {
			String litera = tab[i];
			int pozycja = i-klucz;
			if(pozycja<0) {
				pozycja = 26+pozycja;
			}
			if(pozycja>25 && klucz<0) {
				pozycja = pozycja-26;
			}
			tabCrypt[pozycja] = litera;
		}
		String[] split = tekst.split("");
		StringBuilder b = new StringBuilder();
		for(String s : split) {
			if(s.equals(" ")) {
				b.append(s);
				continue;
			}
			for(int i = 0; i<26; i++) {
				if(tabCrypt[i].equals(s)) {
					b.append(tab[i]);
				}
			}
			
		}
		return b.toString();
	}
}
