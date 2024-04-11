package pl.zste.gr1;

import java.util.Arrays;
import java.util.List;

public class MainGr1 {

	public static void main(String[] args) {
		Uczen uczen = new Uczen("Sylwia","Kolska", 16, 2);
		Uczen uczen2 = new Uczen("Sylwester","Jakubiak", 17, 3);
		Uczen uczen3 = new Uczen("Bolesław","Śniegulski", 15, 1);
		Uczen uczen4 = new Uczen("Roman","Marecki", 16, 2);
		Uczen uczen5 = new Uczen("Monika","DwadzieściaDwa", 15, 1);
		Uczen uczen6 = new Uczen("Joanna","Marucha", 15, 1);
		Uczen uczen7 = new Uczen("Zdzisław","Jarząbek", 16, 2);
		
		List<Uczen> uczniowie = Arrays.asList(uczen, uczen2, uczen3, uczen4, uczen5, uczen6,uczen7);
		uczniowie.stream().forEach(u-> System.out.println(u));
	}

}
