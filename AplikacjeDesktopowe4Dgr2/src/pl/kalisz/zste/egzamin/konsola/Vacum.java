package pl.kalisz.zste.egzamin.konsola;

public class Vacum extends Device{
	
	private boolean vacumState = false;
	
	public void on() {
		if(!vacumState) {
			this.vacumState = true;
			showMessage("Odkurzacz włączono");
		}
	}
	
	public void off() {
		if(vacumState) {
			this.vacumState = false;
			showMessage("Odkurzacz wyłączono");
		}
	}

}
