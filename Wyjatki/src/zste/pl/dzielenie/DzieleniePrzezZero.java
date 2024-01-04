package zste.pl.dzielenie;


import zste.pl.wyjatki.MojWyjatek;

public class DzieleniePrzezZero {

	public static void main(String[] args) {
		int liczba = 100;
		for (int i = 5; i >= -1; i--) {
			try {
				System.out.println(dzielenie(liczba, i));
			} catch (MojWyjatek ex) {
				System.out.println("Wyst¹pi³ b³¹d dla i = " + i + " " + ex.getMessage());
			} finally {
				System.out.println("Wykonane dla " + i);
			}
		}

	}

	public static int dzielenie(int liczba, int dzielnik) throws MojWyjatek {
		try {
			return liczba / dzielnik;
		} catch (ArithmeticException ex) {
			throw new MojWyjatek("dzielisz przez 0", ex);
		}
	}

}
