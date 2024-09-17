package pl.kalisz.zste.konsola;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NumberUtilsTest extends NumberUtils {

	@Test
	public void getEvenOnlyTest() {
		List<Integer> listaWejsciowa = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> wynik = NumberUtils.getEvenOnly(listaWejsciowa);
		List<Integer> expected = Arrays.asList(2,4,6,8);
		assertEquals(expected.size(), wynik.size());
		for(int i = 0; i< wynik.size(); i++) {
			assertEquals(expected.get(i), wynik.get(i));
		}
		assertTrue(wynik.contains(8));
		assertFalse(wynik.contains(1));
		
	}
	
	@Test
	public void sortowanieBabelkoweTest() {
		int[] tablica = {23, 19, 17, 15, 88, 7, 99, 1000, 1, 2};
		NumberUtils.sortowanieBabelkowe(tablica);
		assertEquals(10, tablica.length);
		assertEquals(1, tablica[0]);
		assertEquals(17, tablica[4]);
		assertEquals(1000, tablica[9]);
	}

}
