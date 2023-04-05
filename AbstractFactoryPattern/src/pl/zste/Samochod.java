package pl.zste;

public class Samochod {
	private Silnik silnik;
	private RodzajNadwozia nadwozie;
	
	Samochod(Silnik silnik, RodzajNadwozia nadwozie) {
		this.silnik = silnik;
		this.nadwozie = nadwozie;
	}

	public Silnik getSilnik() {
		return silnik;
	}
	public RodzajNadwozia getNadwozie() {
		return nadwozie;
	}	
	
}
