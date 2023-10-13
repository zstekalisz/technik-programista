package pl.zste.console;


import java.util.Scanner;

public class PobranieImieniaZKonsoli {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Podaj mi swoje imię :");			
			String imie = scanner.nextLine();
			if(imie.equals("exit")) {
				//Objects.equals(imie, "exit"); nullo odporna metoda porównująca 2 obiekty
				break;
			}
			System.out.println("Wpisałeś: " + imie);
		}
		scanner.close();
		System.out.println("Koniec programu");
	}

}
