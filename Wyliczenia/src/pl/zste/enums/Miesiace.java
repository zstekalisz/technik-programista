package pl.zste.enums;

public enum Miesiace {
	styczen(1, "zima"), luty(2, "zima"), marzec(3, "zima/wiosna"), kwiecien(4, "wiosna"), maj(5, "wiosna"),
	czerwiec(6, "wiosna/lato"), 	lipiec(7, "lato"), sierpien(8, "lato"), wrzesien(9, "lato/jesień"), 
	pazdziernik(10, "jesień"), listopad(11, "jesień"), grudzien(12, "jesień/zima");
	
	private Miesiace(int i, String poraRoku) {
		this.numer = i;
		this.poraRoku = poraRoku;
	}

	private int numer;
	private String poraRoku;
	
	public int getNumer() {
		return this.numer;
	}
	
	public String getPoraRoku() {
		return this.poraRoku;
	}
}
