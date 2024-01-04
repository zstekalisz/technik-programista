package pl.zste.d1;

public class Start {

	public static void main(String[] args) {
		int liczba = 14;
		int dzielna = 0;
		try {
			int wynik = liczba/dzielna;
		}catch(ArithmeticException ex){
			System.out.println("Nie dziel przez zero");
			System.out.println(ex.getMessage());
		}
		LogikaBiznesowa lb = new LogikaBiznesowa();
		int wynik2 = lb.dzielenie(liczba, dzielna);//wynik2 przy dzieleniu przez 0 będzie wynosił -1
		// ale przecież może być przypadek dzielenia z wynikiem -1 np 1:(-1)
		try {
			lb.poprawneDzielenie(liczba, dzielna);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			int dzielenie = lb.poprawneDzielenie(15, 3);
			System.out.println("15 dzielone przez 3 to "+dzielenie);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//lb.poprawneDzielenieBeta(liczba, dzielna);
		
		try {
			lb.wyswietlWiadomosc(13);
		} catch (MojWyjatekWeryfikowalny e) {
			System.out.println(e.getMessage());
		}
		try {
			lb.obliczPoleKwadratu(-99);
		}catch(Throwable ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Wykonuję blok FINALLY!!!!!");
		}
		System.out.println("Ostatnia linia kodu w metodzie main");
	}

}
