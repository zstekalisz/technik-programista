package pl.zste.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapaCwiczenia {

	public static void main(String[] args) {
		Osoba o1 = new Osoba("Jan","Kowalski");
		Osoba o2 = new Osoba("Michał","Nowaczyk");
		Osoba o3 = new Osoba("Grażyna","Michalska");
		Osoba o4 = new Osoba("Dominika","Sudoł");
		Osoba o5 = new Osoba("Sylwia", "Kowalewska");
		Osoba o6 = new Osoba("Karol","Pruszczyński");
		
		List<Osoba> administracja = new ArrayList<>();
		administracja.add(o3);
		administracja.add(o4);
		
		List<Osoba> mechanicy = new ArrayList<>();
		mechanicy.add(o1);
		mechanicy.add(o2);
		
		ArrayList<Osoba> biuro = new ArrayList<>();
		biuro.add(o5);
		biuro.add(o6);
		
		Map<String, List<Osoba>> pracownicy = new HashMap<>();
		pracownicy.put("biurowi", biuro);
		pracownicy.put("administracyjni", administracja);
		pracownicy.put("hala mechanikow", mechanicy);

		
	}
	

}
