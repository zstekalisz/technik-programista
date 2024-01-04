package zakleszczenie;

public class Zakleszczenie implements Runnable {
	
	final private A a = new A();
		
	final private B b= new B();
	
	
	public Zakleszczenie() {
		Thread currentThread = Thread.currentThread();
		currentThread.setName("wątek z metody main");
		Thread secondThread = new Thread(this);
		secondThread.setName("pomocniczy");
		secondThread.start();	
		a.startA(b);	
		
	}

	@Override
	public void run() {
		b.startB(a);
	}
	
	public static void main(String[] args) {
		new Zakleszczenie();
	}

}
