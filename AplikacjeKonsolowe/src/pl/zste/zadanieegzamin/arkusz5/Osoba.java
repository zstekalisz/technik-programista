package pl.zste.zadanieegzamin.arkusz5;

public class Osoba {
	private Integer id;
	private String imie;
	
	public static int numerator = 0;

	public Osoba() {
		id = 0;
		imie = null;
		numerator++;
	}

	public Osoba(Integer id, String imie) {
		this.id = id;
		this.imie = imie;
		numerator++;
	}
	
	//konstruktor kopiujący
	public Osoba(Osoba os) {
		this.id = os.id;
		this.imie = os.imie;
		numerator++;
	}
	
	public void wypiszImie(String imieOsobyDoPowitania) {
		if(this.imie==null || imieOsobyDoPowitania==null) {
			System.out.println("Brak danych");
		}else {
			System.out.println("Cześć " +imieOsobyDoPowitania +" mam na imię "+this.imie);
		}
		
	}

}
