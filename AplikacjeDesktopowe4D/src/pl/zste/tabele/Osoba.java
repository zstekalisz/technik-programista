package pl.zste.tabele;

import java.util.List;

public class Osoba {
	
	private String imie;
	private String nazwisko;
	
	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public static Object[][] convertData(List<Osoba> persons){
		Object[][] result = new Object[persons.size()][2];
		int index = 0;
		for(Osoba p : persons) {
			result[index][0] = p.getImie();
			result[index][1] = p.getNazwisko();
			index++;
		}
		return result;
	}

}
