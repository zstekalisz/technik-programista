package pl.zste.start;

public class Telewizor {
	
	private String marka;
	private int przekatnaEkranu;
	
	public Telewizor(String marka, int przekatnaEkranu) {
		this.marka = marka;
		this.przekatnaEkranu = przekatnaEkranu;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public int getPrzekatnaEkranu() {
		return przekatnaEkranu;
	}

	public void setPrzekatnaEkranu(int przekatnaEkranu) {
		this.przekatnaEkranu = przekatnaEkranu;
	}
	
	

}
