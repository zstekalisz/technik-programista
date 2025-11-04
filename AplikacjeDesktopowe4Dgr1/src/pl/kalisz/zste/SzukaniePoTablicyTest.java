package pl.kalisz.zste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SzukaniePoTablicyTest {

	@Test
	void testSearchTable() {
		int[] tab = {1,2,3,4,5,6,7,8,9};
		boolean flaga = SzukaniePoTablicy.searchTable(7, tab, false);
		assertTrue(flaga);
		boolean flaga2 = SzukaniePoTablicy.searchTable(126, tab, false);
		assertFalse(flaga2);
	}

}
