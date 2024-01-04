package pl.zste.list;

public class Komputer implements Comparable<Komputer> {

	public String producent;
	public int nrSeryjny;

	public Komputer(String producent, int nrSeryjny) {
		this.producent = producent;
		this.nrSeryjny = nrSeryjny;
	}

	@Override
	public String toString() {
		return "Komputer o numerze seryjnym " + nrSeryjny;
	}

	@Override
	public int compareTo(Komputer o) {
		if (this.nrSeryjny == o.nrSeryjny)
			return 0;
		else if (this.nrSeryjny > o.nrSeryjny)
			return 1;
		else
			return -1;
	}

}
