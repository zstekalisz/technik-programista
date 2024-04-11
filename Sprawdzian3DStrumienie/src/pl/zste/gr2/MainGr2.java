package pl.zste.gr2;

import java.util.Arrays;
import java.util.List;

import pl.zste.gr2.Ksiazka.RodzajKsiazki;

public class MainGr2 {

	public static void main(String[] args) {
		Ksiazka ksiazka = new Ksiazka("Lalka", RodzajKsiazki.lektura, 900);
		Ksiazka ksiazka2 = new Ksiazka("W pustyni i w puszczy", RodzajKsiazki.lektura, 760);
		Ksiazka ksiazka3 = new Ksiazka("Anna Karenina", RodzajKsiazki.powiesc, 565);
		Ksiazka ksiazka4 = new Ksiazka("Predator i przyjaciele", RodzajKsiazki.kryminal, 55);
		Ksiazka ksiazka5 = new Ksiazka("Terminator też człowiek", RodzajKsiazki.kryminal, 800);
		Ksiazka ksiazka6 = new Ksiazka("Zabawy z kotem", RodzajKsiazki.lektura, 740);
		Ksiazka ksiazka7 = new Ksiazka("Moja prawda", RodzajKsiazki.powiesc, 1200);
		Ksiazka ksiazka8 = new Ksiazka("Rozmowy z katem", RodzajKsiazki.lektura, 843);
		Ksiazka ksiazka9 = new Ksiazka("Mitologia", RodzajKsiazki.lektura, 350);
		Ksiazka ksiazka10 = new Ksiazka("Emancypantki", RodzajKsiazki.powiesc, 900);
		
		List<Ksiazka> ksiazki = Arrays.asList(ksiazka, ksiazka2,ksiazka3, ksiazka4, 
				ksiazka5, ksiazka6,ksiazka7, ksiazka8, ksiazka9, ksiazka10);
		ksiazki.stream().forEach(k-> System.out.println(k));

	}

}
