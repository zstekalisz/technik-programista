package pl.zste.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import pl.zste.queue.Dom;

public class MainStreamGr1 {

	public static void main(String[] args) {
		Dom d1 = new Dom("Pod Lasem", 5);
		Dom d2 = new Dom("Na Rodosie", 8);
		Dom d3 = new Dom("Willa", 2);
		Dom d4 = new Dom("Willa Zimowa", 2);
		Dom d5 = new Dom("Willa Lux", 2);
		Dom d6 = new Dom("Zamek", 5);
		Dom d7 = new Dom("Szałas", 5);
		Dom d8 = new Dom("Namiot", 2);
		Dom d9 = new Dom("Bliźniak", 7);
		Dom d10 = new Dom("Letniskowy", 7);
		List<Dom> domy = new ArrayList<>();
		domy.add(d1);
		domy.add(d2);
		domy.add(d3);
		domy.add(d4);
		domy.add(d5);
		domy.add(d6);
		domy.add(d7);
		domy.add(d8);
		domy.add(d9);
		domy.add(d10);
		long count = domy.stream()
				.filter(d-> d.priorytet==2)
				.count();
		
		long count2 = domy.stream()
				.filter(dom-> dom.priorytet==7)
				.filter(d-> d.nazwa.length()<10)
				.count();
		System.out.println(count + "; "+ count2);
		List<Dom> przefiltrowaneDomy = domy.stream()
				.filter(d-> d.priorytet==7)
				.collect(Collectors.toList());
		przefiltrowaneDomy.forEach(d-> System.out.println(d.priorytet));
		
		List<String> nazwyDomowPoFiltrze = domy.stream()
				.filter(d-> d.priorytet==5)
				.map(d-> d.nazwa)
				.collect(Collectors.toList());
		nazwyDomowPoFiltrze.forEach(n-> System.out.println(n));
		Map<Integer, List<Dom>> mapa = domy.stream().collect(Collectors.groupingBy(d-> d.priorytet));
		
		mapa.forEach((k, v)->{
			System.out.println("dla priorytetu : "+k);
			v.forEach(d->{
				System.out.println(d);
			});
		});
		
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		Set<Entry<Integer, List<Dom>>> entrySet = mapa.entrySet();
		for(Entry<Integer, List<Dom>> entry : entrySet) {
			Integer key = entry.getKey();
			System.out.println("dla priorytetu : "+key);
			List<Dom> value = entry.getValue();
			for(Dom d : value ) {
				System.out.println(d);
			}
		}
		domy.add(new Dom("Test", null));
		List<Integer> priorytety = domy.stream()
				.map(d-> d.priorytet)
				.filter(i-> i!=null)
				.sorted(Comparator.reverseOrder())
				.distinct()
				.collect(Collectors.toList());
		priorytety.forEach(p-> System.out.println(p));
		
		Optional<Integer> opSumaPriorytetow = domy.stream()
				.filter(d-> d.priorytet!=null)
				.map(d-> d.priorytet)
				.reduce((i1, i2)-> i1+i2);
		
		if(opSumaPriorytetow.isPresent()) {
			System.out.println(opSumaPriorytetow.get());
		}
		Integer suma = domy.stream().filter(d-> d.priorytet!=null).map(d-> d.priorytet).reduce(60, (i1, i2)-> i1+i2);
		System.out.println(suma);
	}

}
