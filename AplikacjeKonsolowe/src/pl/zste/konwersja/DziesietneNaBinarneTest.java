package pl.zste.konwersja;

import static org.junit.Assert.*;

import org.junit.Test;

public class DziesietneNaBinarneTest {

	@Test
	public void convert() {
		String binaryEight = DziesietneNaBinarne.convert(8);
		assertEquals("1000", binaryEight);
		String binaryTen = DziesietneNaBinarne.convert(10);
		assertNotEquals("1011", binaryTen);
		assertEquals("1010", binaryTen);
		String bigBinary = DziesietneNaBinarne.convert(789456);
		assertEquals("11000000101111010000", bigBinary);
	}

}
