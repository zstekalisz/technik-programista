package pl.zste.d2;

public class LogikaBiznesowa {
	
	public double obliczPoleProstokata(double bokA, double bokB) throws MojWyjatekWeryfikowalny {
		if(bokA<=0) throw new MojWyjatekWeryfikowalny("Niepoprawna wartość boku A");
		if(bokB<=0) throw new MojWyjatekWeryfikowalny("Niepoprawna wartość boku B");
		return bokA*bokB;
	}
	
	public double obliczPoleKwadratu(double bok) {
		if(bok<=0) throw new MojWyjatekNieweryfikowalny("Błąd - bok kwadratu nie "
				+ "może być mniejszy lub równy zero");
		return bok*bok;
	}
	
	public int dzielimy(int dzielna , int dzielnik) {
		try {
			return dzielna/dzielnik;
		}catch(ArithmeticException ex) {
			return 0; //zafałszowana logika biznesowa, bo możemy mieć przypadki kiedy 0 będzie faktycznym 
			//wynikiem przykład 0/5 = 0
		}
	}
	
	public int dzielimyPoprawione(int dzielna, int dzielnik) throws MojWyjatekWeryfikowalny {
		if(dzielnik == 0) throw new MojWyjatekWeryfikowalny("Dzielisz przez zero");
		return dzielna/dzielnik;
	}

}
