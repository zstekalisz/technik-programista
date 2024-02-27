package pl.zste.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import pl.zste.queue.Butelka;

public class MainStream {

	public static void main(String[] args) {
		Butelka b1 = new Butelka("CocaCola", 5);
		Butelka b2 = new Butelka("PoloCola", 8);
		Butelka b3 = new Butelka("PepsiCola", 9);
		Butelka b4 = new Butelka("HoopCola", 5);
		Butelka b5 = new Butelka("RiverCola", 5);
		Butelka b6 = new Butelka("Cola3Cytryny", 8);
		Butelka b7 = new Butelka("Polokokta", 3);
		Butelka b8 = new Butelka("GreenCola", 1);
		Butelka b9 = new Butelka("NukaCola", 7);
		Butelka b10 = new Butelka("ClasicCola", 8);
		
		List<Butelka> butelki = new ArrayList<>();
		butelki.add(b1);
		butelki.add(b2);
		butelki.add(b3);
		butelki.add(b4);
		butelki.add(b5);
		butelki.add(b6);
		butelki.add(b7);
		butelki.add(b8);
		butelki.add(b9);
		butelki.add(b10);
		long count = butelki.stream()
				.filter(b-> b.priorytet.equals(3))
				.count();
		System.out.println(count);
		long count2 = butelki.stream()
				.filter(butelka-> butelka.priorytet.equals(5))
				.count();
		System.out.println(count2);
		long count3 = butelki.stream()
				.filter(b-> b.priorytet.equals(8))
				.filter(b-> b.nazwa.length()<=10)
				.count();
		List<Butelka> przefiltrowane = butelki.stream()
				.filter(b-> b.priorytet.equals(5))
				.collect(Collectors.toList());
	}

}
