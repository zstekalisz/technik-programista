

package pl.kalisz.zste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TrojkatyNarzedziaTest {


	@Test
	void testCzyTrojkatJestProstokatny() {
		boolean prostokatny = TrojkatyNarzedzia.czyTrojkatJestProstokatny(3, 4, 5);
		assertTrue(prostokatny);
		boolean prostokatny2 = TrojkatyNarzedzia.czyTrojkatJestProstokatny(4, 8, 9);
		assertFalse(prostokatny2);
		boolean prostokatny3 = TrojkatyNarzedzia.czyTrojkatJestProstokatny(4, 8, 8.944271909999159D);
		assertTrue(prostokatny3);
		boolean prostokatny4 = TrojkatyNarzedzia.czyTrojkatJestProstokatny(5, 3, 4);
		assertTrue(prostokatny4);
		boolean prostokatny5 = TrojkatyNarzedzia.czyTrojkatJestProstokatny(4, 5, 3);
		assertTrue(prostokatny5);
	}

}
