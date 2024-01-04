package pl.zste.zadanieegzamin.arkusz2;
/**
 * @author Radek Kuświk
 */
public class EuklidesNWD {

	/**
	 * @author Radek Kuświk
	 * nazwa : obliczNWD
	 * opis : funkcja przyjmuje dwa parametry, które są liczbami całkowitymi<br>
	 * opis cd : następnie oblicz największy wspólnmy dzielnik i zwraca go.
	 * @param a - liczba całkowita
	 * @param b - liczba całkowita
	 * @return - zwraca największy wspólny dzielnik liczb a i b
	 */
	public static int obliczNWD(int a, int b) {
		while (a != b) {
			// tak
			if (a > b) {
				// tak
				a = a - b;
			} else {
				// nie
				b = b - a;
			}
		}
		// nie
		return a;

	}

}
