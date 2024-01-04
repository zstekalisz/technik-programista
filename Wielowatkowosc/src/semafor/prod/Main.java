package semafor.prod;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Kolejka kolejka = new Kolejka();
		new Konsument(kolejka);
		Thread.sleep(2000);
		new Producent(kolejka);

	}

}
