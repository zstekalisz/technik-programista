package pl.zste.list;

public class Ksiazka implements Comparable<Ksiazka>{
 	public String tytul;
	public int liczbaStron;
	
	public Ksiazka(String tytul, int liczbaStron) {
		this.tytul = tytul;
		this.liczbaStron = liczbaStron;
	}

	@Override
	public String toString() {
		return "Ksiazka  o tytule " + tytul + ", liczbaStron=" + liczbaStron;
	}

	@Override
	public int compareTo(Ksiazka o) {
		if(this.liczbaStron== o.liczbaStron)
		return 0;
		else if(this.liczbaStron> o.liczbaStron) return -1;
		else return 1;
	}
	

}
