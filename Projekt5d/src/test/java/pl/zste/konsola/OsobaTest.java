package pl.zste.konsola;

import static org.junit.Assert.*;

import org.junit.Test;

public class OsobaTest {

	@Test
	public void test() {
		Adres adres = new Adres("62-800", "Kalisz", "11");
		adres.setUlica("Częstochowska");
		adres.setNrMieszkania("5");
		Osoba osoba = new Osoba("Tomasz", "Janicki", adres);
		String daneTeleadresowe = osoba.daneTeleadresowe();
		String expected = "62-800 Kalisz, ul.Częstochowska 11/5";
		assertEquals(expected, daneTeleadresowe);
		
		Adres adres2 = new Adres("62-800", "Kalisz", "11");
		adres2.setUlica("Częstochowska");
		adres2.setNrMieszkania("5");
		adres2.setPoczta("Kalisz");
		Osoba osoba2 = new Osoba("Tomasz", "Janicki", adres2);
		String daneTeleadresowe2 = osoba2.daneTeleadresowe();
		String expected2 = "62-800 Kalisz, Kalisz ul.Częstochowska 11/5";
		assertEquals(expected2, daneTeleadresowe2);
		
	}

}
