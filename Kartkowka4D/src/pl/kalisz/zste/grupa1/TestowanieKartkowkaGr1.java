package pl.kalisz.zste.grupa1;

public class TestowanieKartkowkaGr1 {
	
	/**
	 * klasa z metodami dla których należy dopisać dokumentację i testy jednostkowe.
	 * w dokumentacji opisujemy autora - wpisujemy siebie, opis co robi metoda, jakie przyjmuje parametry
	 * oraz co metoda zwraca
	 * Kartkówka podzielona na grupy A oraz B. Grupa A opisuje testuje metody : metoda1 i metoda3 grupa B metoda2 i metoda4
	 * Należy zmienić nazwy metod na anglojęzyczne, tak aby sama nazwa sugerowała co metoda ma za zadanie robić 
	 */
	
	public String m1(String input) {
		String[] array1 = {"a", "p", "d", "o", "z", "w", "g", "s"};
		String[] array2 = {"c", "x", "h", "i", "f", "k", "l", "y"};
		for(int i = 0; i<array1.length; i++) {
			if(input.contains(array1[i])) {
				input = input.replace(array1[i], array2[i]);
			}
		}
		return input;
	}

	public String m2(String input, String param) {
		String[] split = input.split("");
		StringBuilder sb = new StringBuilder();
		for(String s : split) {
			sb.append(s);
			sb.append(param);
		}
		return sb.toString();
	}
	
	public int m3(String input) {
		int result = 0;
		String[] split = input.split("");
		for(String s : split) {
			result += s.charAt(0);
		}
		return result;
	}
	public String m4(String input) {
		String[] array1 = {"h", "p", "d", "o", "i", "x", "g", "l"};
		String[] array2 = {"c", "w", "a", "z", "f", "k", "s", "y"};
		for(int i = 0; i<array1.length; i++) {
			if(input.contains(array2[i])) {
				input = input.replace(array2[i], array1[i]);
			}
		}
		return input;
	}
	

}
