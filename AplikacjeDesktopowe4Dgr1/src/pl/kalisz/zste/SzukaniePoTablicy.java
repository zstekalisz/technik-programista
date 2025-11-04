package pl.kalisz.zste;

import java.util.Scanner;

public class SzukaniePoTablicy {

	public static void main(String[] args) {
		System.out.print("Podaj liczbę:");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		int[] tablica = {1,2,3,4,5,6,7,8,9};
		boolean znalzal = false;
		znalzal = searchTable(nextInt, tablica, znalzal);
		if(znalzal) {
			System.out.println("Twoja liczba jest cyfrą");
		}else {
			System.out.println("Twoja liczba nie jest cyfrą");
		}
		
		scanner.close();

	}
	/**
	 * Metoda szuka w tablicy liczby z parametru
	 * @param nextInt - szukana liczba
	 * @param tablica - tablica cyfr w której szukamy
	 * @param znalzal - informacja czy liczba znajduje się w tablicy
	 * @return true jak liczba jest w tablicy , false jak jej nie ma
	 */
	public static boolean searchTable(int nextInt, int[] tablica, boolean znalzal) {
		for(int i =0; i< tablica.length; i++) {
			if(tablica[i]==nextInt) {
				znalzal = true;
			}
			
		}
		return znalzal;
	}

}
