package pl.kalisz.zste.aplikacje;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OdczytZpliku2 {

	public static void main(String[] args) {
		// otwarcie pliku
		Class<OdczytZPliku> c = OdczytZPliku.class;
		InputStream inputStream = c.getClassLoader().getResourceAsStream("liczby2.txt");

		// mówię scannerowi, żeby czytał po inputstream z pliku
		Scanner sc = new Scanner(inputStream);
		// mówię scannerowi, żeby ignorował przecinki ','
		sc.useDelimiter(",");
		
		//tworzę arraylistę i wrzucam do niej kolejne liczby
		List<Integer> numbers = new ArrayList<>();
		while(sc.hasNextInt()) {
			int nextInt = sc.nextInt();
			numbers.add(nextInt);
		}
		
		//wyświetlam zawartość listy w konsoli
		numbers.forEach(n-> {
			System.out.print(n);
			System.out.print(" ");
		});

	}

}
