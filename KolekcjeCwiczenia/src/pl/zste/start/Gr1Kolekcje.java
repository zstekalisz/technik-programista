package pl.zste.start;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Gr1Kolekcje {

	public static void main(String[] args) {
		//utwórz trzy samochody marki Ford, Fiat i Mercedes
		Samochod samochod1 = new Samochod("Ford", "KPZ 7080");
		Samochod samochod2 = new Samochod("Fiat", "PK 89098");
		Samochod samochod3 = new Samochod("Mercedes", "DB 90876");
		//dodaj samochody do kolekcji
		Collection<Samochod> samochody = new ArrayList<Samochod>();
		samochody.add(samochod1);
		samochody.add(samochod2);
		samochody.add(samochod3);
		//używając iteratora wypisz w konsoli dane każdego samochodu
		Iterator<Samochod> iterator = samochody.iterator();
		while(iterator.hasNext()) {
			Samochod nextSamochod = iterator.next();
			System.out.println("Marka samochodu to :"+nextSamochod.getMarka());
			System.out.println("Numer rejestracyjny samochodu to :"+ nextSamochod.getNrRej());
		}
		
		//sprawdzając markę każdego samochodu w kolekcji, w samochodzie marki Fiat 
		//zmień numer rejestracyjny na PKA 00123
		Iterator<Samochod> iterator2 = samochody.iterator();
		while(iterator2.hasNext()) {
			Samochod next = iterator2.next();
			if(next.getMarka().equals("Fiat")) {
				next.setNrRej("PKA 00123");
			}
		}
		for(Samochod s : samochody) {
			System.out.println(s.getNrRej());
		}
		System.out.println(samochody.contains(samochod2));
		Samochod samochod4 = new Samochod("Fiat", "PKA 00123");
		System.out.println(samochody.contains(samochod4));
		//usuń samochody marki Mercedes z kolekcji samochody
		samochody.removeIf(new Predicate<Samochod>() {

			@Override
			public boolean test(Samochod t) {
				if(t.getMarka().equals("Mercedes")) return true;
				return false;
			}
		});
		samochody.removeIf(s-> s.getMarka().equals("Mercedes"));
		System.out.println(samochody.size());
		Collection<Samochod> samochodyMerc = new ArrayList<Samochod>();
		samochodyMerc.add(samochod3);
		samochody.retainAll(samochodyMerc);
		System.out.println(samochody.isEmpty());
		samochody.add(samochod3);
		samochody.add(samochod2);
		samochody.removeAll(samochodyMerc);
		for(Samochod s : samochody) {
			System.out.println(s.getMarka());
		}
	}

}
