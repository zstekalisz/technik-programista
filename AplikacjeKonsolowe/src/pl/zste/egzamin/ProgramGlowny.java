package pl.zste.egzamin;

import java.util.Scanner;

public class ProgramGlowny {

	public static void main(String[] args) {
		Pralka pralka = new Pralka();
		Odkurzacz odkurzacz = new Odkurzacz();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj numer prania 1..12");
		if(scanner.hasNextInt()) {
			int numerPrania = scanner.nextInt();
			int ustawiony = pralka.setNrProgramuPrania(numerPrania);
			if(ustawiony==0) {
				pralka.wypiszKomunikat("Podano niepoprawny numer programu prania");
			}else {
				pralka.wypiszKomunikat("Program został ustawiony");
			}
			
		}else {
			pralka.wypiszKomunikat("Podano niepoprawny numer programu prania");
		}
		odkurzacz.on();
		odkurzacz.on();
		odkurzacz.on();
		odkurzacz.wypiszKomunikat("Odkurzacz wyładował się");
		odkurzacz.off();
		scanner.close();
		
	}

}
