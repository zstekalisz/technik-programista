package pl.zste;

public class FabrykaSamochodow {

	private FabrykaSamochodow() {
		super();
	}
	
	public static Samochod tworzenieSamochodu(Silnik silnik, RodzajNadwozia nadwozie) {
		return new Samochod(silnik, nadwozie);
	}
	

}
