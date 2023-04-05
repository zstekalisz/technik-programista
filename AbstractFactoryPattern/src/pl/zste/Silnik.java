package pl.zste;

public abstract class Silnik {
	private int moc;

	public int getMoc() {
		return moc;
	}

	public void setMoc(int moc) {
		this.moc = moc;
	}
	
	public abstract String rodzajPaliwa();

}
