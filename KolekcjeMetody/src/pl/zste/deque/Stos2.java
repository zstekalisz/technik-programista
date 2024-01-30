package pl.zste.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Stos2 <T>{
	
	private Deque<T> stosik = new LinkedList<>();
	
	public void dodajDoStosu(T element) {
		stosik.addFirst(element);
	}
	
	public T zdejmijZeStosu() {
		return stosik.pollFirst();
	}
	

}
