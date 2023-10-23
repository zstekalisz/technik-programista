package pl.zste.konwersja;

import static org.junit.Assert.*;

import org.junit.Test;

public class DziesietneNaBinarneTest {

	@Test
	public void convert() {
		String binaryEight = DziesietneNaBinarne.convert(8);
		assertEquals("1000", binaryEight);
	}

}
