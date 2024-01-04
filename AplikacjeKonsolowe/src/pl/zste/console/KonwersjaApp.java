package pl.zste.console;

import java.util.Scanner;

import pl.zste.konwersja.DziesietneNaBinarne;

public class KonwersjaApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print("Podaj liczbę dziesiętną :");
			String nextLine = scanner.nextLine();
			int liczba = 0;
			try {
				liczba = Integer.parseInt(nextLine);
			} catch (NumberFormatException ex) {
				System.out.println("");
				System.err.println("Nie wpisałeś poprawnie liczby");
			}
			String converted = DziesietneNaBinarne.convert(liczba);
			System.out.println(converted);
		}

		scanner.close();
	}

}
