package pl.zste.zadanieegzamin.arkusz2;

public class EuklidesNWD {
	
	/**
	 * @author Kamil Szmaj
	 * nazwa : obliczNWD
	 * opis : funkcja przyjmuje dwa parametry, kt�re s� liczbami ca�kowitymi
	 * @param a - liczba ca�kowita
	 * @param b - liczba ca�kowita
	 * @return - to co zwraca funkcja
	 */
	public static int obliczNWD(int a, int b) {
		while(a!=b) {
			//tak
			if(a>b) {
				//tak
				a= a-b;
			}else {
				//nie
				b=b-a;
			}
		}
			//nie
			return a;
	}

}
