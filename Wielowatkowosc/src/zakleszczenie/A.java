package zakleszczenie;

public class A {

	synchronized void startA(B b) {
		Thread currentThread = Thread.currentThread();
		System.out.println("Wątek " + currentThread.getName() + " wszedł do metody startA");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Wątek " + currentThread.getName() + " próbuje wywołać metodę stopB z klasy B");
		b.stopB();
	}

	synchronized void stopA() {
		System.out.println("wewnątrz metody stopA klasy A");
	}

}
