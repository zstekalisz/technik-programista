package pl.zste.stream;

public class Ksiazka {
	private String tytul;
	private String wydawnictwo;
	
	public Ksiazka(String tytul, String wydawnictwo) {
		super();
		this.tytul = tytul;
		this.wydawnictwo = wydawnictwo;
	}

	public String getTytul() {
		return tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getWydawnictwo() {
		return wydawnictwo;
	}

	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo = wydawnictwo;
	}
	
	@Override
	public String toString() {
		return "Książka "+tytul+ " wydana przez "+wydawnictwo;
	}
	

}
