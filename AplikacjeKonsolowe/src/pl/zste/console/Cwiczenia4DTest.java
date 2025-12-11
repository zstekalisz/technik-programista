package pl.zste.console;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cwiczenia4DTest {

	@Test
	public void testPoliczSamogloski() {
		int pierwszyPrzypadek = Cwiczenia4D.policzSamogloski(null);
		assertEquals(0, pierwszyPrzypadek);
		int drugiPrzypadek = Cwiczenia4D.policzSamogloski("Ala ma kota Barbarę");
		assertEquals(8, drugiPrzypadek);
		int trzeciPrzypadek = Cwiczenia4D.policzSamogloski("Wąski był dzisiaj bardzo grzeczny i uprzejmy");
		assertEquals(14, trzeciPrzypadek);
	}

}
