package pl.zste.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class MetodyInterfaceQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(8);
		queue.add(19);
		queue.add(0);
		queue.add(90);
		System.out.println("Rozmiar kolejki "+queue.size());
		int r = queue.size();
		for(int i = 0; i<5; i++) {
			try {
				System.out.println(queue.remove());
			}catch(NoSuchElementException ex) {
				System.out.println(i + " wykonanie pętli kończy się wyjątkiem");
			}
			
		}
		Queue<String> pQueue = new PriorityQueue<>(2);
		pQueue.add("Karol");
		pQueue.add("Paweł");
		pQueue.add("Sylwia");
		pQueue.add("Filip");
		int size = pQueue.size();
		for(int i = 0; i< size; i++) {
			System.out.println(pQueue.poll());
			System.out.println(pQueue.size());
		}
		Queue<Butelka> kolejkaButelek = new PriorityQueue<Butelka>();
		//TODO dokończyć za tydzień dodawanie butelek do kolejki priorytetowej
	}

}
