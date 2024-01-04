package synch;

public class Zasob {
	
	synchronized public void wywolaj(String s) {
		System.out.print("["+s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
