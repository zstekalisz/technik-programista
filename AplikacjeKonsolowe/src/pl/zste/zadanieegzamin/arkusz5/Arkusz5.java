package pl.zste.zadanieegzamin.arkusz5;

import java.util.Scanner;

public class Arkusz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Wpisz imię osoby :");
		String imie = sc.nextLine();
		Integer id= null;
		System.out.print("Wpisz id osoby :");
		if(sc.hasNextInt()) {
			id =sc.nextInt();
			Osoba osoba = new Osoba(id, imie);
			System.out.print("Wpisz swoje imię :");
			String imieDoPowitania = sc.next();
			osoba.wypiszImie(imieDoPowitania);
		}else {
			System.out.println("Nie utworzono osoby błędny id");
		}
		sc.close();

	}

}
