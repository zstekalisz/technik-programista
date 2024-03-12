package pl.zste.stream.cwiczenia;

public class Opinia {
	
	private String opis;
	private int ocena;
	
	public Opinia(String opis, int ocena) {
		this.opis = opis;
		this.ocena = ocena;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
	@Override
	public String toString() {
		return "Opis : " + this.opis + "ocena : "+ this.ocena; 
	}
	

}
