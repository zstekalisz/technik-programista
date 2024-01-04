package pl.zadanie;

public class Trzy extends Dwa{
	private int z;

	public Trzy(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}
