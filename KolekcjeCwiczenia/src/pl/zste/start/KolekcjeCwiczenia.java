package pl.zste.start;

import java.util.ArrayList;

public class KolekcjeCwiczenia {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list.isEmpty());
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(20);
		list.add(99);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		Integer ix = new Integer(15);
		boolean remove = list.remove(ix);
		System.out.println(list.size() + " wynik dzia³ania metody remove ="+ remove);
		//System.out.println(list.get(0));
		for(int i = 0; i<list.size();i++) {
			System.out.println(list.get(i));
			if(list.get(i)%2==0) {
				list.remove(list.get(i));
			}
		}
		System.out.println(list.toString());
		list.clear();
		list.add(10);
		list.add(12);
		list.add(15);
		list.add(20);
		list.add(99);
		//list.get(1000); tu dostaniemy wyj¹tek {@link IndexOutOfBoundsException}
		for(Integer element : list) {
			System.out.println(element);
		}
	}

}
