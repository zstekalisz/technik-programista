package pl.zste.stream.cwiczenia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
		
		//wypisz przy pomocy Api strumieni autorów książek
		ksiazki.stream().map(k-> k.getAutor()).forEach(a-> System.out.println(a));
		
		

	}

}
