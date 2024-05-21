package pl.zste.start;

public class Samochod {
	private String marka;
	private String nrRej;
	
	public Samochod(String marka, String nrRej) {
		this.marka = marka;
		this.nrRej = nrRej;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getNrRej() {
		return nrRej;
	}

	public void setNrRej(String nrRej) {
		this.nrRej = nrRej;
	}
	
	

}
