package pl.zste.queue;

public class Dom implements Comparable<Dom>{
	
	public String nazwa;
	public Integer priorytet;
	
	public Dom(String nazwa, int priorytet) {
		this.nazwa = nazwa;
		this.priorytet = priorytet;
	}

	@Override
	public int compareTo(Dom o) {
		return this.priorytet.compareTo(o.priorytet);//sortowanie rosnace
		//return o.priorytet.compareTo(this.priorytet);//sortowanie malejace
	}
	
	@Override
	public String toString() {
		return "Dom o nazwie " + nazwa +" priorytet domu : " + priorytet;
	}

}
