package pl.zste;

public abstract class RodzajNadwozia {
	private int liczbaDrzwi;

	public int getLiczbaDrzwi() {
		return liczbaDrzwi;
	}

	public void setLiczbaDrzwi(int liczbaDrzwi) {
		this.liczbaDrzwi = liczbaDrzwi;
	}
	
	public abstract String rodzajNadwozia();

}
