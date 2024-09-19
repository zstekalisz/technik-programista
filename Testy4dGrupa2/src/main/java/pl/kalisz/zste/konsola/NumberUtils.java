package pl.kalisz.zste.konsola;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumberUtils {
	
	public static List<Integer> getEvenOnly(List<Integer> numbers){
		//return numbers.stream().filter(numerek-> numerek%2==0).collect(Collectors.toList());
		// to samo w pętli
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i<numbers.size(); i++) {
			Integer number = numbers.get(i);
			if(number%2==0) {
				result.add(number);
			}
		}
		return result;			
	}
	
	public static void sortowanieBabelkowe(int[] tablica) {
		for(int i = 0; i< tablica.length; i++) {
			for(int j = 0; j< tablica.length-1; j++) {
				if(tablica[j]> tablica[j+1]) {
					int cache = tablica[j];
					tablica[j] = tablica[j+1];
					tablica[j+1] = cache;
				}
			}
		}
		
	}
	
	public static void sortowanieBabelkoweMalejace(int[] tablica) {
		for(int i = 0; i< tablica.length; i++) {
			for(int j = 0; j< tablica.length-1; j++) {
				if(tablica[j]< tablica[j+1]) {
					int cache = tablica[j];
					tablica[j] = tablica[j+1];
					tablica[j+1] = cache;
				}
			}
		}
		
	}
	public static char sprawdzeniePlci(int[] pesel) {
		if(pesel.length!= 11)
			throw new RuntimeException("Błedny numer PESEL");
		if(pesel[9]%2==0) {
			return 'K';
		}else {
			return 'M';
		}
	}
	
	public static boolean sprawdzenieSumyKontrolnej(int[] pesel) {
		if(pesel.length!= 11)
			throw new RuntimeException("Błedny numer PESEL");
		int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
		int sumaKontrolna = 0; 
		for(int i = 0; i<10; i++) {
			int iloczyn = pesel[i]* wagi[i];
			sumaKontrolna += iloczyn;
			
		}
		int m = sumaKontrolna%10;
		int r = 0;
		if(m==0) {
			r = 0;
		}else {
			r = 10-m;
		}
		if(r == pesel[10]) {
			return true;
		}	
		return false;
	}

}
