package pl.zste.wyliczenia;

public class TestujemyWyliczenia {
	
	public static void main(String[] args) {
		DniTygodnia dn = DniTygodnia.sroda;
		String nazwa = dn.getNazwa();
		int nrDnia = dn.getNrDnia();
		System.out.println(nazwa + " "+ nrDnia);
		DniTygodnia[] values = DniTygodnia.values();
		for(DniTygodnia dzien : values) {
			System.out.println(dzien.getNazwa());
		}
	}

}
