package pl.zste.list.cwiczenia.gr1;

import java.util.ArrayList;
import java.util.List;

public class MainCwiczenia {

	public static void main(String[] args) {
		Napoj redbull = new Napoj("Redbull GMBH", "Redbull", 5.99);
		Napoj fanta = new Napoj("CocaCola", "Fanta", 9.59);
		Napoj cytrynki = new Napoj("Zbyszko", "3Cytryny", 7.00);
		Napoj herbata = new Napoj("PepsiCo", "Lipton IceTea", 5.99);
		List<Napoj> napoje = new ArrayList<Napoj>();
		napoje.add(redbull); // na indeksie 0 wyladował redbull
		napoje.add(0, fanta); //fanta zajmuje indeks 0 natomiast pozostałe elementy kolekcji są wypychane do przodu
		napoje.add(cytrynki);
		System.out.println(napoje);
		napoje.sort(Napoj.porownaniePoCenie);
		System.out.println(napoje);
		napoje.sort(Napoj.porownaniePoNazwie.reversed());
		System.out.println(napoje);
		napoje.add(1, herbata);
		System.out.println(napoje);
		napoje.sort(Napoj.porownaniePoNazwie);
		System.out.println(napoje);
	}

}
