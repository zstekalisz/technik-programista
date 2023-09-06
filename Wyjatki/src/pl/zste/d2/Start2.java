package pl.zste.d2;

public class Start2 {

	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			int wynik = a / b;
		} catch (Exception e) {
			System.out.println("coś poszło nie tak ale naprawimy");
			System.out.println("Wyjątek dotyczy "+e.getMessage());
		}
		System.out.println("koniec");
		PropagacjaWyjatku propagacjaWyjatku = new PropagacjaWyjatku();
		try {
			int wynik2 = propagacjaWyjatku.dzielimy(15, 5);
			System.out.println("Wynik dzielenie to "+wynik2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			propagacjaWyjatku.dzielimy(15, 0);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
