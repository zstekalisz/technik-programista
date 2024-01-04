package pl.zste.collection.gr1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class MetodyZInterfaceCollection {
	public static void main(String[] args) {
		Collection<Number> c = new ArrayList<Number>();
		c.add(1);
		Collection<Long> cLong = new ArrayList<Long>();
		Collection<String> cS = new ArrayList<String>();
		cLong.add(2L);
		cLong.add(3L);
		c.addAll(cLong);
		//c.addAll(cS);//błąd nie mogę takiej operacji wykonać
		System.out.println(c.isEmpty() ? "Pusta": "Niepusta");
		System.out.println("kolekcja c ma rozmiar "+ c.size());
		System.out.println(cLong.size());
		cLong.clear();
		System.out.println(cLong.size());
		System.out.println(c.contains(1) ? "Zawiera 1" : "Nie zawiera 1" );
		System.out.println(c.contains(2) ? "Zawiera 2" : "Nie zawiera 2" );
		System.out.println(c.contains(2L) ? "Zawiera 2" : "Nie zawiera 2" );
		System.out.println(c.contains("aaa") ? "Zawiera aaa" : "Nie zawiera aaa" );
		Collection<Number> c1 = new ArrayList<Number>();
		Integer jeden = 1;
		c1.add(1);
		c1.add(2L);
		c1.add(3L);
		System.out.println(c.containsAll(c1)?"Zawiera całą kolekcję" : "Nie zawira całej kolekcji");
		c.remove(jeden);
		System.out.println(c.size());
		c.removeAll(c1);
		System.out.println(c.size());
		
		Collection<String> listOfNames = new ArrayList<String>();
		listOfNames.add("Karol");
		listOfNames.add("Iwona");
		String imie = "Agnieszka";
		listOfNames.add(imie);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Jan");
		names.add("Agnieszka");
		names.add("Piotr");
		
		//listOfNames.retainAll(names);
		System.out.println(listOfNames.size());
		
		names.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				if(t.length()>5)return true;
				return false;
			}
		});
		names.removeIf((name)->{
			if(name.length()>5)return true;
			return false;
		});
		
		names.removeIf((n)-> n.length()>5 ? true : false);
		
		System.out.println(names.size());
		
		Iterator<String> iterator = listOfNames.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			if(name.equals("Karol")) iterator.remove();
		}
		System.out.println(listOfNames.size());
		
//		String x = "abc";
//		String y = "abc";
//		String z = new String("abc");
//		boolean z1 = x==y;
//		boolean z2 = z==y;
		System.out.println(c1.size());
		
		c1.removeIf(new Predicate<Number>() {

			@Override
			public boolean test(Number num) {
				if(num.intValue()%2==0) return true;
				return false;
			}
		});
		c1.removeIf((num)-> num.intValue()%2==0 ? true : false);
		System.out.println(c1.size());
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
