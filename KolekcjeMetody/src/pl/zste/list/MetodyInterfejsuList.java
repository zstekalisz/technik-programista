package pl.zste.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MetodyInterfejsuList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		list.add(2, 7);
		System.out.println(list);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(9);
		list2.add(10);
		list.addAll(1, list2);
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		System.out.println(list.get(1));
		System.out.println(list.indexOf(4));
		System.out.println(list.indexOf(5));
		list.add(1);
		System.out.println(list.indexOf(1));
		System.out.println(list.lastIndexOf(1));
		list.add(5, 10);
		System.out.println(list);
		System.out.println(list.indexOf(10));
		System.out.println(list.lastIndexOf(10));
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		ListIterator<Integer> iterator = list.listIterator(9);
		while(iterator.hasPrevious()) {
			Integer previous = iterator.previous();
			System.out.println(previous);
		}
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
		ListIterator<Integer> iterator2 = list.listIterator();
		while(iterator2.hasNext()) {
			Integer next = iterator2.next();
			System.out.println(next);
		}
		Integer deleted = list.remove(0);
		list.replaceAll(new UnaryOperator<Integer>() {
			
			@Override
			public Integer apply(Integer t) {
				return t*10;
			}
		});
		System.out.println(list);
		list.replaceAll(element->{
			return element/10;
		});
		list.replaceAll(element -> element*10);
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		list.forEach(el-> System.out.println(el));
		int sto = list.set(1, 200);//pierwszy parametr to index, drugi to element
		Ksiazka k1 = new Ksiazka("Test1", 123);
		Ksiazka k2 = new Ksiazka("Test2", 1);
		Ksiazka k3 = new Ksiazka("Test3", 56);
		Ksiazka k4 = new Ksiazka("Test4", 77);
		List<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
		ksiazki.add(k1);
		ksiazki.add(k2);
		ksiazki.add(k3);
		ksiazki.add(k4);
		System.out.println(ksiazki);
		ksiazki.sort(new Comparator<Ksiazka>() {
			@Override
			public int compare(Ksiazka o1, Ksiazka o2) {
				if(o1.liczbaStron== o2.liczbaStron) return 0;
				else if(o1.liczbaStron> o2.liczbaStron) return 1;
				else return -1;
			}
		});
		System.out.println(ksiazki);
		ksiazki.sort(new Comparator<Ksiazka>() {

			@Override
			public int compare(Ksiazka o1, Ksiazka o2) {
				return o1.compareTo(o2);
			}
		});
		System.out.println(ksiazki);
		ksiazki.sort((k1l, k2l)-> k1l.compareTo(k2l));
	}

	
}
