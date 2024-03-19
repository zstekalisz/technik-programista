package pl.zste.stream.cwiczenia;

public class Recenzja {
	
	private int ocena;
	private String opis;
	
	public Recenzja(int ocena, String opis) {
		this.ocena = ocena;
		this.opis = opis;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	@Override
	public String toString() {
		return "Recenzja : ocena - " + ocena + " " + opis ;
	}
	

}
