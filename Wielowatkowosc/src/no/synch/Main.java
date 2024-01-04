package no.synch;

public class Main {

	public static void main(String[] args) {

		Thread watekZMetodyMain = Thread.currentThread();
		System.out.println("Czy wątek "+ watekZMetodyMain.getName() +" jest demonem ? " +//
		watekZMetodyMain.isDaemon());
		Runnable pr = new ProgramowanieRownolegle();
		Thread watekDwa = new Thread(pr, "Drugi wątek");
		watekDwa.start();
		ProgramowanieRownolegle pr2 = new ProgramowanieRownolegle();
		Thread watekTrzy = new Thread(pr2, "Trzeci wątek");
		watekTrzy.start();
		ProgramowanieRownolegleDrugiSposob pr3 = new ProgramowanieRownolegleDrugiSposob("Czwarty wątek");
		pr3.start();
		System.out.println("ostatnia linia w main");
	}

}
