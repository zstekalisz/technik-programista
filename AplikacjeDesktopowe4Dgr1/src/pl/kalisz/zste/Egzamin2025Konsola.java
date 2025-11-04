package pl.kalisz.zste;


import java.util.Random;

public class Egzamin2025Konsola {
	
	private int[] tablica;
	private int rozmiarTablicy;
	
	

	public Egzamin2025Konsola(int rozmiarTablicy) {
		this.rozmiarTablicy = rozmiarTablicy;
		this.tablica = new int[rozmiarTablicy];
		for(int i =0; i<rozmiarTablicy; i++) {
			Random random = new Random();
			int liczba = random.nextInt(1000)+1;
			this.tablica[i] = liczba;
		}
	}
	
	protected void setTablica(int[] tablica) {
		if(this.tablica.length==tablica.length) {
			this.tablica = tablica;
		}	
	}





	public void pokazWszystkieLiczby() {
		for(int i = 0; i<rozmiarTablicy; i++) {
			System.out.println(i+":"+tablica[i]);
		}
	}
	public int wyszukaj(int liczbaDoWyszukania) {
		for(int i = 0; i<rozmiarTablicy; i++) {
			if(liczbaDoWyszukania==tablica[i]) {
				return i;
			}
		}
		return -1;
	}
	public int nieparzyste() {
		int iloscNieparzystych = 0;
		for(int i = 0; i<rozmiarTablicy; i++) {
			if(tablica[i]%2!=0) {
				iloscNieparzystych++;
				System.out.println(tablica[i]);
			}
		}
		return iloscNieparzystych;
	}

	public double srednia() {
		int suma = 0;
		for(int i = 0; i<rozmiarTablicy; i++) {
			suma = suma + tablica[i];
			//suma += tablica[i];
		}
		return (double)suma/rozmiarTablicy;
	}
	
	public static void main(String[] args) {
		Egzamin2025Konsola konsola = new Egzamin2025Konsola(3);
		konsola.pokazWszystkieLiczby();
		int index = konsola.wyszukaj(27);
		if(index!=-1) {
			System.out.println("Znalazłem liczbę pod indeksem "+index);
		}
		int nieparzysteIlosc = konsola.nieparzyste();
		System.out.println("W tablicy znalazłem "+nieparzysteIlosc+ " liczb nieparzystych");
		double srednia = konsola.srednia();
		System.out.println("Średnia arytmetyczna liczb w tablicy wynosi "+srednia);
	}
	
	


}
