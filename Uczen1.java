package pl.zste;

public class Uczen {
	
	private int[] oceny = new int[1000];
	private int index = 0;
	
	// zadanie dla grupy A - metoda dodajOcene może generować wyjątek typu RuntimeException a mianowicie NumberFormatException 
	//Wyjątek ten generowany jest przez metodą Integer.parseInt kiedy łańcych znaków nie może być zamieniony na liczbę integer. Np łańcuch "Ala ma kota"
	//Twoje zadanie to utworzyć własną klasę wyjątku(nazwa dowolna) który może być propagowany, następnie przechwycić wyjątek NumberFormatException i rzucić własny wyjątek.
	//Rzucony własny wyjątek należy propagować wyżej.
	//Następnie utwórz klasę Program z metodą main i utórz dwa obiekty klasy Uczen. 
	//Na pierwszym z obiektów wywołaj metodę dodajOcene z klasy Uczen tak aby wyjątek nie powstał.
	//Na drugim z obiektów wywołaj metodę dodajOcene z klasy Uczen tak aby wyjątek powstał.
	// Obsłuż wyjątek w metodzie main jeśli to będzie konieczne.  
	public void dodajOcene(String ocena) {
		int doDodania = Integer.parseInt(ocena);
		oceny[index] = doDodania;
		index++;
	}	

}
