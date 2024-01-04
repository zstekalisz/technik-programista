package pl.zste.enums;

public enum DniTygodnia {
	poniedzialek(1, "MON"), wtorek(2, "TUE"), sroda(3, "WED"), czwartek(4, "THU"), piatek(5, "FRI"), 
	sobota(6, "SAT"), niedziela(7, "SUN");
	
	private int nrDnia;
	private String shortcut;
	
	DniTygodnia(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public int getNrDnia() {
		return nrDnia;
	}
	public String getShortcut() {
		return shortcut;
	}

}
