package pl.zste.d2;

public class Main {

	public static void main(String[] args) {
		LogikaBiznesowa logikaBiznesowa = new LogikaBiznesowa();
		logikaBiznesowa.obliczPoleKwadratu(6);
		try {
			logikaBiznesowa.obliczPoleProstokata(-12, 5);
		} catch (MojWyjatekWeryfikowalny e) {
			System.out.println(e.getMessage());
		}
		int wynik1 = logikaBiznesowa.dzielimy(15, 0); // ta metoda kłamie
		int wynik2 = logikaBiznesowa.dzielimy(0, 15);
		System.out.println("wynik 1 wynosi "+wynik1);
		System.out.println("wynik 2 wynosi "+wynik2);
		try {
			logikaBiznesowa.dzielimyPoprawione(15, 0);
		} catch (MojWyjatekWeryfikowalny e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Ostatnia linia kodu w metodzie main");

	}

}
