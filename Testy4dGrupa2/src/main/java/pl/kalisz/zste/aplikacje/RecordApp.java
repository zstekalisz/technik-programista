package pl.kalisz.zste.aplikacje;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.kalisz.zste.konsola.Record;

public class RecordApp {

	public static void main(String[] args) {
		InputStream stream = RecordApp.class.getClassLoader().getResourceAsStream("Data.txt");
		Scanner sc = new Scanner(stream);
		List<Record> list = readDataFile(sc);
		
		readRecords(list);

		sc.close();

	}

	public static void readRecords(List<Record> list) {
		list.forEach(r-> System.out.println(r));
	}

	public static List<Record> readDataFile(Scanner sc) {
		int licznik = 1;
		Record r = new Record();
		ArrayList<Record> records = new ArrayList<Record>();
		while (sc.hasNextLine()) {
			switch (licznik) {
				case 1:
					r.setArtist(sc.nextLine());
					licznik++;
					break;
				case 2:
					r.setAlbum(sc.nextLine());
					licznik++;
					break;
				case 3:
					r.setSongsNumber(Integer.parseInt(sc.nextLine()));
					licznik++;
					break;
				case 4:
					r.setYear(Integer.parseInt(sc.nextLine()));
					licznik++;
					break;
				case 5:
					r.setDownloadNumber(Integer.parseInt(sc.nextLine()));
					licznik++;
					break;
				default:
					sc.nextLine();
					records.add(r);
					r = new Record();
					licznik = 1;
					

			}
		
		}
		records.add(r);
		return records;
	}

}
