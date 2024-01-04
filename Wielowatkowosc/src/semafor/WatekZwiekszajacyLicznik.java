package semafor;

import java.util.concurrent.Semaphore;

public class WatekZwiekszajacyLicznik implements Runnable{
	
	public String nazwa;
	public Semaphore semafor;
	
	public WatekZwiekszajacyLicznik(String nazwa, Semaphore semafor) {
		this.nazwa = nazwa;
		this.semafor = semafor;
		new Thread(this).start();
	}

	@Override
	public void run() {
		System.out.println("Uruchamiam "+ nazwa);
		System.out.println(nazwa +" czeka na dost�p do semafora");
		try {
			semafor.acquire();
			System.out.println(nazwa + " zamkn�a semafor");
			for(int i = 0; i<10; i++) {
				UdostepnionyZasob.licznik++;
				System.out.println(nazwa + " : "+ UdostepnionyZasob.licznik);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nazwa+ " otwiera semafor");
		semafor.release();		
	}
	
	

}
