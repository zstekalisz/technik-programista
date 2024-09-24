package pl.kalisz.zste.aplikacje;

import java.util.Scanner;

import pl.kalisz.zste.konsola.NumberUtils;

public class SortowanieBabelkowe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] tab = new int[10];
		for(int i = 0; i< 10; i++) {
			System.out.print("Podaj liczbę :");
			if(sc.hasNextInt()) {
				int nextInt = sc.nextInt();
				tab[i] = nextInt;
				
			}else{
				i--;
				System.out.println("Wprowadź poprawne dane (liczba)");
				sc.next();
			}
		}
		
		NumberUtils.sortowanieBabelkoweMalejace(tab);
		System.out.println("Posortowana tablica wygląda następująco :");
		for(int i = 0; i<tab.length; i++) {
			System.out.print(tab[i]);
			System.out.print(" ");
		}

	}

}
