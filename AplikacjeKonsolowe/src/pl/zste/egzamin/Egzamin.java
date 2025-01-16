package pl.zste.egzamin;

import java.util.Random;

public class Egzamin {
	private int rozmiar;
	private int[] liczby;
	
	
	
	public Egzamin(int rozmiar) {
		this.rozmiar = rozmiar;
		this.liczby = new int[rozmiar];
		for(int i =0; i< rozmiar; i++) {
			Random random = new Random();
			int nextInt = random.nextInt(1000);
			this.liczby[i] = nextInt;
		}
	}
	
	public void displayAll() {
		for(int i =0; i< rozmiar; i++) {
			System.out.println(i +":"+this.liczby[i]);
		}
	}
	public int findElement(int element) {
		for(int i =0; i< rozmiar; i++) {
			if(element == this.liczby[i]) {
				return i;
			}
		}
		return -1;
	}
	public int getOddNumber() {
		int counter = 0;
		for(int i =0; i< rozmiar; i++) {
			if(this.liczby[i]%2!=0) {
				System.out.println(this.liczby[i]);
				counter++;
			}
		}
		return counter;
	}
	public double getAvg() {
		double sum = 0;
		for(int i =0; i< rozmiar; i++) {
			sum+= this.liczby[i];
		}
		return sum/rozmiar;
	}



	public static void main(String[] args) {
		Egzamin egzamin = new Egzamin(20);
		egzamin.displayAll();
		int element = egzamin.findElement(55);
		if(element!=-1) {
			System.out.println("Znaleziono liczbę pod indeksem "+element);
		}
		int oddNumber = egzamin.getOddNumber();
		System.out.println("Zlaziono w tablicy "+oddNumber+ " liczb nieparzytych");
		double avg = egzamin.getAvg();
		System.out.println("Wartoś średniej wynosi "+avg);
	}

}
