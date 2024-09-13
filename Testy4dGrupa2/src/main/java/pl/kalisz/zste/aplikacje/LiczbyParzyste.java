package pl.kalisz.zste.aplikacje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.kalisz.zste.konsola.NumberUtils;

public class LiczbyParzyste {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> arrayList = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) {
			System.out.println("Podaj liczbę całkowitą :");
			if(scanner.hasNextInt()) {
				Integer nextLine = scanner.nextInt();
				arrayList.add(nextLine);
				System.out.println("Wpisałeś "+ nextLine);
			}else {
				System.out.println("Wpisujesz śmieci");
				scanner.next();
			}
			
		}
		List<Integer> evenOnly = NumberUtils.getEvenOnly(arrayList);
		System.out.println("Parzyste liczby wpisane przez użytkownika to :");
		evenOnly.forEach(
				liczba-> System.out.print(liczba + ", "));
		
		System.out.println("Koniec programu");
		scanner.close();

	}

}
