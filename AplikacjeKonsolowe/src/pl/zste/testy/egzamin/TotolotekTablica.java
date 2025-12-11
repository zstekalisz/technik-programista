package pl.zste.testy.egzamin;

import java.util.Random;
import java.util.Scanner;

public class TotolotekTablica {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj liczbę losowań :");
		int liczbaLosowan = scanner.nextInt();
		int[][] tablica = new int[liczbaLosowan][6];
		for(int i = 0; i < liczbaLosowan; i++) {
			losujZestaw(tablica, i);
		}
		System.out.println("Zestawy wylosowanych liczb :");
		for(int i = 0; i<liczbaLosowan; i++) {
			System.out.print("Losowanie numer "+(i+1)+": ");
			for(int j = 0; j<6; j++) {
				System.out.print(tablica[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int x = 1; x<=49; x++) {
			int counter = 0;
			for(int i = 0; i< liczbaLosowan; i++) {
				for(int j = 0; j<6; j++) {
					if(x== tablica[i][j]) {
						counter++;
					}
				}
			}
			System.out.println("Liczba "+x+" wystąpiła "+ counter+" razy");
		}
		

	}
	/**
	 * @author 12345678900
	 * losuje 6 liczb z 49 i umieszcza je jako wiersz w tablicy
	 * @param tablica- tablica z zestawami losowań
	 * @param numerWiersza - numer wiersza w którym będzie umoeszczony wylosowany zestaw liczb
	 */
	private static void losujZestaw(int[][] tablica, int numerWiersza) {
		Random random = new Random();
		for(int i = 0; i<6; i++) {
			int losowa = random.nextInt(49);
			losowa++;
			if(czyLosowaSiePowtorzyla(tablica, numerWiersza, losowa)) {
				i--;
			}else {
				tablica[numerWiersza][i] = losowa;
			}
			
		}
		
	}
	/**
	 * @author 12345678900
	 * Metoda sprawdza czy w zestawie liczb o indeksie numerWiersza liczba podana w parametrze
	 * metody o identyfikatorze losowa wystąpiła wcześniej. Metoda ma na celu sprawdzenie czy w danym wierszu
	 * nie ma powtórzeń
	 * @param tablica - tablica z zestawami losowań
	 * @param numerWiersza - indeks wiersza w którym dokonujemy sprawdzenia
	 * @param losowa - wylosowana liczba którą będziemy sprawdzać czy występuje już w wierszu o indeksie numerWiersza
	 * @return true jak losowa występuje już w tablicy w wierszu o indeksie numerWiersza, false w przypadku
	 * jak nie występuje
	 */
	private static boolean czyLosowaSiePowtorzyla(int[][] tablica, int numerWiersza, int losowa) {
		boolean result = false;
		for(int i = 0; i < 6; i++) {
			if(tablica[numerWiersza][i]== losowa) {
				result = true;
				break;
			}
		}
		return result;
	}

}
