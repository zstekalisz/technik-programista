package pl.zste.gr2;

public class Ksiazka {
	
	public enum RodzajKsiazki{powiesc, lektura, kryminal}
	
	String tytul;
	RodzajKsiazki rodzaj;
	int liczbaStron;
	
	public Ksiazka(String tytul, RodzajKsiazki rodzaj, int liczbaStron) {
		this.tytul = tytul;
		this.rodzaj = rodzaj;
		this.liczbaStron = liczbaStron;
	}

	@Override
	public String toString() {
		return "Ksiazka :" + tytul + ", rodzaj: " + rodzaj.name() + ", liczbaStron=" + liczbaStron;
	}
	
	

}
