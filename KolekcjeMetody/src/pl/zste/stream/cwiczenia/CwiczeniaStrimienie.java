package pl.zste.stream.cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CwiczeniaStrimienie {

	public static void main(String[] args) {
		Autor mariaK = new Autor("Maria", "Konopnicka");
		Autor boleslawP = new Autor("Bolesław", "Prus");
		Autor adamM = new Autor("Adam", "Mickiewicz");
		Autor juliuszS = new Autor("Juliusz", "Słowacki");
		
		Ksiazka k1 = new Ksiazka(mariaK, "Wiersze", "Wydawnictwo patriotyczne", 100);
		Ksiazka k2 = new Ksiazka(boleslawP, "Lalka", "Lektury polskie", 850);
		Ksiazka k3 = new Ksiazka(adamM, "Dziady", "Wsip", 300);
		Ksiazka k4 = new Ksiazka(juliuszS, "Kordian", "Lektury polskie", 300);
		Ksiazka k5 = new Ksiazka(mariaK, "Oda", "Oda", 2);
		
		Opinia o1 = new Opinia("Polecam!!!", 6);
		Opinia o2 = new Opinia("Fajne, jest fajne fajne", 6);
		Opinia o3 = new Opinia("Nie polecam", 6);
		Opinia o4 = new Opinia("Ksiązki nie czytałem, ale film był git", 3);
		Opinia o5 = new Opinia("Filmu nie oglądałem ale ksiązka jest git", 1);
		Opinia o6 = new Opinia("Kordian był fajnym kolegą", 1);
		Opinia o7 = new Opinia("Nie czytałem ale sobię oceniam", 2);
		k1.getOpinie().add(o1);
		k2.getOpinie().add(o2);
		k2.getOpinie().add(o3);
		k3.getOpinie().add(o4);
		k3.getOpinie().add(o5);
		k4.getOpinie().add(o6);
		k4.getOpinie().add(o7);
		
		ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
		ksiazki.add(k1);
		ksiazki.add(k2);
		ksiazki.add(k3);
		ksiazki.add(k4);
		ksiazki.add(k5);
		
		//wypisz przy pomocy Api strumieni autorów książek
		ksiazki.stream().map(k-> k.getAutor()).forEach(a-> System.out.println(a));
		
		//stwórz obiekt mapy gdzie kluczem będzie ksiazka a wartością lista opinii
		Map<List<Opinia>, List<Ksiazka>> mapa = ksiazki.stream().collect(Collectors.groupingBy(k-> k.getOpinie()));
		ksiazki.stream().collect(Collectors.groupingBy(Ksiazka::getOpinie));//to samo tylko inne wyrazenie lambda
		mapa.forEach((k, v)-> System.out.println(k.size()+" "+v.size()));
		
		//pogrupuj książki w mapie, mające tych samych autorów
		Map<Autor, List<Ksiazka>> map2 = ksiazki.stream().collect(Collectors.groupingBy(k-> k.getAutor()));
		ksiazki.stream().collect(Collectors.groupingBy(Ksiazka::getAutor));// to samo co linia powyżej tylko inne wyrażenie lambda
		map2.forEach((autor,listaKsiazek)->{
			System.out.println(autor);
			listaKsiazek.forEach(ksiazka-> System.out.println(ksiazka));
		});
		
		//przefiltruj ksiązki żeby autor miał na imię Maria
		List<Ksiazka> ksiazkiMarii = ksiazki.stream().filter(k-> k.getAutor().getImie().equals("Maria")).collect(Collectors.toList());
		ksiazkiMarii.forEach(ks-> {
			System.out.println("XXXXXXXXXXXXXXXXXXXXX");
			System.out.println(ks);
		});
		
		//sprawdz czy w książkach istnieją książki bez opinii
		boolean czyOpinieSaPuste = ksiazki.stream().anyMatch(k->{
			return k.getOpinie()!=null && k.getOpinie().isEmpty() ;
		});
		
		String takNie = czyOpinieSaPuste ? "Tak" : "Nie";
		System.out.println("Istnieją książki z pustymi opiniami ? "+ takNie);
		
		//sprawdz czy wszystkie książki mają autora
		boolean czyWszystkieMajaAutora = ksiazki.stream().allMatch(k-> k.getAutor()!=null);
		System.out.println("Czy wszyskie książki mają autora : "+ czyWszystkieMajaAutora);
		
		// ile jest książek które mają opinie
		long count = ksiazki.stream().filter(k-> k.getOpinie()!=null && !k.getOpinie().isEmpty()).count();
		System.out.println("Książek z opiniami mamy :"+count);
		
		//policz i wypisz ile jest stron we wszystkich książkach (ile stron mają wszystkie kasiążki razem)
		Optional<Integer> reduce = ksiazki.stream().map(k-> k.getLiczbaStron()).reduce((l1, l2)-> l1+l2);
		Integer reduce2 = ksiazki.stream().map(k-> k.getLiczbaStron()).reduce(0, (l1, l2)-> l1+l2);
		if(reduce.isPresent()) {
			System.out.println(reduce.get());
		}
		System.out.println(reduce2);
	}

}

