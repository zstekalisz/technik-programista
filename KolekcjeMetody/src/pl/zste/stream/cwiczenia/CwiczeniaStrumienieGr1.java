package pl.zste.stream.cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CwiczeniaStrumienieGr1 {

	public static void main(String[] args) {
		Rezyser r1 = new Rezyser("James", "Cameron");
		Rezyser r2 = new Rezyser("Andrzej", "Wajda");
		Rezyser r3 = new Rezyser("Stanisław", "Bareja");
		Rezyser r4 = new Rezyser("Patryk", "Vega");
		
		Film titanic = new Film(r1, "Titanic", GatunekFilmu.przygodowy, 160);
		Film katyn = new Film(r2, "Katyń", GatunekFilmu.dramat, 90);
		Film mis = new Film(r3, "Miś", GatunekFilmu.komedia, 90);
		Film mafia = new Film(r4, "Kobiety mafii", GatunekFilmu.sensacyjny, 90);
		Film terminator = new Film(r1, "Terminator", GatunekFilmu.sensacyjny, 120);
		
		Recenzja re1 = new Recenzja(1, "Za długi, nudny");
		Recenzja re2 = new Recenzja(1, "Nie lubię, taki se");
		Recenzja re3 = new Recenzja(6, "Mega mocny, polecam");
		Recenzja re4 = new Recenzja(3, "Nie widziałem ale tytuł jest spoko");
		Recenzja re5 = new Recenzja(5, "Tylko belfra ten film cieszy");
		Recenzja re6 = new Recenzja(6, "Jest mocny");
		Recenzja re7 = new Recenzja(5, "Fajne laski");
		Recenzja re8 = new Recenzja(6, "Dobre teksty i bluzgi");
		Recenzja re9 = new Recenzja(1, "Za szybko miś się kończy");
		
		titanic.getRecenzje().add(re1);
		titanic.getRecenzje().add(re2);
		katyn.getRecenzje().add(re3);
		katyn.getRecenzje().add(re4);
		mis.getRecenzje().add(re5);
		mis.getRecenzje().add(re9);
		mafia.getRecenzje().add(re6);
		mafia.getRecenzje().add(re7);
		mafia.getRecenzje().add(re8);
		
		List<Film> filmy= new ArrayList<Film>();
		filmy.add(titanic);
		filmy.add(katyn);
		filmy.add(mis);
		filmy.add(mafia);
		filmy.add(terminator);
		
		//wypisz przy pomocy api strumieni wszystkich reżyserów filmów z kolekcji filmy
		filmy.stream().map(f-> f.getRezyser()).forEach(r-> System.out.println(r));
		
		//pogrupuj filmy do mapy według rezysera (reżyser - lista filmów)
		Map<Rezyser, List<Film>> mapa = filmy.stream().collect(Collectors.groupingBy(f-> f.getRezyser()));
		Map<Rezyser, List<Film>> map2 = filmy.stream().collect(Collectors.groupingBy(Film::getRezyser));// to jest to samo co linia powyżej tylko inne wyrażenie lambda
		mapa.forEach((r, lista)->{
			System.out.println(r);
			lista.forEach(f-> System.out.println(f));
		});
		
		//pogrupuj filmy po gatunku filmy (gatunek, lista filmów)
		Map<GatunekFilmu, List<Film>> mapa3 = filmy.stream().collect(Collectors.groupingBy(f-> f.getGatunek()));
		mapa3.forEach((k,v)-> {
			System.out.println(k.name());
			v.forEach(f-> System.out.println(f));
		});
		
		//z listy filmów utwórz listę rezyserów
		List<Rezyser> rezyserzy = filmy.stream().map(f-> f.getRezyser()).collect(Collectors.toList());
		System.out.println("xxxxxxxxxxxxx");
		rezyserzy.forEach(r-> System.out.println(r));
		
		//z listy filmów utwórz listę rezyserów którzy mają na imię Andrzej
		List<Rezyser> rezyserzyAndrzeje = filmy.stream()
				.map(f-> f.getRezyser())
				.filter(r-> r.getImie().equals("Andrzej"))
				.collect(Collectors.toList());
		rezyserzyAndrzeje.forEach(r-> System.out.println(r));
		
		//sprawdz czy lista filmów zawiera filmy bez recenzji
		boolean czySaFilmyBezRecenzji = filmy.stream().anyMatch(f-> {
			return f.getRecenzje()!=null && f.getRecenzje().isEmpty() ;
		});
		String takNie = czySaFilmyBezRecenzji ? "Tak" : "Nie";
		System.out.println("Czy mamy filmy bez recenzji "+ takNie);
		
		//policz ile masz filmów sensacyjnych w liście filmów
		long sensacyjne = filmy.stream().filter(f-> f.getGatunek().equals(GatunekFilmu.sensacyjny)).count();
		System.out.println("Filmy sensacyjne sztuk :"+ sensacyjne);
		
		//powiedz ile wynosi czas trwania wszytskich filmów
		Optional<Integer> reduce = filmy.stream()
				.map(f-> f.getCzasTrwaniaWMinutach())
				.reduce((cz1, cz2)-> cz1+cz2);
		
		Integer reduce2 = filmy.stream()
				.map(f-> f.getCzasTrwaniaWMinutach())
				.reduce(0,(cz1, cz2)-> cz1+cz2);
		if(reduce.isPresent()) {
			System.out.println(reduce.get());
		}
		System.out.println(reduce2);
	}

}
