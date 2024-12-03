package pl.kalisz.zste.grupa1;

import java.nio.file.attribute.AclEntry.Builder;
import java.util.Objects;

public class KartkowkaUtils {
	
	/**
	 * klasa z metodami dla których należy dopisać dokumentację i testy jednostkowe.
	 * w dokumentacji opisujemy autora - wpisujemy siebie, opis co robi metoda, jakie przyjmuje parametry
	 * oraz co metoda zwraca
	 * Kartkówka podzielona na grupy A oraz B. Grupa A opisuje testuje metody : metoda1 i metoda3 grupa B metoda2 i metoda4
	 * Należy zmienić nazwy metod na anglojęzyczne, tak aby sama nazwa sugerowała co metoda ma za zadanie robić 
	 */
	
	
	
	public static int metoda1(String text) {
		String[] split = text.split("");
		char a = 'a';
		String s = Character.toString(a);
		int index = 0;
		for(int i = 0; i< split.length; i++) {
			String string = split[i];
			if(Objects.equals(s, string)) {
				index++;
			}
			
		}
		return index;
	}
	public static String metoda2(String text) {
		String[] split = text.split("");
		char a = 'b';
		String ch = Character.toString(a);
		for(int i = 0; i< split.length; i++) {
			String string = split[i];
			if(Objects.equals(ch, string)) {
				split[i] = null;
			}
			
		}
		StringBuilder b = new StringBuilder();
		for(String s : split) {
			if(s!=null) {
				b.append(s);
			}
		}
		return b.toString();
	}
	
	public static double metoda3(int[] tab) {
		double result = 0;
		for(int i : tab) {
			result+=i;	
		}
		return result/tab.length;
	}
	
	public static boolean metoda4(String text) {
		return text.length()%2==0;
	}
	
	
	

}
