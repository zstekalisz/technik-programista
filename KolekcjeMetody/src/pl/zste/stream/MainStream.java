package pl.zste.stream;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {

	public static void main(String[] args) {
		Ksiazka ks1 = new Ksiazka("Nieboska komedia", "Wolne lektury");
		Ksiazka ks2 = new Ksiazka("Lalka", "Biblioteka Narodowa");
		Ksiazka ks3 = new Ksiazka("Wesele", "Wolne lektury");
		Ksiazka ks4 = new Ksiazka("Pan Tadeusz", "Wydawnictwo szkolne");
		Ksiazka ks5 = new Ksiazka("Kruk", "Detektyw");
		Ksiazka ks6 = new Ksiazka("Niezbędnik gracza Pokemon Go", "Marcin Dubiel");
		
		Uczen u1 = new Uczen("Marcin", "Marciniak", Color.BLUE, 23);
		Uczen u2 = new Uczen("Magda", "Marciniak", Color.GRAY, 33);
		Uczen u3 = new Uczen("Henryk", "Nowacki", Color.GRAY, 29);
		Uczen u4 = new Uczen("Zbigniew", "Nowicki", Color.BLUE, 88);
		Uczen u5 = new Uczen("Agata", "Kowalska", Color.BLUE, 90);
		Uczen u6 = new Uczen("Sylwia", "Kowalewska", Color.GRAY, 100);
		Uczen u8 = new Uczen("Stanisław", "Włodarczyk", Color.BLUE, 2);
		Uczen u9 = new Uczen("Michał", "Kuświk", Color.GRAY, 1);
		Uczen u10 = new Uczen("Andrzej", "Jankowski", Color.BLUE, 44);
		u5.getKsiazki().add(ks1);
		u5.getKsiazki().add(ks2);
		u8.getKsiazki().add(ks6);
		u8.getKsiazki().add(ks5);
		u9.getKsiazki().add(ks3);
		u1.getKsiazki().add(ks4);
		
		List<Uczen> listaUczniow = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u8,u9,u10));
		long count = listaUczniow.stream().count();
		System.out.println("to coś to jest lista.size() "+count );
		Predicate<Uczen> pr1 = u-> u.getKolorOczu().equals(Color.BLUE);
		
		Predicate<Uczen> pr2 = new Predicate<Uczen>() {
			@Override
			public boolean test(Uczen t) {
				return t.getNazwisko().startsWith("K");
			}
		};
		long liczbaUczniowZNiebieskimiOczami = listaUczniow.stream().filter(pr1).count();
		long liczbaUczniowZSzarymiOczami = listaUczniow.stream()
				.filter(u-> u.getKolorOczu().equals(Color.GRAY))
				.count();
		System.out.println("Mam "+liczbaUczniowZNiebieskimiOczami+ " uczniów o niebieskich oczach");
		System.out.println("Mam "+liczbaUczniowZSzarymiOczami+ " uczniów o szarych oczach");
		List<Uczen> listaUczniowNiebieskieOczy = listaUczniow.stream().filter(pr1).distinct().collect(Collectors.toList());
		Set<Uczen> zbiorUczniowSzareOczy= listaUczniow.stream().filter(u-> u.getKolorOczu().equals(Color.GRAY)).collect(Collectors.toSet());
		List<Ksiazka> listaWszystkichKsiazekPosiadanychPrzezUczniow   = listaUczniow.stream()
				.map(u-> u.getKsiazki())//
				.flatMap(t-> t.stream())//
				.collect(Collectors.toList());
		List<Color> list = listaUczniow.stream()
				.map(u->u.getKolorOczu())//
				.distinct()//
				.collect(Collectors.toList());
		System.out.println(list.size());
		
		Comparator<Uczen> comp = (a,b)->{
			int wiekA = a.getWiek();
			int wiekB = b.getWiek();
			if(wiekA==wiekB) return 0;
			else if(wiekA>wiekB){
				return 1;
			}else return -1;
		};
		
		Optional<Uczen> max = listaUczniow.stream().max(comp);
		if(max.isPresent()) {
			int najstarszy = max.get().getWiek();
			System.out.println(najstarszy);
		}
		Uczen uczen = listaUczniow.stream().min(comp).orElseThrow(()->new NullPointerException("Uczeń jest nullem"));
		System.out.println(uczen.getWiek());
		Integer reduce = listaUczniow.stream().map(u->u.getWiek()).reduce(0, (a,b)-> a+b);
		System.out.println(reduce);
		boolean allMatch = listaUczniow.stream().allMatch(u->u.getWiek()>50);
		System.out.println(allMatch);
		boolean anyMatch = listaUczniow.stream().anyMatch(u-> u.getKolorOczu().equals(Color.BLUE));
	}

}
