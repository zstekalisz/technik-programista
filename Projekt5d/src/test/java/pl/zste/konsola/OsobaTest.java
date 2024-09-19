package pl.zste.konsola;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OsobaTest {
	
	Osoba os;
	Osoba os2;
	
	@Before
	public void init() {
		Adres adres = new Adres("62-800", "Kalisz", "11");
		adres.setUlica("Częstochowska");
		adres.setNrMieszkania("5");
		os = new Osoba("Tomasz", "Janicki", adres);
		os.setNip("111222334a");
		Adres adres2 = new Adres("62-800", "Kalisz", "11");
		adres2.setUlica("Częstochowska");
		adres2.setNrMieszkania("5");
		adres2.setPoczta("Kalisz");
		os2 = new Osoba("Tomasz", "Janicki", adres2);
		os2.setNip("1234567890");
	}

	@Test
	public void daneTeleadresoweTest() {
		
		String daneTeleadresowe = os.daneTeleadresowe();
		String expected = "62-800 Kalisz, ul.Częstochowska 11/5";
		assertEquals(expected, daneTeleadresowe);
		
		String daneTeleadresowe2 = os2.daneTeleadresowe();
		String expected2 = "62-800 Kalisz, Kalisz ul.Częstochowska 11/5";
		assertEquals(expected2, daneTeleadresowe2);
		
	}
	@Test
	public void pelneDaneOsobyTest() {
		String expected = "Tomasz Janicki 62-800 Kalisz, ul.Częstochowska 11/5";
		assertEquals(expected, os.pelneDaneOsoby());
		String expected2 = "Tomasz Janicki NIP: 123-456-78-90 62-800 Kalisz, Kalisz ul.Częstochowska 11/5";
		assertEquals(expected2, os2.pelneDaneOsoby());
	}

}
