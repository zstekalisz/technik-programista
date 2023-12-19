package pl.zste.list;

public class Komputer {
	
	public String producent;
	public int nrSeryjny;
	
	public Komputer(String producent, int nrSeryjny) {
		this.producent = producent;
		this.nrSeryjny = nrSeryjny;
	}

	@Override
	public String toString() {
		return "Komputer o numerze seryjnym " + nrSeryjny ;
	}
	
	
}
