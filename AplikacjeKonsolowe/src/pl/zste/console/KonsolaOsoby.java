package pl.zste.console;

import java.util.Scanner;

import pl.zste.utils.StatycznaBazaOsob;

public class KonsolaOsoby {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Aplikacja zbierająca dane o osobach");
		while(true) {
			System.out.print("Podaj imię:");
			String imie = scanner.nextLine();
			if(imie.equals("exit")) {
				break;
			}else if(imie.equals("ile")) {
				StatycznaBazaOsob.wyswietlLiczbeOsob();
				continue;
			}else if(imie.equals("wszyscy")) {
				StatycznaBazaOsob.wypiszOsobyWKonsoli();
				continue;
			}
			System.out.print("Podaj nazwisko:");
			//TODO dopisać wszyscy - metoda wyświetl wszystkich
			//TODO dopisać dodawanie osób do bazy statycznej
			
		}
		
		
		
		scanner.close();
		System.out.println("Koniec programu");
	}

}
