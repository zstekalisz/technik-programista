package pl.kalisz.zste.aplikacje;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

import pl.kalisz.zste.konsola.Record;

public class RecordAppTest {

	@SuppressWarnings("resource")
	@Test
	public void testReadDataFile() {
		Record record = new Record();
		record.setArtist("Michał Wiśniewski");
		record.setAlbum("\"Ich troje\"");
		record.setYear(2005);
		record.setSongsNumber(13);
		record.setDownloadNumber(231324342);
		InputStream istream = RecordAppTest.class.getClassLoader().getResourceAsStream("DataTest.txt");
		Scanner scanner = new Scanner(istream);
		List<Record> list = RecordApp.readDataFile(scanner);
		assertEquals(3, list.size());
		assertEquals("\"The Now Now\"", list.get(0).getAlbum());
		assertEquals("My Chemical Romance", list.get(1).getArtist());
		assertEquals(4000230, list.get(2).getDownloadNumber());
		
		InputStream istream2 = RecordAppTest.class.getClassLoader().getResourceAsStream("DataTest2.txt");
		Scanner scanner2 = new Scanner(istream2);
		List<Record> list2 = RecordApp.readDataFile(scanner2);
		assertEquals(15, list2.size());
		assertEquals(record, list2.get(14));
		
	}

}
