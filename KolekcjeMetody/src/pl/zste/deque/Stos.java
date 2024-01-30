package pl.zste.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Stos <T>{
	
	private Deque<T> stosik = new LinkedList<>();
	
	
	public void dodajLiczbe(T liczba) {
		stosik.addFirst(liczba);
	}
	
	
	public T zdejmijLiczbe() {
		return stosik.pollFirst();
	}
	

}
