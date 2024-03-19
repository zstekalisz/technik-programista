package pl.zste.stream.cwiczenia;

public class Rezyser {
	
	private String imie;
	private String nazwisko;
	
	public Rezyser(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
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
	@Override
	public String toString() {
		return "Reżyser : " + imie + " " + nazwisko ;
	}
	
	

}
