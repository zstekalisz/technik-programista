package pl.kalisz.zste;

public class TrojkatyNarzedzia {
	
	public static boolean czyTrojkatJestProstokatny(double a, double b, double c) {
		if(c>a && c>b) {
			double powA = Math.pow(a, 2);
			double powB = Math.pow(b, 2);
			double powC = Math.pow(c, 2);
			powC = (double) Math.round(powC * 10000000D) / 10000000D;
			return powC == (powA + powB);
		}else if(b>a && b>c) {
			double powA = Math.pow(a, 2);
			double powB = Math.pow(b, 2);
			double powC = Math.pow(c, 2);
			powB = (double) Math.round(powB * 10000000D) / 10000000D;
			return powB == (powA + powC);
		}else {
			double powA = Math.pow(a, 2);
			double powB = Math.pow(b, 2);
			double powC = Math.pow(c, 2);
			powA = (double) Math.round(powA * 10000000D) / 10000000D;
			return powA == (powB + powC);
		}
		
		
	}

}
