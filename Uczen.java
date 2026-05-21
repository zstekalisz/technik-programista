package pl.zste;

public class Uczen {
	
	private String imie;
	private int[] oceny = new int[3];
	private int index = 0;
	
	// zadanie dla grupy A - metoda dodajOcene może generować wyjątek typu RuntimeException a mianowicie IndexOutOfBoundException 
	//Twoje zadanie to utworzyć własną klasę wyjątku(nazwa dowolna) który może być propagowany, następnie przechwycić wyjątek IndexOutOfBoundException i rzucić własny wyjątek.
	//Rzucony własny wyjątek należy propagować wyżej.
	//Następnie utwórz klasę Program z metodą main i utórz dwa obiekty klasy Uczen. 
	//Na pierwszym z obiektów wywołaj metodę dodajOcene z klasy Uczen tak aby wyjątek nie powstał.
	//Na drugim z obiektów wywołaj metodę dodajOcene z klasy Uczen tak aby wyjątek powstał.
	// Obsłuż wyjątek w metodzie main jeśli to będzie konieczne.  
	public void dodajOcene(int ocena) {
		oceny[index] = ocena;
		index++;
	}
	
	
	// zadanie dla grupy B - metoda dlugosc może generować wyjątek typu RuntimeException a mianowicie NullPointerException 
	//Twoje zadanie to utworzyć własną klasę wyjątku(nazwa dowolna) który może być propagowany, następnie przechwycić wyjątek NullPointerException i rzucić własny wyjątek.
	//Rzucony własny wyjątek należy propagować wyżej.
	//Następnie utwórz klasę Program z metodą main i utórz dwa obiekty klasy Uczen.
	//Na pierwszym z obiektów wywołaj metodę dlugosc z klasy Uczen tak aby wyjątek powstał.
	//Na drugim z obiektów wywołaj metodę dlugosc z klasy Uczen tak aby wyjątek nie powstał.
	//Obsłuż wyjątek w metodzie main jeśli to będzie konieczne.
	private int dlugosc() {
		return this.imie.length();	
	}

	public String getImie() {
		return imie;
	}


	public void setImie(String imie) {
		this.imie = imie;
	}
	
	

}
