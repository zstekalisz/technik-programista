package semafor.prod;

import java.util.concurrent.Semaphore;

public class Kolejka {
	
	public int n;
	
	static Semaphore semaforKonsument = new Semaphore(0);
	static Semaphore semaforProducent = new Semaphore(1);
	
	public void get() {
		try {
			semaforKonsument.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Pobrano "+n);
		semaforProducent.release();
	}
	
	public void put(int i ) {
		try {
			semaforProducent.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.n = i;
		System.out.println("W³o¿ono "+n);
		semaforKonsument.release();
	}

}
