package pl.zste.egzamin;

public class Odkurzacz extends Urzadzenie{
	private boolean wlaczony = false;
	
	public void on() {
		if(!wlaczony) {
			wlaczony = true;
			wypiszKomunikat("Odkurzacz włączono");
		}
	}
	
	public void off() {
		if(wlaczony) {
			wlaczony = false;
			wypiszKomunikat("Odkurzacz wyłączono");
		}
	}

}
