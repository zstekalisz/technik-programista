package semafor;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		Semaphore semafor = new Semaphore(1);
		new WatekZwiekszajacyLicznik("Zwiekszenie", semafor);
		new WatekZmniejszajacyLicznik("Zmniejszenie", semafor);
	}

}
