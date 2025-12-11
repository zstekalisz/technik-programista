package pl.kalisz.zste.egzamin.konsola;

import static org.hamcrest.CoreMatchers.containsString;

import java.util.Scanner;

public class SzyfrCezaraGr2 {
	
	private static String[] tab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", 
			"v", "w", "x", "y", "z"};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wpisz tekst do zaszyfrowania : ");
		String text = scanner.nextLine();
		String[] letters = text.split("");
		System.out.println("Podaj klucz:");
		int key = scanner.nextInt();
		String crypt = crypt(letters, key);
		System.out.println(crypt);
		
	}
	
	public static String crypt(String[] letters, int key) {
		//duplikat kodu wydzielić do nowej metody
		key = key%26;
		String[] tabCrypt = new String[26];
		for(int i = 0; i < tab.length; i++) {
			int poz = i-key;
			if(poz<0) {
				poz = 26 + poz;
			}
			if(poz>25) {
				poz = poz - 26;
			}
			tabCrypt[poz] = tab[i];
		}
		StringBuilder builder = new StringBuilder();
		/////
		for(String l : letters) {
			if(l.equals(" ")) {
				builder.append(" ");
				continue;
			}
			for(int i = 0; i<tab.length; i++) {
				if(l.equals(tab[i])) {
					builder.append(tabCrypt[i]);
				}
				
			}
			
		}
		return builder.toString();
		
	}
	
	public static String decrypt(String[] letters, int key) {
		//duplikat kodu wydzielić do nowej metody
		key = key%26;
		String[] tabCrypt = new String[26];
		for(int i = 0; i < tab.length; i++) {
			int poz = i-key;
			if(poz<0) {
				poz = 26 + poz;
			}
			if(poz>25) {
				poz = poz - 26;
			}
			tabCrypt[poz] = tab[i];
		}
		StringBuilder builder = new StringBuilder();
		/////
		for(String l : letters) {
			if(l.equals(" ")) {
				builder.append(" ");
				continue;
			}
			for(int i = 0; i<tab.length; i++) {
				if(l.equals(tabCrypt[i])) {
					builder.append(tab[i]);
				}
				
			}
			
		}
		return builder.toString();
		
	}
	
	

}
