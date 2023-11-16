package pl.zste.console;

import java.util.Scanner;

import pls.zste.konwersja.DziesiateNaBinarne;

public class KonwersjaApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj liczbê dziesietn¹ : ");
		String nextLine = scanner.nextLine();
		int liczba = Integer.parseInt(nextLine);
		String converted = DziesiateNaBinarne.convert(liczba);
		System.out.println(converted);
		scanner.close();
	}

}
