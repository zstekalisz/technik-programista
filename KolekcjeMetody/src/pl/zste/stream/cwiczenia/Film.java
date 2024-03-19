package pl.zste.stream.cwiczenia;

import java.util.ArrayList;
import java.util.List;

public class Film {
	private List<Recenzja> recenzje;
	private Rezyser rezyser;
	private String tytulFilmu;
	private GatunekFilmu gatunek;
	private int czasTrwaniaWMinutach;
	
	public Film(Rezyser rezyser, String tytulFilmu, GatunekFilmu gatunek, int czasTrwaniaWMinutach) {
		this.rezyser = rezyser;
		this.tytulFilmu = tytulFilmu;
		this.gatunek = gatunek;
		this.czasTrwaniaWMinutach = czasTrwaniaWMinutach;
		this.recenzje = new ArrayList<>();
	}

	public List<Recenzja> getRecenzje() {
		if(recenzje==null) {
			recenzje = new ArrayList<>();
		}
		return recenzje;
	}

	public void setRecenzje(List<Recenzja> recenzje) {
		this.recenzje = recenzje;
	}

	public Rezyser getRezyser() {
		return rezyser;
	}

	public void setRezyser(Rezyser rezyser) {
		this.rezyser = rezyser;
	}

	public String getTytulFilmu() {
		return tytulFilmu;
	}

	public void setTytulFilmu(String tytulFilmu) {
		this.tytulFilmu = tytulFilmu;
	}

	public GatunekFilmu getGatunek() {
		return gatunek;
	}

	public void setGatunek(GatunekFilmu gatunek) {
		this.gatunek = gatunek;
	}

	public int getCzasTrwaniaWMinutach() {
		return czasTrwaniaWMinutach;
	}

	public void setCzasTrwaniaWMinutach(int czasTrwaniaWMinutach) {
		this.czasTrwaniaWMinutach = czasTrwaniaWMinutach;
	}

	@Override
	public String toString() {
		return "Film : " + tytulFilmu + " "+ rezyser;
	}
	
}
