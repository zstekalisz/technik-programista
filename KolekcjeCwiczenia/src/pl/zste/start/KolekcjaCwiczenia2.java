package pl.zste.start;

import java.util.ArrayList;
import java.util.Iterator;

public class KolekcjaCwiczenia2 {
	
	public static void main(String[] arguments) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(16);
		list.add(123);
		list.add(77);
		list.add(44);
		list.add(89);
		list.add(22);
		list.add(13);
		list.add(91);
		System.out.println(list.toString());
//		for(int i = 0; i<list.size(); i++) {
//			if(list.get(i)%2==0) {
//				list.remove(i);
//			}
//		}
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			Integer nextNumberFromList = iterator.next();
			if(nextNumberFromList%2==0) {
				iterator.remove();
			}
		}
		System.out.println(list.toString());
		
		list.forEach((cos)-> System.out.println(cos));
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		list.forEach(el->{
			if(el>50) {
				System.out.println(el);
			}
		});
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		list.forEach(new ImplementacjaKonsumeraDlaInt());
		list.set(2, 15);
//		list.sort((a,b)->{
//			if(a>b) return 1;
//			else if(a==b) return 0;
//			else return -1;
//		});
		list.sort((a,b)-> a.compareTo(b)*-1);
		System.out.println(list.toString());
		
		ArrayList<Osoba> osoby = new ArrayList<Osoba>();
		osoby.add(new Osoba("Adam", "Zawadzki", 43));
		osoby.add(new Osoba("Barbara", "Wysocka", 12));
		osoby.add(new Osoba("Sebastian", "Zieliñski", 23));
		osoby.add(new Osoba("Agnieszka", "Adamek", 22));
		osoby.add(new Osoba("Szymon", "Bednarz", 24));
		osoby.add(new Osoba("Grzegorz", "Janik", 28));
		osoby.sort((osoba1, osoba2)->{
			return osoba1.compareTo(osoba2);
		});
		osoby.sort((a,b)->{
			return a.getImie().compareTo(b.getImie());
		});
		System.out.println(osoby.toString() );
	}

}
