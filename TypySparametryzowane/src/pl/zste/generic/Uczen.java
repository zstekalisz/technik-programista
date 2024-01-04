package pl.zste.generic;

public class Uczen {
	
	private String imie;
	private String nazwisko;
	private int wiek;
	
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
	public String toString() {
		return "Uczen  - imie=" + imie + ", nazwisko=" + nazwisko +" wiek "+wiek;
	}
	
}
