package pl.kalisz.zste.aplikacje;

import java.io.InputStream;
import java.util.Scanner;

public class OdczytZPliku {

	public static void main(String[] args) {
		//otwarcie pliku
		Class<OdczytZPliku> c = OdczytZPliku.class;
		InputStream inputStream = c.getClassLoader().getResourceAsStream("liczby2.txt");
		
		//mówię scannerowi, żeby czytał po inputstream z pliku
		Scanner sc =  new Scanner(inputStream);
		
		//wyciągam całą linijkę z pliku
		String line = sc.nextLine();
		
		//dzielę linijkę na tablicę stringów - dzielnikiem jest przecinek ','
		String[] split = line.split(",");
		
		//deklaruję pustą tablicę 
		int[] numbers = new int[split.length];
		
		//wypełniam tablicę int-ami zamieniając staring na inta 
		for(int i = 0; i < split.length; i++) {
			numbers[i] = Integer.parseInt(split[i]);
		}
		//wypisuję zawartość tablicy z numerami w konsoli
		for(int i = 0; i< numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.print(" ");
		}
		
		sc.close();
		

	}

}
