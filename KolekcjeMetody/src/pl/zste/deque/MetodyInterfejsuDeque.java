package pl.zste.deque;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class MetodyInterfejsuDeque {

	public static void main(String[] args) {
		Deque<String> stosImion = new LinkedList<String>();
		stosImion.addFirst("Tomek");
		stosImion.addFirst("Sylwia");
		stosImion.addFirst("Przemek");
		stosImion.addFirst("Barbara");
		for(int i = 0; i< 4; i++) {
			System.out.println(stosImion.pollFirst());
		}
		Stos<Integer> stos = new Stos<Integer>();
		stos.dodajLiczbe(121212);
		stos.dodajLiczbe(99800);
		stos.dodajLiczbe(7766252);
		stos.dodajLiczbe(9812345);
		stos.dodajLiczbe(998756431);
		stos.dodajLiczbe(12);
		stos.dodajLiczbe(8765);
		
		for(int i =0; i<10; i++) {
			System.out.println(stos.zdejmijLiczbe());
		}
		
		Stos<String> stos2 = new Stos<String>();

			
	}

	
	
	
	
	
	
	
	
	
}
