package pl.zste.stream.cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		
		//wypisz przy pomocy api strumieni wszystkich reżyserów filmów z kolekcji filmy
		filmy.stream().map(f-> f.getRezyser()).forEach(r-> System.out.println(r));

	}

}
