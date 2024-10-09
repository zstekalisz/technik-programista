package pl.zste.konsola.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.zste.konsola.MusicRecord;

public class RecordsApp {

	public static void main(String[] args) {
		ArrayList<MusicRecord> records = new ArrayList<>();
		readFile(records);
		records.forEach(r-> System.out.println(r));
		System.out.println(records.size());
		

	}
	
	@SuppressWarnings("resource")
	public static void readFile(List<MusicRecord> records) {
		Scanner sc = new Scanner(RecordsApp.class.getClassLoader().getResourceAsStream("Data.txt"));
		int index = 1;
		MusicRecord record = new MusicRecord();
		while (sc.hasNextLine()) {
			String nextLine = sc.nextLine();
			switch(index) {
				case 1 : 
					record.setArtist(nextLine);
					index++;
					break;
				
				case 2 :
					record.setAlbum(nextLine);
					index++;
					break;
				case 3 :
					record.setSongsNumber(Integer.parseInt(nextLine));
					index++;
					break;
				case 4 :
					record.setYear(Integer.parseInt(nextLine));
					index++;
					break;
				case 5 :
					record.setDownloadNumber(Long.parseLong(nextLine));
					index++;
					break;
				case 6 :
					index = 1;
					records.add(record);
					record = new MusicRecord();
					
			}
			
			
		}
		records.add(record);
		sc.close();
		
	}

}
