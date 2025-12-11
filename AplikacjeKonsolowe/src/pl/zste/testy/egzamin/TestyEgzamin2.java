package pl.zste.testy.egzamin;

import java.util.Random;
import java.util.Scanner;

public class TestyEgzamin2 {

	public static void main(String[] args) {
		System.out.println("Wprowadz liczbę losowań :");
		Scanner scanner = new Scanner(System.in);
		int liczbaLosowan = scanner.nextInt();
		int [][] tablica = new int[liczbaLosowan][6];
		for(int i = 0; i<liczbaLosowan; i++) {
			losujZestaw(tablica, i);
		}
		for(int i = 0; i<liczbaLosowan; i++) {
			System.out.print("Losowanie numer "+(i+1)+": ");
			for(int j = 0; j<6; j++) {
				System.out.print(tablica[i][j]+" ");
			}
			System.out.print("\n");
		}
		for(int i = 1; i<=49; i++) {
			int counter = 0;
			for(int x = 0 ; x<liczbaLosowan; x++) {
				for(int y = 0; y<6; y++) {
					if(tablica[x][y] == i) {
						counter++;
					}
				}
			}
			System.out.println("Liczba "+i+" została wylosowana "+counter+" razy");
		}

	}
	
	
	private static void losujZestaw(int[][] tablica, int numerWiersza) {
		Random random = new Random();
		for(int i = 0; i < 6; i++) {
			int wylosowanaLiczba = random.nextInt(49);
			wylosowanaLiczba++;
			boolean flaga = sprawdzCzyWWierszuJestWylosowanaLiczba(tablica, numerWiersza, wylosowanaLiczba);
			if(flaga) {
				i--;
			}else {
				tablica[numerWiersza][i] = wylosowanaLiczba;
			}
		}
	}
	
	private static boolean sprawdzCzyWWierszuJestWylosowanaLiczba(int[][] tablica, 
			int numerWiersza, int wylosowanaLiczba) {
		for(int i = 0; i<6; i++) {
			int element = tablica[numerWiersza][i];
			if(element==wylosowanaLiczba) {
				return true;
				
			}
		}
		return false;
		
	}

}
