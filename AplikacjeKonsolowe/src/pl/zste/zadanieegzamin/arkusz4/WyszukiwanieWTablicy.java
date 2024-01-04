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
		int szukana = 0;
		while(!wartoscSzukanaOk) {
			System.out.print("Wpisz liczbę którą będę szukać :");
			try {
				szukana = Integer.valueOf(sc.nextLine());
				if(szukana<1 || szukana >100) {
					throw new NumberFormatException();
				}
				wartoscSzukanaOk = true;
				
			}catch(NumberFormatException e) {
				System.out.println("Wprowadź poprawną liczbę od 1 do 100");
			}
			
		}
		dodajWartownika(szukana, tab);
		//testujemyInicjalizacje(tab);
		int indeksSzukanegoElementu = szukajElementu(tab);
		testujemyInicjalizacje(tab);
		System.out.print(indeksSzukanegoElementu == -1 ? "brak elementu w tablicy" : "indeks szukanej to :"+indeksSzukanegoElementu);
		
		

	}
	/************************************************
	 * nazwa metody - szukajElementu
	 * @param tablica - tablica zawierająca element wartownika na ostatniej pozycji
	 * @return - indeks szukanego elementu lub -1 w przypadku braku
	 * opis - metoda przeszukuje tablicę próbując znależć indeks elementu którego wartość jest rózna ostatniemu <br>
	 * elementowi w tablicy tzw. wartownikowi
	 * @author 4D
	 ************************************************/
	public static int szukajElementu(int[] tablica) {
		int wartownik = tablica[tablica.length-1];
		for(int i = 0; i<tablica.length; i++) {
			if(wartownik == tablica[i] && i != tablica.length-1) {
				return i;
			}
		}
		return -1;
	}
	/**************************************************
	 * nazwa metody - dodajWartownika
	 * @param wartownik - int
	 * @param tablica - tablica liczb całkowitych
	 * opis - metoda dodaje na ostatnim indeksie tablicy wartownika czyli przyszłą szukaną
	 * @author 4D
	 *************************************************/
	public static void dodajWartownika(int wartownik, int[]tablica) {
		tablica[tablica.length-1] = wartownik;
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
	/**
	 * nazwa metody - testujemyInicjalizacje
	 * @param tab - tablica
	 * @return void
	 * opis - metoda wyświetlająca w konsoli finalny wynik działania programu
	 * @author 4D
	 */
	public static void testujemyInicjalizacje(int[] tab) {
		for(int i = 0; i< tab.length; i++) {
			System.out.print(tab[i]);
			if(i!= tab.length-1) {
				System.out.print(", ");
			}else {
				System.out.print(" ");
			}
			
		}
	}

}
