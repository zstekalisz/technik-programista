package pl.zste.zadanieegzamin.arkusz3;

import java.util.Scanner;

public class SortowanieMalejace {
	
	public int[] tablica = new int[10];

	public static void main(String[] args) {
		System.out.println("Program sortujący tablicę");
		Scanner sc = new Scanner(System.in);
		SortowanieMalejace sort = new SortowanieMalejace();
		for(int i = 0 ; i<10; i++) {
			System.out.print("Podaj kolejną liczbę którą mam umieścić w tablicy : ");
			int nextInt = sc.nextInt();
			sort.tablica[i] = nextInt;
		}
		sort.sortMyTable();
		System.out.println("Posortowana tablica którą wprowadziłeś:");
		for(int i = 0; i<10; i++) {
			System.out.print(sort.tablica[i]);
			if(i!=9) {
				System.out.print(", ");
			}
		}
		sc.close();
	}
	
	public void sortMyTable() {
		for(int i = 0; i<tablica.length; i++) {
			int indexOfMax = getIndexOfMax(tablica, i);
			int valueBuff = tablica[indexOfMax];
			tablica[indexOfMax]= tablica[i];
			tablica[i]= valueBuff;
		}
	}
	private int getIndexOfMax(int[] tab, int tabStartIndex) {
		int result = tab[tabStartIndex];
		int resultIndex = tabStartIndex;
		for(int i = tabStartIndex; i<tab.length; i++) {
			int buf = tab[i];
			if(buf>result) {
				result = buf;
				resultIndex = i;
			}
		}
		return resultIndex;
	}

}
