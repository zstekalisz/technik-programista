package pl.kalisz.zste;

import java.util.Scanner;

public class NaDwojke {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Wpisz cokolwiek w konsoli");
		String zawartoscKonsoli = scanner.nextLine();
		System.out.println(zawartoscKonsoli);
		scanner.close();
	}

}
