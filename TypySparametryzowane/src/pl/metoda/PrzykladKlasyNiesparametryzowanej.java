package pl.metoda;

public class PrzykladKlasyNiesparametryzowanej {
	
	public static <T extends Number> double obliczSrednia(T[] t) {
		double suma = 0;
		for(T element : t) {
			suma+=element.doubleValue();
		}
		return suma/t.length;
	}
	
	

}
