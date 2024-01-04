package pl.zadanie;

public class Main {

	public static void main(String[] args) {
		Dwa[] tablicaDwojek = {new Dwa(0, 0), new Dwa(20, 8),new Dwa(33, 44),new Dwa(50, 50)};
		Wspolrzedne<Dwa> wspolrzedne = new Wspolrzedne<Dwa>(tablicaDwojek);
		
		Trzy[] tablicaTrojek = {new Trzy(0, 0, 0), new Trzy(20, 8, 19),new Trzy(33, 44, 55),new Trzy(100,50, 50)};
		Wspolrzedne<? extends Trzy> wspolrzedne2 = new Wspolrzedne<Trzy>(tablicaTrojek);
		
		Cztery[] tablicaCzworek = {new Cztery(0, 0, 0,0), new Cztery(0,20, 8, 19)};
		Wspolrzedne<Cztery> wspolrzedne3 = new Wspolrzedne<Cztery>(tablicaCzworek);
		
		OperacjeNaWspolrzednych.pokazXY(wspolrzedne3);
		OperacjeNaWspolrzednych.pokazXY(wspolrzedne2);
		OperacjeNaWspolrzednych.pokazXY(wspolrzedne);
		
		//OperacjeNaWspolrzednych.pokazXYZ(wspolrzedne);
		
		OperacjeNaWspolrzednych.pokazXYZ(wspolrzedne2);
		OperacjeNaWspolrzednych.pokazXYZ(wspolrzedne3);
		
		//OperacjeNaWspolrzednych.pokazXYZR(wspolrzedne2);
		
		OperacjeNaWspolrzednych.pokazXYZR(wspolrzedne3);	
	}

}
