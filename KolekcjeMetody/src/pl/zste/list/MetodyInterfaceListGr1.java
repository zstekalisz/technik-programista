package pl.zste.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MetodyInterfaceListGr1 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.add(1 ,7);
		System.out.println(list);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(9);
		list2.add(10);
		
		list.addAll(2,list2);
		System.out.println(list);
		Integer dziesiec = list.get(3);
		System.out.println(dziesiec);
		//list.get(1000);
		System.out.println(list.indexOf(2));
		list.add(2, 4);
		System.out.println(list);
		System.out.println(list.indexOf(4));
		System.out.println(list.lastIndexOf(4));
		list.add(4, 4);
		System.out.println(list);
		System.out.println(list.indexOf(4));
		System.out.println(list.lastIndexOf(4));
		System.out.println(list.size());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		ListIterator<Integer> iterator = list.listIterator(9);
		while(iterator.hasPrevious()) {
			Integer previous = iterator.previous();
			System.out.println(previous);
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		ListIterator<Integer> iterator2 = list.listIterator();
		while(iterator2.hasNext()) {
			Integer next = iterator2.next();
			System.out.println(next);
		}
		Integer remove = list.remove(2);
		//boolean remove2 = list.remove(new Integer(3));
		list.replaceAll(new UnaryOperator<Integer>() {		
			@Override
			public Integer apply(Integer t) {
				return t*10;
			}
		});
		System.out.println(list);
		list.replaceAll(element-> {
			return element/10;
		});
		System.out.println(list);
		list.replaceAll(e-> e*10);
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		});
		System.out.println("xxxxxxxxxxxxxxxxxxx");
		list.forEach(t-> System.out.println(t));
		Integer tuJestSto = list.set(4, 200);
		System.out.println(tuJestSto);
		System.out.println(list);
		
		List<Komputer> komputery = new ArrayList<Komputer>();
		Komputer k1 = new Komputer("DELL", 234576);
		Komputer k2 = new Komputer("HP", 876);
		Komputer k3 = new Komputer("Lenovo", 78876);
		komputery.add(k1);
		komputery.add(k2);
		komputery.add(k3);
		System.out.println(komputery);
		komputery.sort(new Comparator<Komputer>() {
			@Override
			public int compare(Komputer o1, Komputer o2) {
				if(o1.nrSeryjny == o2.nrSeryjny)
					return 0;
				else if(o1.nrSeryjny> o2.nrSeryjny)
					return 1;
				else return -1;
			}
		});
		System.out.println(komputery);
		
	}

}
