package pl.zste.start;

public class Osoba implements Comparable<Osoba>{
	
	private String imie;
	private String nazwisko;
	private int wiek;
	
	
	public Osoba(String imie, String nazwisko, int wiek) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	@Override
	public int compareTo(Osoba o) {
		return this.nazwisko.compareTo(o.nazwisko);
	}

	@Override
	public String toString() {
		return "Osoba o imieniu : " + imie + " oraz nazwisku : " + nazwisko;
	}
	
}
