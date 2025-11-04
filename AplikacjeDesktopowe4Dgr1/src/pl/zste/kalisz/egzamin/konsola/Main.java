package pl.zste.kalisz.egzamin.konsola;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pralka pralka = new Pralka();
		Odkurzacz odkurzacz = new Odkurzacz();
		System.out.println("Podaj numer prania 1..12");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			int numerPraniaFromGUI = sc.nextInt();
			int numerProgramu = pralka.setNumerProgramu(numerPraniaFromGUI);
			if (numerProgramu != 0) {
				pralka.wypiszKomunikat("Program został ustawiony");
			} else {
				pralka.wypiszKomunikat("Podano niepoprawny numer programu");
			}
		}
		odkurzacz.on();
		odkurzacz.on();
		odkurzacz.on();
		odkurzacz.wypiszKomunikat("Odkurzacz wyładował się");
		odkurzacz.off();

	}

}
