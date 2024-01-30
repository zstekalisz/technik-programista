package pl.zste.deque;

import java.util.Deque;
import java.util.LinkedList;

public class MetodyInterfaceDequeGr1 {

	public static void main(String[] args) {
		Deque<String> imiona = new LinkedList<String>();// niech działają jako stos czyli LIFO
		imiona.addFirst("Grzegorz");
		imiona.addFirst("Maciej");
		imiona.addFirst("Barbara");
		imiona.addFirst("Aneta");
		
		for(int i = 0; i< 4; i++) {
			System.out.println(imiona.pollFirst());
		}
		

		Deque<Integer> kolejkaLiczb = new LinkedList<>(); // niech działają jako stos czyli FIFO
		kolejkaLiczb.addLast(12);
		kolejkaLiczb.offerLast(1237);
		kolejkaLiczb.addLast(44);
		kolejkaLiczb.addLast(1000);
		
		for(int i =0; i<10; i++) {
			System.out.println(kolejkaLiczb.pollFirst());
		}
		
		Stos2<Integer> stos = new Stos2<Integer>();
		stos.dodajDoStosu(1222333);
		stos.dodajDoStosu(1235242);
		stos.dodajDoStosu(88);
		stos.dodajDoStosu(1000);
		stos.dodajDoStosu(110000);
		
		for(int i = 0; i<10; i++) {
			System.out.println(stos.zdejmijZeStosu());
		}
		
		Stos2<String> stosImion = new Stos2<>();
		stosImion.dodajDoStosu("Filip");
		
	}

}
