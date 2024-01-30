package pl.zste.queue;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CwiczeniaInterfaceQueueGr1 {

	public static void main(String[] args) {
		Queue<Integer> kolejka = new LinkedList<Integer>();
		kolejka.add(9);
		kolejka.offer(10);
		kolejka.add(44);
		kolejka.add(89);
		int size = kolejka.size();
		for(int i =0 ; i< size; i++) {
			System.out.println(kolejka.remove());
			System.out.println("Rozmiar kolejki" +kolejka.size());
		}
		
		Queue<String> imiona = new PriorityQueue<>(2);
		imiona.add("Tomasz");
		imiona.add("Danuta");
		imiona.add("Zbyszek");
		imiona.add("Aldona");
		for(int i = 0; i< 4; i++) {
			System.out.println(imiona.poll());
		}
		
		Queue<Dom> kolejkaDomy = new PriorityQueue<Dom>(Comparator.reverseOrder());
		kolejkaDomy.add(new Dom("Na Częstochowskiej", 120));
		kolejkaDomy.offer(new Dom("Pod lipą", 125));
		kolejkaDomy.add(new Dom("Stare Miasto", 100));
		for(int i = 0; i < 3; i++) {
			System.out.println(kolejkaDomy.poll());
		}
	}

}
