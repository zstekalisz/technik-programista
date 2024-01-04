package pl.zste.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MetodyInterfejsuDeque {

	public static void main(String[] args) {
		Queue<String> fifo = new LinkedList<>();
		
		Deque<String> deque = new LinkedList<>();
		
//		deque.addFirst("styczeń");
//		deque.add("luty");
//		deque.offer("marzec");
//		deque.offerFirst("kwiecień");
//		deque.push("maj");
		
		
		//FIFO
		deque.add("styczeń");
		deque.add("luty");
		deque.add("marzec");
		deque.offer("kwiecień");
		deque.offerLast("maj");
		
		for (String miesiac : deque) {
			System.out.println(miesiac);
		}
		
		int licznik = deque.size();
		
		for(int i = 0; i< licznik; i++) {
			System.out.println(deque.poll());
			System.out.println(deque.size()); 
			
		}
		
		//LIFO 
		
		deque.add("styczeń");
		deque.add("luty");
		deque.add("marzec");
		deque.offer("kwiecień");
		deque.offerLast("maj");
		
		licznik = deque.size();
		
		for(int i = 0; i< licznik; i++) {
			System.out.println(deque.pollLast());
			System.out.println(deque.size()); 
			
		}
		
		//test iteratorów
		deque.add("styczeń");
		deque.add("luty");
		deque.add("marzec");
		deque.offer("kwiecień");
		deque.offerLast("maj");
		
		Iterator<String> iterator = deque.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.err.println("xxxxxxxxxxxxxxxxxxxxxxxx");
		Iterator<String> iterator2 = deque.descendingIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

	
	
	
	
	
	
	
	
	
}
