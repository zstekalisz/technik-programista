package pl.zste.zadanieegzamin.arkusz4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class WyszukiwanieWTablicy {

	public static void main(String[] args) {
		System.out.println("Program wyszukuj¹cy wprowadzono liczbê w tablicy losowych liczb");
		int[] tab = inicjalizacja();
		Scanner sc = new Scanner(System.in);
		boolean wartoscSzukanaOk = false;
		int szukana = 0;
		while(!wartoscSzukanaOk) {
			System.out.println("Wpisz liczbê któr¹ bêdê szukaæ :");
			try {
			szukana = Integer.valueOf(sc.nextLine());
			if(szukana<1 || szukana>100) {
				throw new NumberFormatException();
			}
			wartoscSzukanaOk = true;
		}catch(InputMismatchException e) {
			System.out.println("Wprowadz poprawna liczbee");
		}

		}
		dodajWartownika(szukana,tab);
		testujemyInicjalizacje(tab);
	}
	
	public static int szukajElement(int[] tablica) {
		return 0;
	}
	public static void dodajWartownika(int wartownik, int[]tablica) {
		
	}
	public static int[] inicjalizacja() {
		int[] tablica  = new int[51];
		Random r = new Random();
		for(int i=0; i<tablica.length-1;i++) {
			int nextInt = r.nextInt(100);
			tablica[i] = nextInt;
		}
		return tablica;
		
	}
	public static void testujemyInicjalizacje(int[]  tab) {
		for(int i=0;i<tab.length;i++) {
			System.out.println(tab[i]);
		}
	}
}
