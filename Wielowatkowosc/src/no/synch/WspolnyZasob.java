package no.synch;

public class WspolnyZasob {
	
	public void wywolaj(String s) {
		System.out.print("["+s);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
