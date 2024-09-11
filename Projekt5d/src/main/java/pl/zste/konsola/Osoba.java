package pl.zste.konsola;

public class Osoba {
	
	private String imie;
	private String nazwisko;
	private Adres adres;
	
	public Osoba(String imie, String nazwisko, Adres adres) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.adres = adres;
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
	public Adres getAdres() {
		return adres;
	}
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	public String daneTeleadresowe() {
		StringBuilder builder = new StringBuilder();
		builder.append(getAdres().getKodPocztowy());
		builder.append(" ");
		if(getAdres().getPoczta()!=null) {
			builder.append(getAdres().getPoczta());
			builder.append(", ");
			builder.append(getAdres().getMiejscowosc());
			builder.append(" ");
		}else {
			builder.append(getAdres().getMiejscowosc());
			builder.append(", ");
		}
		if(getAdres().getUlica()!=null) {
			builder.append("ul.");
			builder.append(getAdres().getUlica());
			builder.append(" ");
		}
		builder.append(getAdres().getNrDomu());
		if(getAdres().getNrMieszkania()!=null) {
			builder.append("/");
			builder.append(getAdres().getNrMieszkania());
		}
		return builder.toString();
	}
	public String pelneDaneOsoby() {
		return null;
	} 

}
