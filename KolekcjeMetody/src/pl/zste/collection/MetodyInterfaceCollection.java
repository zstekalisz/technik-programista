package pl.zste.collection;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class MetodyInterfaceCollection {

	public static void main(String[] args) {
		String kalisz = "Kalisz";
		ArrayList<String> listaMiast = new ArrayList<String>();
		listaMiast.add("Gdańsk");
		boolean addKrakow = listaMiast.add(new String("Kraków"));
		listaMiast.add(kalisz);
		System.out.println(addKrakow ? "Kraków został dodany":"Kraków nie został dodany");
		//listaMiast.add(new Integer(12)); metoda add doda tylko typ zgodny z generykiem listaMiast
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Wrocław", "Łódź", "Bydgoszcz"));
		ArrayList<Integer> arrayListLiczby = new ArrayList<>(Arrays.asList(1, 2, 3));
		boolean addAll = listaMiast.addAll(arrayList);
		//listaMiast.addAll(arrayListLiczby); błąd typu generycznego
		System.out.println(addAll? "Kolekcja dodana":"Kolekcja niedodana");
		System.out.println(arrayList.size());
		arrayList.clear();
		System.out.println(arrayList.size());
		System.out.println(listaMiast.contains(kalisz));
		System.out.println(listaMiast.contains("Kalisz"));
		System.out.println(listaMiast.contains(new String("Kalisz")));
		boolean b = listaMiast.containsAll(arrayListLiczby);
		System.out.println(b);
		System.out.println(listaMiast);
		ArrayList<String> listaMiastKopia = new ArrayList<>(Arrays.asList("Gdańsk", "Kraków", "Kalisz", "Wrocław", "Łódź", "Bydgoszcz"));
		boolean equals = listaMiast.equals(listaMiastKopia);
		System.out.println(equals ? "Identyczne": "Nieidentyczne");
	}

}
