package pl.kalisz.zste.egzamin.konsola;

import java.util.Scanner;

public class ProgramGłowny {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		WashingMachine machine = new WashingMachine();
		Vacum vacum = new Vacum();
		System.out.print("Podaj numer programu 1..12:");
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()) {
			int programOption = scanner.nextInt();
			int result = machine.setProgramOption(programOption);
			if(result!=0) {
				machine.showMessage("Program został ustawiony");
			}else {
				machine.showMessage("Podano niepoprawny numer programu");
			}
		}
		vacum.on();
		vacum.on();
		vacum.on();
		vacum.showMessage("Odkurzacz wyładował się");
		vacum.off();
		

	}

}
