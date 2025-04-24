package pl.kalisz.zste.grupa2;

public class TestowanieKartkówkaGr2 {

	/**
	 * klasa z metodami dla których należy dopisać dokumentację i testy jednostkowe.
	 * w dokumentacji opisujemy autora - wpisujemy siebie, opis co robi metoda, jakie przyjmuje parametry
	 * oraz co metoda zwraca
	 * Kartkówka podzielona na grupy A oraz B. Grupa A opisuje testuje metody : metoda1 i metoda3 grupa B metoda2 i metoda4
	 * Należy zmienić nazwy metod na anglojęzyczne, tak aby sama nazwa sugerowała co metoda ma za zadanie robić 
	 */
	
	public double m1(int[] tab) {
		double x = 0;
		double y = 0;
		for(int i =0; i< tab.length; i++) {
			if(tab[i]%2==0) {
				x += tab[i];
			}else {
				y += tab[i];
			}
		}
		return y/x;
	}

	public int m2(String input, boolean flag) {
		int result = 0;
		if(flag) {
			input = input.toUpperCase();
		}
		String[] split = input.split("");
		for(String s : split) {
			result += s.charAt(0);
		}
		return result;
	}
	public String m3(String input) {
		String[] array1 = {"z", "b", "m", "r", "a", "y", "u", "i", "o", "p"};
		String[] array2 = {"c", "n", "d", "f", "w", "j", "h", "k", "l", "m"};
		for(int i = 0; i<array1.length; i++) {
			if(input.contains(array1[i])) {
				input = input.replace(array1[i], array2[i]);
			}
		}
		return input;
	}
	
	public String m4(String input) {
		String[] array1 = {"m", "w", "e", "r", "t", "y", "u", "i", "o", "p"};
		String[] array2 = {"a", "s", "d", "f", "g", "h", "j", "k", "l", "z"};
		for(int i = 0; i<array1.length; i++) {
			if(input.contains(array2[i])) {
				input = input.replace(array2[i], array1[i]);
			}
		}
		return input;
	}
	/**
	 * Metoda zamienia liczbę w systemie dwójkowym na system dziesiętny
	 * 
	 * @param binarna
	 * @return liczba dziesiętna lub -1 w przypadku błędnego parametru wejściowego
	 */
	public int binarneNaDziesietne(String binarna) {
		int wynik = 0;
		int potega = binarna.length()-1;
		String[] tablica = binarna.split("");
		for(String el : tablica) {
			int elLiczba = Integer.parseInt(el);
			if(elLiczba!=0 && elLiczba!=1) {
				return -1;
			}
			wynik = wynik+(int)(elLiczba* Math.pow(2, (double)potega));
			potega--;
		}
		
		
		
		return wynik;
	}
}
