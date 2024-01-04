package pl.zste.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class MetodyInterfaceCollectionCd {

	public static void main(String[] args) {
		ArrayList<String> listaImion = new ArrayList<String>();
		listaImion.add("Adam");
		listaImion.add("Barbara");
		listaImion.add("Henryk");
		listaImion.add("Ula");
		listaImion.add("Ewa");
		listaImion.add("");
		ArrayList<Integer> listaNumerow = new ArrayList<Integer>(Arrays.asList(1,4,6,8));
		System.out.println(listaImion.isEmpty());
		System.out.println(listaNumerow.isEmpty());
//		for(int i = 0; i<listaNumerow.size(); i++) {
//			System.out.println(listaNumerow.get(i));
//			if(listaNumerow.get(i)==4) {
//				listaNumerow.remove(i);
//			}
//		}
//		Iterator<Integer> iterator = listaNumerow.iterator();
//		while(iterator.hasNext()) {
//			Integer next = iterator.next();
//			System.out.println(next);
//			if(next==4) iterator.remove();
//		}
		//boolean removeAll = listaNumerow.removeAll(Arrays.asList(1,8,10,12,13));
		//System.out.println(removeAll);
//		boolean removeIf = listaNumerow.removeIf(i-> i>4);
//		System.out.println(removeIf);
//		System.out.println(listaNumerow);
//		listaImion.removeIf(i-> i.isEmpty()||i.length()<=3);
//		System.out.println(listaImion);
//		listaImion.removeIf(new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				return t.isEmpty()||t.length()<=3;
//			}
//		});
		listaNumerow.retainAll(Arrays.asList(6,8,9,10,11));
		System.out.println(listaNumerow);
	}

}
