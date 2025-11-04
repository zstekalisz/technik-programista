package pl.kalisz.zste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Egzamin2025KonsolaTest2 {

	@Test
	void testWyszukaj() {
		Egzamin2025Konsola obj = new Egzamin2025Konsola(5);
		int[] tab = {343, 45, 1, 77, 98};
		obj.setTablica(tab);
		int index = obj.wyszukaj(27);
		assertEquals(-1, index);
		int index2 = obj.wyszukaj(45);
		assertEquals(1, index2);
		int index3 = obj.wyszukaj(98);
		assertEquals(4, index3);
		int index4 = obj.wyszukaj(123);
		assertEquals(-1, index4);
	}

	@Test
	void testNieparzyste() {
		Egzamin2025Konsola egz = new Egzamin2025Konsola(8);
		int[] tablica = {777, 66, 45, 23, 7, 2, 8, 998};
		egz.setTablica(tablica);
		int nieparzyste1 = egz.nieparzyste();
		assertEquals(4, nieparzyste1);
		int[] tablica2 = {23, 56, 87, 98, 73, 997, 723, 323};
		egz.setTablica(tablica2);
		int nieparzyste2 = egz.nieparzyste();
		assertEquals(6, nieparzyste2);
		int[] tab3 = {22, 2, 72, 88, 86, 104, 998, 666};
		egz.setTablica(tab3);
		int nieparzyste3 = egz.nieparzyste();
		assertEquals(0, nieparzyste3);
	}

	@Test
	void testSrednia() {
		Egzamin2025Konsola objekt = new Egzamin2025Konsola(10);
		int[] tab = {12, 24, 5, 7, 89, 90, 55, 67, 68, 100};
		objekt.setTablica(tab);
		double srednia1 = objekt.srednia();
		assertEquals(51.7, srednia1);
		int[] tab2 = {887, 12, 23, 345, 676, 789, 987, 999, 54, 1};
		objekt.setTablica(tab2);
		double srednia2 = objekt.srednia();
		assertEquals(477.3, srednia2);
	}

}
