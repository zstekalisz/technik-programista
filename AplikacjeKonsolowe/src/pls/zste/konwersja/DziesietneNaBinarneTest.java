package pls.zste.konwersja;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DziesietneNaBinarneTest {
	
	@Test
	public void convert() {
		String binaryEight = DziesiateNaBinarne.convert(8);
		assertEquals("1000", binaryEight);
		String binaryTen = DziesiateNaBinarne.convert(10);
		assertEquals("1010", binaryTen);
		String bigBinary = DziesiateNaBinarne.convert(789456);
		assertEquals("11000000101111010000",bigBinary);
	}	

}
 