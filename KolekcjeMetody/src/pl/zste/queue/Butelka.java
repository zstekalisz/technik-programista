package pl.zste.queue;

public class Butelka implements Comparable<Butelka>{
	
	public String nazwa;
	public Integer priorytet;
	
	public Butelka(String nazwa, int priorytet) {
		this.nazwa = nazwa;
		this.priorytet = priorytet;
	}

	@Override
	public int compareTo(Butelka o) {
		return this.priorytet.compareTo(o.priorytet); //sortowanie rosnące
		//return o.priorytet.compareTo(this.priorytet); //sortowanie malejące
	}

	@Override
	public String toString() {
		return "Butelka o nazwie "+nazwa+" priorytet : "+priorytet;
	}
}
