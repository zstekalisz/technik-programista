package pl.zste.gr1;

public class Uczen {
	String imie;
	String nazwisko;
	Integer wiek;
	Integer nrKlasy;
	
	public Uczen(String imie, String nazwisko, Integer wiek, Integer nrKlasy) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.nrKlasy = nrKlasy;
	}

	@Override
	public String toString() {
		return "Uczen : " + imie + " " + nazwisko + ", wiek=" + wiek + ", nrKlasy=" + nrKlasy;
	}
	
	

}
