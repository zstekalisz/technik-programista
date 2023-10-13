package pl.zste.console;

import java.util.Scanner;

import pl.zste.utils.StatycznaBazaOsob;

public class KonsolaOsoby {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aplikacja zbierająca dane o osobach");
		while(true) {
			System.out.print("Podaj imię");
			String imie = scanner.nextLine();
			if(imie.equals("exit")) {
				break;
			}
			if(imie.equals("ile")) {
				StatycznaBazaOsob.wyswietlLiczbeOsob();
			}
			//TODO dopisać wszyscy - metoda wyświetl wszystkich
			//TODO dopisać dodawanie osób do bazy statycznej
			
		}
		
		
		
		scanner.close();
		System.out.println("Koniec programu");
	}

}
