package pl.zste.zadanieegzamin.arkusz3;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class SortowanieMalejaceTest {

	@Test
	public void getIndexOfMax() {
		int[] tab = new int[5];
		tab[0] = 99;
		tab[1] = 25;
		tab[2] = 41;
		tab[3] = 78;
		tab[4] = 6;
		SortowanieMalejace sortO = new SortowanieMalejace();
		Class<SortowanieMalejace> sort = SortowanieMalejace.class;
		Method method;

		try {
			method = sort.getMethod("getIndexOfMax", tab.getClass(), int.class);
			method.setAccessible(true);
			Object invoke = method.invoke(sortO, tab, 0);
			assertEquals(0, invoke);
			Object invoke2 = method.invoke(sortO, tab, 2);
			assertEquals(3, invoke2);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void sortMyTable() {
		SortowanieMalejace sort = new SortowanieMalejace();
		for(int i=1;i<=10;i++) {
			sort.tablica[i-1] = i;
		}
		sort.sortMyTable();
	}

}
