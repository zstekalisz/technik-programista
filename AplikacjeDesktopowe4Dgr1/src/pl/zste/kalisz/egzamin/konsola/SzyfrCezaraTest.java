package pl.zste.kalisz.egzamin.konsola;

import static org.junit.Assert.*;

import org.junit.Test;

public class SzyfrCezaraTest {

	@Test
	public void testZaszyfruj() {
		String zaszyfrowanyK5 = SzyfrCezara.zaszyfruj("jakies zdanie", -5);
		assertEquals("evfdzn uyvidz", zaszyfrowanyK5);
		String zaszykrowanyK3 = SzyfrCezara.zaszyfruj("abc", 3);
		assertEquals("def", zaszykrowanyK3);
		String zawijanieK3 = SzyfrCezara.zaszyfruj("xyz", 3);
		assertEquals("abc", zawijanieK3);
		String kluczminus3 = SzyfrCezara.zaszyfruj("def", -3);
		assertEquals("abc", kluczminus3);
		String K29 = SzyfrCezara.zaszyfruj("abc", 29);
		assertEquals("def", K29);
		String k2 = SzyfrCezara.zaszyfruj("ab cd", 2);
		assertEquals("cd ef", k2);
		
	}

	@Test
	public void testOdszyfruj() {
		String odszyfrowanyK5 = SzyfrCezara.odszyfruj("evfdzn uyvidz", -5);
		assertEquals("jakies zdanie", odszyfrowanyK5);
		String odszyfrowanyK3 = SzyfrCezara.odszyfruj("def", 3);
		assertEquals("abc", odszyfrowanyK3);
		String zawikanieK3 = SzyfrCezara.odszyfruj("abc", 3);
		assertEquals("xyz", zawikanieK3);
	}

}
