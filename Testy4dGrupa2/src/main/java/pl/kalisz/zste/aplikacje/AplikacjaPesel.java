package pl.kalisz.zste.aplikacje;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import pl.kalisz.zste.konsola.NumberUtils;

public class AplikacjaPesel {

	// test dla peselu 12345678903
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj mi numer PESEL do weryfikacji :");
		String peselString = scanner.nextLine();
		while (peselString.length()!=11) {
			System.out.println("Wpisz poprawny numer PESEL - długość 11 cyfr");
			System.out.print("Podaj mi numer PESEL do weryfikacji :");
			peselString = scanner.nextLine();
			
		}
		int[] numbersPattern = {1,2,3,4,5,6,7,8,9,0}; 
		List<String> lettersPattern  = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0");
		String[] letters = peselString.split("");
		int[] pesel = new int[11];
		boolean noError = true;
		for(int i = 0; i< letters.length; i++) {
			boolean contains = lettersPattern.contains(letters[i]);
			if(!contains) {
				System.out.println("W peselu jest coś więcej niż cyfry.");
				noError = false;
				break;
			}
			int indexOf = lettersPattern.indexOf(letters[i]);
			pesel[i] = numbersPattern[indexOf];
		}
		if(noError) {
			char plec = NumberUtils.sprawdzeniePlci(pesel);
			boolean isOkay = NumberUtils.sprawdzenieSumyKontrolnej(pesel);
			System.out.println("Jest to numer PESEL :");
			if(plec == 'K') {
				System.out.println("Kobiety.");
			}else {
				System.out.println("Mężczyzny.");
			}
			System.out.println("Suma kontrolna jest "+ (isOkay ? "poprawna" : "niepoprawna"));
		}
		
		scanner.close();
	}

}
