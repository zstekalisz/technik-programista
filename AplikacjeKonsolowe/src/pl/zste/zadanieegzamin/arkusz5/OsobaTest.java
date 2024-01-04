package pl.zste.zadanieegzamin.arkusz5;

import static org.junit.Assert.*;

import org.junit.Test;

public class OsobaTest {

	@Test
	public void test() {
		assertEquals(0, Osoba.numerator);
		System.out.println("Liczba zarejestrowanych osób "+Osoba.numerator);
		Osoba osoba = new Osoba();
		Osoba osoba2 = new Osoba(1, "Igor");
		Osoba osoba3 = new Osoba(osoba);
		osoba.wypiszImie("Jan");
		
	}

}
