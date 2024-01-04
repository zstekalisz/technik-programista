package pl.zste.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class MetodyInterfaceQueue {

	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		PriorityQueue<Integer> ograniczonaInicjalnieKolejka = new PriorityQueue<Integer>(2);
		queue.add(8);
		queue.add(19);
		queue.add(0);
		queue.add(90);
		System.out.println(queue.size());
		int r = queue.size();
		for(int i = 0; i<r; i++) {
			System.out.println(queue.poll());
		} //pętla for jest wykonywana po kolekcji która zmienia rozmiar dlatego nie działa należy wyciągnąć rozmiar przez rozpoczęciem iteracji
	}

}
