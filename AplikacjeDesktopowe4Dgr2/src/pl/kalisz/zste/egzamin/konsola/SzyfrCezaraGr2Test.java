package pl.kalisz.zste.egzamin.konsola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SzyfrCezaraGr2Test {

	@Test
	void testCrypt() {
		String a = "abc";
		String cryptA = SzyfrCezaraGr2.crypt(a.split(""), 3);
		assertEquals("def", cryptA);
		
		String a2 = "xyz";
		String cryptA2 = SzyfrCezaraGr2.crypt(a2.split(""), 3);
		assertEquals("abc", cryptA2);
		
		String a3 = "def";
		String cryptA3 = SzyfrCezaraGr2.crypt(a3.split(""), -3);
		assertEquals("abc", cryptA3);
	}

	@Test
	void testDecrypt() {
		String a = "def";
		String decryptA = SzyfrCezaraGr2.decrypt(a.split(""), 3);
		assertEquals("abc", decryptA);
		
	}

}
