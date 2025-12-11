package pl.kalisz.zste;

public class TrojkatyNarzedzia {
	
	public static boolean czyTrojkatJestProstokatny(double a, double b, double c) {
		double powC = 0;
		if(c>a && c>b) {
			powC = Math.pow(c, 2);
			powC = (double)Math.round(powC*100000000D)/100000000D;
		}//TODO dokończyć szukanie najdłuższego boku
		double powA = Math.pow(a, 2);
		double powB = Math.pow(b, 2);
		
		return powC == (powA + powB);
	}

}
