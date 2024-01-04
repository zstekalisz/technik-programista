package semafor.prod;

public class Konsument implements Runnable{
	
	public Kolejka kolejka;

	public Konsument(Kolejka kolejka) {
		this.kolejka = kolejka;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for(int i =0; i<20; i++) {
			kolejka.get();
		}	
	}

}
