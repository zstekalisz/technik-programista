package synch;

public class WywolajZasob implements Runnable{
	
	final private Zasob zasob;
	private String s;
	
	public WywolajZasob(Zasob zasob, String s) {
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
