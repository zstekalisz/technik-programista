package pl.zste.zadanieegzamin.arkusz1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZakladanieNotatek {
	
	private static List<Notatka> notatki = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Aplikacja tworząca notatki");
		System.out.print("Podaj tytuł notatki:");
		Scanner scanner = new Scanner(System.in);
		String tytul1 = scanner.nextLine();
		System.out.print("Podaj treść notatki:");
		String tresc1 = scanner.nextLine();
		Notatka notatka1 = new Notatka(tytul1, tresc1);
		notatki.add(notatka1);
		System.out.print("Podaj tytuł notatki:");
		String tytul2 = scanner.nextLine();
		System.out.print("Podaj treść notatki:");
		String tresc2 = scanner.nextLine();
		Notatka notatka2 = new Notatka(tytul2, tresc2);
		notatki.add(notatka2);
		System.out.println("");
		System.out.println("Zakończyliśmy dodawanie notatek");
		notatki.forEach(n-> {
			n.getTytulAndTresc();
			n.diagnostic();
		});
		for(int i =0; i<notatki.size(); i++) {
			Notatka notatka = notatki.get(i);
			notatka.getTytulAndTresc();
			notatka.diagnostic();
		}
	}

}
