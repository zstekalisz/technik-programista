package pl.zste.kalisz.egzamin.konsola;

public class Odkurzacz extends Urzadzenie{
	
	private boolean stanOdkurzacza = false;
	
	/**
	 * nazwa: on
	 * opis: ustawia odkurzacz w tryb włączony
	 * parametry: brak
	 * typ zwracany brak (void)
	 * autor : @author Radek
	 */
	public void on() {
		if(!stanOdkurzacza) {
			this.stanOdkurzacza = true;
			wypiszKomunikat("Odkurzacz włączono");
		}
		
	}
	/**
	 * nazwa : off
	 * opis : ustawia odkurzacz w tryb wyłączony
	 * parametry : brak
	 * typ zwracany : brak (void)
	 * autor : @author Radek
	 */
	public void off() {
		if(stanOdkurzacza) {
			this.stanOdkurzacza = false;
			wypiszKomunikat("Odkurzacz wyłączono");
		}
	}

}
