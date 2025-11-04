package pl.kalisz.zste;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utwor {
	
	public String artist;
	public String album;
	public int songsNumber;
	public int year;
	public int downloadNumber;
	
	

	public static List<Utwor> getUtworsFromFile(){
		ArrayList<Utwor> utwory = new ArrayList<>();
		InputStream inputStream = Utwor.class.getClassLoader().getResourceAsStream("Data.txt");
		Scanner scanner = new Scanner(inputStream);
		int counter = 0;
		String[] tablica = new String[5];
		while(scanner.hasNextLine()) {
			String linijka = scanner.nextLine();
			if(linijka.isEmpty()) {
				continue;
			}
			tablica[counter] = linijka;
			counter++;
			if(counter==5) {
				counter = 0;
				Utwor utwor = new Utwor();
				utwor.artist  = tablica[0];
				utwor.album = tablica[1];
				utwor.songsNumber = Integer.parseInt(tablica[2]);
				utwor.year = Integer.parseInt(tablica[3]);
				utwor.downloadNumber = Integer.parseInt(tablica[4]);
				utwory.add(utwor);
			}
			
			
		}
		scanner.close();
		return utwory;
	}
	public static void main(String[] args) {
		List<Utwor> fromFile = getUtworsFromFile();
		System.out.println(fromFile.size());
		for(Utwor u : fromFile) {
			System.out.println(u.artist);
		}
	}
 }
