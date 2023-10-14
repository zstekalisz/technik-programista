package pl.zste.zadanieegzamin.arkusz1;

public class Notatka {
	
	private static int licznikNotatek = 0;
	
	private int id;
	protected String tytulNotatki;
	protected String trescNotatki;
	
	public Notatka(String tytulNotatki, String trescNotatki) {
		licznikNotatek++;
		this.id = licznikNotatek;
		this.tytulNotatki = tytulNotatki;
		this.trescNotatki = trescNotatki;
	}
	
	public void getTytulAndTresc() {
		System.out.println("tytuł: "+this.tytulNotatki+ " treść: "+this.trescNotatki);
	}
	
	public void diagnostic() {
		System.out.println(this.id+";"+this.tytulNotatki+";"+this.trescNotatki);
	}

}
