package pl.zste.stream;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Uczen {
	private List<Ksiazka> ksiazki;
	private String imie;
	private String nazwisko;
	private Color kolorOczu;
	private int wiek;
	
	public Uczen(String imie, String nazwisko, Color kolorOczu, int wiek) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.kolorOczu = kolorOczu;
		this.wiek = wiek;
		this.ksiazki = new ArrayList<>();
	}

	public List<Ksiazka> getKsiazki() {
		return ksiazki;
	}

	public void setKsiazki(List<Ksiazka> ksiazki) {
		this.ksiazki = ksiazki;
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

	public Color getKolorOczu() {
		return kolorOczu;
	}

	public void setKolorOczu(Color kolorOczu) {
		this.kolorOczu = kolorOczu;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	
	

}
