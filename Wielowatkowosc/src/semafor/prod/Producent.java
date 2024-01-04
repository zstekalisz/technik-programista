package semafor.prod;

public class Producent implements Runnable{
	
	public Kolejka kolejka; 

	public Producent(Kolejka kolejka) {
		this.kolejka = kolejka;
		new Thread(this).start();
	}

	@Override
	public void run() {
		for(int i = 0; i<20; i++) {
			kolejka.put(i);
		}
		
	}

}
