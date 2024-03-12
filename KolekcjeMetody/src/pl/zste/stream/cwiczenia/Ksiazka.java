package pl.zste.stream.cwiczenia;

import java.util.ArrayList;
import java.util.List;

public class Ksiazka {
	
	private List<Opinia> opinie;
	private Autor autor;
	private String tytul;
	private String wydawnictwo;
	private int liczbaStron;
	
	public Ksiazka(Autor autor, String tytul, String wydawnictwo, int liczbaStron) {
		this.autor = autor;
		this.tytul = tytul;
		this.wydawnictwo = wydawnictwo;
		this.liczbaStron = liczbaStron;
		this.opinie = new ArrayList<>();
	}

	public List<Opinia> getOpinie() {
		return opinie;
	}

	public void setOpinie(List<Opinia> opinie) {
		this.opinie = opinie;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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

	public int getLiczbaStron() {
		return liczbaStron;
	}

	public void setLiczbaStron(int liczbaStron) {
		this.liczbaStron = liczbaStron;
	}
	
	@Override
	public String toString() {
		return "Książka : " +tytul +" "+ autor.toString();
	}

}
