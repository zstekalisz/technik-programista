package pl.zste.start;

import java.util.ArrayDeque;

public class CwiczeniaKlasyKolekcji {
	public static void main(String[] args) {
		ArrayDeque<String> kolejka = new ArrayDeque<String>();
		kolejka.add("Kasia");
		kolejka.add("Adam");
		kolejka.add("Janusz");
		kolejka.add("Piotr");
		while(kolejka.peek()!=null) {
			System.out.println(kolejka.remove());
		}
	}

}
