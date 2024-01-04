package pl.zste.spr1;

import java.util.Scanner;

public class Sprawdzian1 {

	public static void main(String[] args) {
		int[] tab = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			//System.out.print("Podaj liczbę:");
//			String nextLine = sc.nextLine();
//			//pierwsze rozwiązanie
//			try {
//				Integer.valueOf(nextLine);
//			}catch(NumberFormatException ex) {
//				System.out.println("Nie sposałeś liczby");
//				i--;
//			}
			//drugie rozwiązanie
			if(sc.hasNextInt()) {
				int nextInt = sc.nextInt();
				tab[i] = nextInt;
			}else {
				sc.next();
				System.out.println("Nie sposałeś liczby");
			}
			
		}
		sort(tab);
		for(int i = 0; i<tab.length; i++) {
			System.out.print(tab[i]);
			System.out.print(", ");
		}
		sc.close();
	}
	
	public static void sort(int[] tab) {
		for(int i = 0; i<tab.length; i++) {
			for(int j = 0; j<i; j++) {
				if(tab[i]<tab[j]) {
					int buff = tab[i];
					tab[i] = tab[j];
					tab[j] = buff;
				}
			}
		}
	}

}
