package pl.zste.zadanieegzamin.arkusz4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class WyszukiwanieWTablicy {

	public static void main(String[] args) {
		System.out.println("Program wyszukujący wprowadzoną liczbę w tablicy losowych liczb");
		int[] tab = inicjacja();
		//testujemyInicjalizacje(tab);
		Scanner sc = new Scanner(System.in);
		boolean wartoscSzukanaOk= false;
		while(!wartoscSzukanaOk) {
			System.out.print("Wpisz liczbę którą będę szukać :");
			try {
				int szukana = sc.nextInt();
				wartoscSzukanaOk = true;
				
			}catch(InputMismatchException e) {
				System.out.println("Wprowadź poprawną liczbę");
			}
			
		}
		

	}
	
	public static int szukajElementu(int[] tablica) {
		return 0;
	}
	
	public static void dodajWartownika(int wartownik, int[]tablica) {
		
	}
	
	public static int[] inicjacja() {
		int[] tablica = new int[51];
		Random r = new Random();
		for(int i =0; i < tablica.length-1; i++) {
			int nextInt = r.nextInt(100);
			tablica[i] = nextInt;
		}
		return tablica;
	}
	
	public static void testujemyInicjalizacje(int[] tab) {
		for(int i = 0; i< tab.length; i++) {
			System.out.println(tab[i]);
		}
	}

}
