package no.synch;

public class Wywolywacz implements Runnable{
	
	final private WspolnyZasob zasob;
	private String s;
	
	public Wywolywacz(WspolnyZasob zasob, String s) {
		this.zasob = zasob;
		this.s = s;
		Thread t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		zasob.wywolaj(s);	
	} 
}
