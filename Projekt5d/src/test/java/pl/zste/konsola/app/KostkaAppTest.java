package pl.zste.konsola.app;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class KostkaAppTest {

	@Test
	public void sumaPunktowTest() {
		List<Integer> kostki = Arrays.asList(5, 6, 1, 2, 2);
		ArrayList<Integer> test = new ArrayList<>(kostki);
		int sumaPunktow = KostkaApp.sumaPunktow(test);
		assertEquals(4, sumaPunktow);

		List<Integer> kostki2 = Arrays.asList(6, 6, 6, 2, 2);
		ArrayList<Integer> test2 = new ArrayList<>(kostki2);
		int sumaPunktow2 = KostkaApp.sumaPunktow(test2);
		assertEquals(22, sumaPunktow2);

		List<Integer> kostki3 = Arrays.asList(5, 6, 1, 1, 2);
		ArrayList<Integer> test3 = new ArrayList<>(kostki3);
		int sumaPunktow3 = KostkaApp.sumaPunktow(test3);
		assertEquals(2, sumaPunktow3);

		List<Integer> kostki4 = Arrays.asList(5, 6, 1, 1, 2, 4, 4, 4);
		ArrayList<Integer> test4 = new ArrayList<>(kostki4);
		int sumaPunktow4 = KostkaApp.sumaPunktow(test4);
		assertEquals(14, sumaPunktow4);
	}

	@Test
	public void rzutKostkamiTest() {
		int liczbaKostek = 7;
		for (int j = 0; j < 10; j++) {
			List<Integer> rzutKostkami = KostkaApp.rzutKostkami(liczbaKostek);
			assertEquals(liczbaKostek, rzutKostkami.size());
			for (Integer i : rzutKostkami) {
				assertTrue(i >= 1 && i <= 6);
			}
		}

	}
	@Test
	public void sumaPunktwo2Test() {
		List<Integer> kostki = Arrays.asList(5, 6, 1, 2, 2, 6, 1, 1, 3);
		int sumaPunktow = KostkaApp.sumaPunktow2(kostki);
		assertEquals(19, sumaPunktow);
	}

}
