package pl.kalisz.zste.grupa2;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class KartkowkaUtils2 {
	
	
	/**
	 * klasa z metodami dla których należy dopisać dokumentację i testy jednostkowe.
	 * w dokumentacji opisujemy autora - wpisujemy siebie, opis co robi metoda, jakie przyjmuje parametry
	 * oraz co metoda zwraca
	 * Kartkówka podzielona na grupy A oraz B. Grupa A opisuje testuje metody : metoda1 i metoda3 grupa B metoda2 i metoda4
	 * Należy zmienić nazwy metod na anglojęzyczne, tak aby sama nazwa sugerowała co metoda ma za zadanie robić 
	 */
	
	
	
	public static boolean metoda1(Integer i1, int[] tab ) {
		for(int i : tab) {
			if(i1.equals(i)) {
				return true;
			}
		}
		return false;
	}
	
	public static String metoda2(String text) {
		String[] split = text.split("");
		StringBuilder b = new StringBuilder();
		for(String s : split) {
			b.append(s);
			b.append(" ");
		}
		return b.toString();
	}
	
	public static boolean metoda3(String param) {
		List<String> patterns = Arrays.asList("ą", "ę", "ó", "ż", "ź", "ś", "ć");
		for(String s : param.split("")) {
			if(patterns.contains(s)) {
				return true;
			}
		}
		return false;
		
	}
	
	public static int metoda4(int i) {
		int x = 0;
		while(i!=0) {
			x += i%10;
			i /= 10;
		}
		return x;
	}

}
