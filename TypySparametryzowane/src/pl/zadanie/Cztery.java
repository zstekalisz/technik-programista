package pl.zadanie;

public class Cztery extends Trzy {
	
	private int r;
	

	public Cztery(int x, int y, int z, int r) {
		super(x, y, z);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
}
