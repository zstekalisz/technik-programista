package pl.zste.start;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class Gr2Kolekcje {

	public static void main(String[] args) {
		//utworzyć 3 telewizory
		Telewizor telewizor1 = new Telewizor("LG", 49);
		Telewizor telewizor2 = new Telewizor("Sony", 60);
		Telewizor telewizor3 = new Telewizor("Manta", 55);
		
		//dodać telewizory do kolekcji
		Collection<Telewizor> telewizory = new ArrayList<Telewizor>();
		telewizory.add(telewizor1);
		telewizory.add(telewizor2);
		telewizory.add(telewizor3);
		
		//utworzyć iterator i wypisać dane wszystkich telewizorów
		Iterator<Telewizor> iterator = telewizory.iterator();
		while(iterator.hasNext()) {
			Telewizor telewizor = iterator.next();
			System.out.println("Marka telewizora : "+telewizor.getMarka());
			System.out.println("Przekątna ekranu : "+ telewizor.getPrzekatnaEkranu());
		}
		
		//każdy telewizor o marce Manta zmienić przekątną na 70 cali
		Iterator<Telewizor> iterator2 = telewizory.iterator();
		while(iterator2.hasNext()) {
			Telewizor telewizor = iterator2.next();
			if(telewizor.getMarka().equals("Manta")) {
				telewizor.setPrzekatnaEkranu(70);
			}
		}
		for(Telewizor t : telewizory) {
			System.out.println("Marka "+t.getMarka()+ " przekątna "+ t.getPrzekatnaEkranu());
		}
		//usuń wszystkie telewizory Sony z kolekcji telewizory
		telewizory.removeIf(new Predicate<Telewizor>() {

			@Override
			public boolean test(Telewizor t) {
				if(t.getMarka().equals("Sony")) return true;
				return false;
			}
		});
		for(Telewizor t : telewizory) {
			System.out.println("Marka "+t.getMarka()+ " przekątna "+ t.getPrzekatnaEkranu());
		}
		System.out.println(telewizory.size());
		System.out.println(telewizory.contains(telewizor2));
		System.out.println(telewizory.contains(new Telewizor("Manta", 70)));
		System.out.println(telewizory.contains(telewizor3));
		ArrayList<Telewizor> drugaPartiaTelewizorow = new ArrayList<Telewizor>();
		drugaPartiaTelewizorow.add(telewizor2);
		telewizory.retainAll(drugaPartiaTelewizorow);
		System.out.println(telewizory.isEmpty());
		
	}

}
