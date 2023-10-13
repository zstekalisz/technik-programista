package pl.zste.utils;

import java.util.ArrayList;
import java.util.List;

import pl.zste.osoby.Osoba;

public class StatycznaBazaOsob {
	
	private static List<Osoba> osoby = new ArrayList<Osoba>();
	private static int id = 0;
	
	public static void dodajOsobe(Osoba osoba) {
		osoby.add(osoba);
		id++;
	}
	
	public static void wyswietlLiczbeOsob() {
		System.out.println("Liczba osób w bazie wynosi "+osoby.size());
	}
	
	public static void wypiszOsobyWKonsoli() {
//		for(int i = 0; i< osoby.size(); i++) {
//			System.out.println(osoby.get(i));
//		}
//		for(Osoba os : osoby) {
//			System.out.println(os);
//		}
		osoby.forEach(o-> System.out.println(o));
	}
	public static int getCurrentId() {
		return id +1;
	}

}
