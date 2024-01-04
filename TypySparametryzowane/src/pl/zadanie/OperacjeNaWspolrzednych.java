package pl.zadanie;

public class OperacjeNaWspolrzednych {

	public static void pokazXY(Wspolrzedne<?> ws) {
		for(Dwa dwa : ws.getTablica()) {
			System.out.println(dwa.getX()+" "+ dwa.getY());
		}
	}
	
	public static void pokazXYZ(Wspolrzedne<? extends Trzy> ws) {
		for(Trzy trzy : ws.getTablica()) {
			System.out.println(trzy.getX()+" "+ trzy.getY()+" "+trzy.getZ());
		}
	}
	
	public static void pokazXYZR(Wspolrzedne<? extends Cztery> ws) {
		for(Cztery czt : ws.getTablica()) {
			System.out.println(czt.getX()+" "+ czt.getY()+" "+czt.getZ()+ " " + czt.getR());
		}
	}
}
