package pl.ograniczenia;

public class Statystyka <T extends Number>{
	
	private T[] tablica;

	public Statystyka(T[] tablica) {
		super();
		this.tablica = tablica;
	}

	public T[] getTablica() {
		return tablica;
	}

	public void setTablica(T[] tablica) {
		this.tablica = tablica;
	}
	
	public double obliczSrednia() {
		double wynik = 0;
		for(int i = 0; i<tablica.length; i++) {
			wynik = wynik + tablica[i].doubleValue();
		}
		return wynik/tablica.length;
	}
	public boolean czySredniaJestIdentyczna(Statystyka<? extends Number> inna) {
		double taSrednia = this.obliczSrednia();
		double innaSrednia = inna.obliczSrednia();
		if(taSrednia==innaSrednia) {
			return true;
		}else {
			return false;
		}
	}

}
