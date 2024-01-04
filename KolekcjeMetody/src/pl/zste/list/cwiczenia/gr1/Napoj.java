package pl.zste.list.cwiczenia.gr1;

import java.util.Comparator;

public class Napoj {
	private String producent;
	private String nazwa;
	private Double cena;
	
	public Napoj(String producent, String nazwa, double cena) {
		this.producent = producent;
		this.nazwa = nazwa;
		this.cena = cena;
	}
	
	public static Comparator<Napoj> porownaniePoCenie = new Comparator<Napoj>() {

		@Override
		public int compare(Napoj o1, Napoj o2) {
			if(o1.getCena()==null && o2.getCena()==null || (o1.getCena().equals(o2.getCena())))
				return 0;
			else if(o1.getCena()!=null && o2.getCena()==null || o1.getCena()> o2.getCena()) {
				return 1;
			}else {
				return -1;
			}
		}
	};
	public static Comparator<Napoj> porownaniePoNazwie = new Comparator<Napoj>() {
		
		@Override
		public int compare(Napoj o1, Napoj o2) {
			return o1.getNazwa().compareTo(o2.getNazwa());
		}
	};

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Double getCena() {
		return cena;
	}

	public void setCena(Double cena) {
		this.cena = cena;
	}

	@Override
	public String toString() {
		return "Producent " + producent + ", " + nazwa + ", cena " + cena ;
	}
	
	

}
