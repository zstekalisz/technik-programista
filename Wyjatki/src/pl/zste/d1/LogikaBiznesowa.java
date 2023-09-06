package pl.zste.d1;

public class LogikaBiznesowa {
	
	public int dzielenie(int a, int b) {
		try {
			return a/b;
		}catch(ArithmeticException ex) {
			return -1;
		}
	}
	
	public int poprawneDzielenie(int a, int b) throws Exception{
		if(b==0) throw new Exception("Dzielisz przez zero");
		return a/b;
	}
	
	public int poprawneDzielenieBeta(int a, int b) {
		if(b== 0) throw new RuntimeException("Dzielisz przez 0");// wyjątek typu RuntimeException jest wyjątkiem
		//nieweryfikowalnym, dlatego nie musi być jawnie obsługiwany lub propagowany do innych metod
		return a/b;
	}
	
	public String wyswietlWiadomosc(int ileRazy) throws MojWyjatekWeryfikowalny {
		for(int i = 0 ; i<ileRazy; i++) {
			if(i>10) throw new MojWyjatekWeryfikowalny("Wybrana za duża ilość powtórzeń");
			System.out.println("Wykonuję pętlę po raz "+i);
		}
		return "Wyświetlono wiadomość "+ileRazy+" razy";
	}
	
	public double obliczPoleKwadratu(double bok) {
		if(bok <= 0) throw new MojWyjatekNieweryfikowalny("Podany bok kwadratu jest błęny");
		return bok*bok;
	}

}
