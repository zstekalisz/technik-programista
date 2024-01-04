package pl.zste.wyliczenia;

public enum DniTygodnia {
	poniedzialek("poniedzia�ek", 1), wtorek("wtorek", 2), sroda("�roda", 3), czwartek("czwartek", 4), piatek("pi�tek", 5),
	sobota("sobota", 6), niedziela("niedziela", 7);

	private String nazwa;
	private int nrDnia;
	
	private DniTygodnia(String nazwa, int nrDnia) {
		this.nazwa = nazwa;
		this.nrDnia = nrDnia;
	}

	public String getNazwa() {
		return nazwa;
	}

	public int getNrDnia() {
		return nrDnia;
	}	
	
}
