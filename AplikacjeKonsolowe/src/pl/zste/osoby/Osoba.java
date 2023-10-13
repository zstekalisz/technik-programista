package pl.zste.osoby;

public class Osoba {
	private int id;
	private String imie;
	private String nazwisko;
	
	public Osoba(int id, String imie, String nazwisko) {
		this.id = id;
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	@Override
	public String toString() {
		return "id :" + id + ", imie :" + imie + ", nazwisko :" + nazwisko;
	}
	
	
	
}
