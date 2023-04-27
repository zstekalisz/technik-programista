package zakleszczenie;

public class B {
	
	synchronized void startB(A a) {
		Thread currentThread = Thread.currentThread();
		System.out.println("Wątek " + currentThread.getName() + " wszedł do metody startB");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Wątek " + currentThread.getName() + " próbuje wywołać  metodę stopA z klasy A");
		a.stopA();
	}

	synchronized public void stopB() {
		System.out.println(" wewnątrz metody stopB klasy B");
	}

}
