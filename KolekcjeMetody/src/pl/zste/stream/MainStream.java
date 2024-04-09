package pl.zste.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import pl.zste.queue.Butelka;

public class MainStream {

	public static void main(String[] args) {
		Butelka b1 = new Butelka(null, 5);
		Butelka b2 = new Butelka("PoloCola", 8);
		Butelka b3 = new Butelka("PepsiCola", 9);
		Butelka b4 = new Butelka("HoopCola", 5);
		Butelka b5 = new Butelka("RiverCola", 5);
		Butelka b6 = new Butelka("Cola3Cytryny", 8);
		Butelka b7 = new Butelka("Polokokta", 3);
		Butelka b8 = new Butelka("GreenCola", 1);
		Butelka b9 = new Butelka("NukaCola", 7);
		Butelka b10 = new Butelka("ClasicCola", 8);
		
		List<Butelka> butelki = new ArrayList<>();
		butelki.add(b1);
		butelki.add(b2);
		butelki.add(b3);
		butelki.add(b4);
		butelki.add(b5);
		butelki.add(b6);
		butelki.add(b7);
		butelki.add(b8);
		butelki.add(b9);
		butelki.add(b10);
		long count = butelki.stream()
				.filter(b-> b.priorytet.equals(3))
				.count();
		System.out.println(count);
		long count2 = butelki.stream()
				.filter(butelka-> butelka.priorytet.equals(5))
				.count();
		System.out.println(count2);
		long count3 = butelki.stream()
				.filter(b-> b.priorytet.equals(8))
				.filter(b-> b.nazwa.length()<=10)
				.count();
		List<Butelka> przefiltrowane = butelki.stream()
				.filter(b-> b.priorytet.equals(5))
				.collect(Collectors.toList());
		
		//grupowanie po właściwości obiektu
		//przykład grupowanie Butelek po priorytecie
		Map<Integer, List<Butelka>> map = butelki.stream().collect(Collectors.groupingBy(b-> b.priorytet));
		
		map.forEach((k, v)->{
			System.out.println("Dla priorytetu "+k);
			v.forEach(b-> System.out.println(b));
		});
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		Set<Entry<Integer, List<Butelka>>> entrySet = map.entrySet();
		for(Entry<Integer, List<Butelka>>entry : entrySet) {	
			System.out.println("Dla priorytetu :"+ entry.getKey());
			List<Butelka> list = entry.getValue();
			for(Butelka b : list) {
				System.out.println(b);
			}	
		}
		List<String> nazwyButelek = butelki.stream().map(b-> b.nazwa).filter(n-> n!=null).sorted().collect(Collectors.toList());
		nazwyButelek.forEach(naz-> System.out.println(naz));
		
		List<Integer> priorytety = butelki.stream()
				.map(b-> b.priorytet)
				.distinct()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		priorytety.forEach(prio-> System.out.println(prio));
		
		Optional<Integer> sumaPriorytetow = butelki.stream().map(b-> b.priorytet).reduce((a1, a2)-> a1+a2);
		if(sumaPriorytetow.isPresent()) {
			Integer suma = sumaPriorytetow.get();
			System.out.println(suma);
		}
		
		//sprawdz czy w butelkach znajduje się taka która nie ma nazwy
		long ileButelekMaPustaNazwe = butelki.stream().filter(b-> b.nazwa==null).count();
		if(ileButelekMaPustaNazwe>0) {
			System.out.println("Są butelki których nazwa jest pusta");
		}
		//to samo co powyżej tylko metoda any
		boolean anyMatchButelkiNazwaNull = butelki.stream().anyMatch(b-> b.nazwa==null);
		if(anyMatchButelkiNazwaNull) {
			System.out.println("Są butelki których nazwa jest pusta");
		}
		//wskaż liczbę butelek których priorytet jest większy od 5
		long liczbaButelekPrioWiekszePiec = butelki.stream().filter(b-> b.priorytet>5).count();
		
		//utwórz listę butelek których priorytet jest równy 5
		List<Butelka> butelkiPrio5 = butelki.stream().filter(b-> b.priorytet==5).collect(Collectors.toList());
		
		//utwórz listę butelek których priorytek jest <6 i których nazwa jest dłuższa od <9
		List<Butelka> butelkiList = butelki.stream()
				.filter(b->b.nazwa!=null)
				.filter(b-> b.priorytet<6 && b.nazwa.length()<9)
				.collect(Collectors.toList());
		//sprawdz czy wszystkie butelki mają priorytet większy od 0
		boolean czyPrioWiekszyZero = butelki.stream().allMatch(b-> b.priorytet>0);
		
		
	}

}
