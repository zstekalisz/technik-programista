package pl.zste.poprawaspr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Ksiazka Java Rusz głową strona 553 - rozdział kolekcje i struktury danych

public class ZadaniePrzykladowe {

	public static void main(String[] args) {
		//1.	Utwórz  program, a w nim stwórz kolekcję sparametryzowaną na (Integer) 
		//składającą się z liczb 1,2,3,4,5,6,7,8,9.
		//Przy użyciu iteratora oraz pętli wypisz wartość każdego z elementów kolekcji w konsoli
		Collection<Integer> list = new ArrayList<Integer>();//tworzymy obiekt kolekcji
		for(int i =1; i<10; i++) {
			list.add(i); // wypełniamy danymi 1,2,3 itd
		}
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {// sprawdzamy czy iterator ma kolejną wartość do iteracji - pętla tak długo działa jak metoda hasnext zwraca true
			Integer liczba = iterator.next();
			System.out.println(liczba);
		}
		
		//2.	Utwórz program a w nim stwórz pierwszą kolekcję sparametryzowaną na (Integer)
		//składającą się z liczb : 1, 18, 25, 8, 36, 89, 29, 90, 77, 2 . 
		//Następnie stwórz drugą, podobną do tej pierwszej, kolekcję składającą 
		//się z liczb 8, 77, 89, 2, 90, 29, 36, 18, 25. 
		//Używając jednej z poznanych metod, usuń z pierwszej kolekcji wszystkie elementy, 
		//które nie zawierają się w drugiej kolekcji. Przy użyciu iteratora i pętli, 
		//przejdź po elementach i usuń liczby parzyste z pierwszej kolekcji. 
		//Przy użyciu iteratora i pętli  przejdź po elementach i usuń 
		//liczby nieparzyste z drugiej kolekcji. (Zadanie na 4 pkt.)
		
		Collection<Integer> first = new ArrayList<Integer>();//tworzymy obiekt kolekcji
		first.add(1);
		first.add(18);
		first.add(25);
		first.add(8);
		first.add(36);
		first.add(89);
		first.add(29);
		first.add(90);
		first.add(77);
		first.add(2);
		
		Collection<Integer> second = new ArrayList<Integer>();//tworzymy obiekt kolekcji
		second.add(8);
		second.add(77);
		second.add(89);
		second.add(2);
		second.add(90);
		second.add(29);
		second.add(36);
		second.add(18);
		second.add(25);
		first.retainAll(second); // usuwamy z first elementy które nie zawierają się w second
		
		Iterator<Integer> secIterator = first.iterator();
		while(secIterator.hasNext()) {
			int number = secIterator.next();
			if(number%2==0) {
				secIterator.remove();
			}
		}
		Iterator<Integer> thirdIterator = second.iterator();
		while(thirdIterator.hasNext()) {
			int number = thirdIterator.next();
			if(number%2!=0) {
				thirdIterator.remove();
			}
		}
		
	}

}
