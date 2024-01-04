package pl.zste.collection.gr2;

import java.util.ArrayList;
import java.util.Collection;

public class MetodyZInterfaceCollection {

	public static void main(String[] args) {
		Collection<Number> c = new ArrayList<Number>();
		c.add(1);
		c.add(5D);
		Collection<Long> cLong = new ArrayList<Long>();
		cLong.add(2L);
		cLong.add(4L);
		c.addAll(cLong);
		System.out.println(c.isEmpty() ? "Tak" : "Nie");
		System.out.println("Wielkość kolekcji 'c' wynosi "+ c.size());
		System.out.println(cLong.size());
		cLong.clear();
		System.out.println(cLong.size());
		System.out.println(c.contains(3)? "zawiera 3" : "nie zawiera 3");
		System.out.println(c.contains(4L)? "zawiera 4" : "nie zawiera 4");
		System.out.println(c.contains(5L)? "zawiera 5" : "nie zawiera 5");
	}

}
