package pl.zste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adres {
	
	private String ulica;
	private String miasto;
	private String kodPocztowy;
	private String poczta;
	
	@Column(name = "nr_domu")
	private Integer nrDomu;
	private Integer nrMieszkania;
	
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getMiasto() {
		return miasto;
	}
	public void setMiasto(String miasto) {
		this.miasto = miasto;
	}
	public String getKodPocztowy() {
		return kodPocztowy;
	}
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}
	public String getPoczta() {
		return poczta;
	}
	public void setPoczta(String poczta) {
		this.poczta = poczta;
	}
	public Integer getNrDomu() {
		return nrDomu;
	}
	public void setNrDomu(Integer nrDomu) {
		this.nrDomu = nrDomu;
	}
	public Integer getNrMieszkania() {
		return nrMieszkania;
	}
	public void setNrMieszkania(Integer nrMieszkania) {
		this.nrMieszkania = nrMieszkania;
	}
	
	

}
