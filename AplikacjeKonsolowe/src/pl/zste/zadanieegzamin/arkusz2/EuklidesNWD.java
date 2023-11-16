package pl.zste.zadanieegzamin.arkusz2;

public class EuklidesNWD {
	
	/**
	 * @author Kamil Szmaj
	 * nazwa : obliczNWD
	 * opis : funkcja przyjmuje dwa parametry, które s¹ liczbami ca³kowitymi
	 * @param a - liczba ca³kowita
	 * @param b - liczba ca³kowita
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
