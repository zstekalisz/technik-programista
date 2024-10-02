package pl.zste.konsola.app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class KostkaApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int liczbaKostek = 0;
		while (liczbaKostek < 3 || liczbaKostek > 10) {
			System.out.println("Ile kostek chcesz rzucic? (3-10)");
			if (scanner.hasNextInt()) {
				liczbaKostek = scanner.nextInt();

			} else {
				System.out.println("Wpisujesz błędne dane");
				scanner.next();
			}
		}
		String progress = "t";
		while (Objects.equals("t", progress)) {
			List<Integer> kostki = rzutKostkami(liczbaKostek);
			for (int i = 0; i < kostki.size(); i++) {
				System.out.println("Kostka " + (i + 1) + ": " + kostki.get(i));
			}
			int sumaPunktow = sumaPunktow(kostki);
			System.out.println("Liczba uzyskanych punktów : " + sumaPunktow);
			System.out.print("Jeszcze raz? (t/n)");
			progress = scanner.next();
			
		}

		scanner.close();
	}

	/**
	 * nazwa metody : rzutKostkami
	 * opis metody : metoda ma za zadanie wykonać symulację rzutu kostek podaną w parametrze liczbę razy
	 * @param liczbaKostek - ile razy wykona się rzut koskami
	 * @return zwraca listę wylosowanych oczek, lista posiada tyle elementów ile 
	 * wynosiła wartość parametru liczbaKostek
	 * @author Radek
	 */
	public static List<Integer> rzutKostkami(int liczbaKostek) {
		List<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < liczbaKostek; i++) {
			Integer random = (int) ((Math.random() * 100) % 6) + 1;
			arrayList.add(random);
		}
		return arrayList;
	}
	/**
	 * nazwa metody : sumaPunktow
	 * opis metody : metoda zlicza wylosowane oczka na kostkach, bierze po uwagę tylko wartości 
	 * powtarzające się Przykład : 4, 4, 1, 2, 3 - > metoda zwróci 8 bo tylko 4 powtarza się 2 razy
	 * Przykłąd 2 : 3, 3, 1, 1, 1 , 5 -> metoda zwróci 9 ponieważ 3 powtarza się 2 razy co daje 6 
	 * i jedynka powtarza się 3 razy co daje 3, suma 6 i 3 daje 9.
	 * @param wylosowane - symulowane oczka na kostkach do gry
	 * @return suma oczek powtarzających się
	 * @author Radek
	 */
	public static int sumaPunktow(List<Integer> wylosowane) {
		int sumaPunktow = 0;
		while (!wylosowane.isEmpty()) {
			Iterator<Integer> iterator = wylosowane.iterator();
			Integer pierwszy = wylosowane.get(0);
			int index = 0;
			boolean powtorzenie = false;
			while (iterator.hasNext()) {
				Integer next = iterator.next();
				if (index == 0) {
					iterator.remove();
					index++;
					continue;
				} else {
					if (Objects.equals(pierwszy, next)) {
						powtorzenie = true;
						sumaPunktow += next;
						iterator.remove();
					}
				}
			}
			if (powtorzenie) {
				sumaPunktow += pierwszy;
			}
		}
		return sumaPunktow;

	}
	/**
	 * nazwa metody : sumaPunktow
	 * opis metody : metoda zlicza wylosowane oczka na kostkach, bierze po uwagę tylko wartości 
	 * powtarzające się Przykład : 4, 4, 1, 2, 3 - > metoda zwróci 8 bo tylko 4 powtarza się 2 razy
	 * Przykłąd 2 : 3, 3, 1, 1, 1 , 5 -> metoda zwróci 9 ponieważ 3 powtarza się 2 razy co daje 6 
	 * i jedynka powtarza się 3 razy co daje 3, suma 6 i 3 daje 9.
	 * @param wylosowane - symulowane oczka na kostkach do gry
	 * @return suma oczek powtarzających się
	 * @author Radek
	 */
	public static int sumaPunktow2(List<Integer> wylosowane) {
		int sumaPkt = 0;
		for(int i = 1; i<=6; i++) {
			int licznik = 0;
			for(Integer wylosowana : wylosowane) {
				if(wylosowana == i) {
					licznik++;
				}
			}
			if(licznik>1) {
				sumaPkt =  sumaPkt + (i*licznik);
			}
		}
		return sumaPkt;
	}

}
