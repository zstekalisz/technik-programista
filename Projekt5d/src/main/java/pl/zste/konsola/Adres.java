package pl.zste.konsola;

public class Adres {
	
	private String poczta;
	private String kodPocztowy;
	private String miejscowosc;
	private String ulica;
	private String nrDomu;
	private String nrMieszkania;
	
	public Adres(String kodPocztowy, String miejscowosc, String nrDomu) {
		this.kodPocztowy = kodPocztowy;
		this.miejscowosc = miejscowosc;
		this.nrDomu = nrDomu;
	}
	
	public String getPoczta() {
		return poczta;
	}
	public void setPoczta(String poczta) {
		this.poczta = poczta;
	}
	public String getKodPocztowy() {
		return kodPocztowy;
	}
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}
	public String getMiejscowosc() {
		return miejscowosc;
	}
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getNrDomu() {
		return nrDomu;
	}
	public void setNrDomu(String nrDomu) {
		this.nrDomu = nrDomu;
	}
	public String getNrMieszkania() {
		return nrMieszkania;
	}
	public void setNrMieszkania(String nrMieszkania) {
		this.nrMieszkania = nrMieszkania;
	}
	
	
}
