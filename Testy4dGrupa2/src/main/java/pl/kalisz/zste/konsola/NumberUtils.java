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
		
	}

}
