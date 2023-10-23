package pl.zste.konwersja;

public class DziesietneNaBinarne {
	
	public static String convert(int number) {
		StringBuilder builder = new StringBuilder();
		int reszta = 0;
		int wynik = 0;
		while(number!=0 && number>0) {
			wynik = number/2;
			reszta = number%2;
			number = wynik;
			builder.append(reszta);
		}
		builder.reverse();
		return builder.toString();
	}

}
