package pl.kalisz.zste;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Record {
	
	public String artist;
	public String album;
	public int songsNumber;
	public int year;
	public int downloadNumber;
	
	
	
	@SuppressWarnings("resource")
	public static List<Record> getRecordsFromFile(){
		ArrayList<Record> resultList = new ArrayList<>();
		InputStream inputStream = Record.class.getClassLoader().getResourceAsStream("Data.txt");
		Scanner scanner = new Scanner(inputStream);
		List<String> lines = new ArrayList<>();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			lines.add(line);
		}
		int counter = 1;
		Record record = new Record();
		for(String line : lines) {
			switch(counter) {
			case 1: {
				record.artist = line;
				break;
			}
			case 2: {
				record.album = line;
				break;
			}
			case 3: {
				record.songsNumber = Integer.parseInt(line);
				break;
			}
			case 4: {
				record.year = Integer.parseInt(line);
				break;
			}
			case 5: {
				record.downloadNumber = Integer.parseInt(line);
				resultList.add(record);
				break;
			}
			default:{
				counter=0;
				record = new Record();
			}
			
			}
			counter++;
		}
		return resultList;
	}
	
	public static void main(String[] args) {
		List<Record> recordsFromFile = getRecordsFromFile();
		System.out.println(recordsFromFile.size());
		for(Record r : recordsFromFile) {
			System.out.println(r.artist);
		}
	}

}
