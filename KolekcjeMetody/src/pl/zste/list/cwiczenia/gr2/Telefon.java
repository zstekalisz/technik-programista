package pl.zste.list.cwiczenia.gr2;

import java.util.Comparator;

public class Telefon {
	
	private String marka;
	private String model;
	private double przekatna;
	private Double cena;
	
	public static Comparator<Telefon> porownaniePoCenie = new Comparator<Telefon>() {
		@Override
		public int compare(Telefon o1, Telefon o2) {
			if(o1.getCena() == null && o2.getCena() == null ||  o1.getCena().equals(o2.getCena())) {
				return 0;
			}else if(o1.getCena()!= null && o2.getCena() ==null || o1.getCena() > o2.getCena()) {
				return 1;
			}else {
				return -1;
			}			
		}
	};
	
	public static Comparator<Telefon> porownaniePoMarce =  new Comparator<Telefon>() {	
		@Override
		public int compare(Telefon o1, Telefon o2) {
			return o1.getMarka().compareTo(o2.getMarka());
		}
	};
		

	
	public Telefon(String marka, String model, double przekatna, Double cena) {
		this.marka = marka;
		this.model = model;
		this.przekatna = przekatna;
		this.cena = cena;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrzekatna() {
		return przekatna;
	}
	public void setPrzekatna(double przekatna) {
		this.przekatna = przekatna;
	}
	public Double getCena() {
		return cena;
	}
	public void setCena(Double cena) {
		this.cena = cena;
	}
	@Override
	public String toString() {
		return marka + " " + model + " cena :" + cena;
	}
	
}
