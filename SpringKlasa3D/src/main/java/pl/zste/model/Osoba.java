package pl.zste.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Osoba {
	
	protected Integer wiek;

	public Integer getWiek() {
		return wiek;
	}

	public void setWiek(Integer wiek) {
		this.wiek = wiek;
	}
	

}
