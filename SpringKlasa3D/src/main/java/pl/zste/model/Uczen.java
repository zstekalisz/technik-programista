package pl.zste.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "uczniowie")
@NamedQueries(value = { 
		@NamedQuery(name = "GETALL", query = "select u from Uczen u"), 
		@NamedQuery(name = "FIND_UCZEN_BY_NAME", query = "select u from Uczen u where u.nazwisko = :nazwisko") })
public class Uczen extends Osoba{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "imie_ucznia", nullable = true)
	private String imie;
	
	@Nonnull
	@Basic(optional = false)
	private String nazwisko;
	
	@Column(name="SREDNIA_OCENA", precision = 25, scale = 6)
	private BigDecimal sredniaOcena;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUrodzenia;
	
	@Embedded
	@AttributeOverrides({
			@AttributeOverride(name = "kodPocztowy", column = @Column(name = "kod_pocztowy")),
			@AttributeOverride(name = "nrDomu", column = @Column(name = "nr_domu")),
			@AttributeOverride(name = "nrMieszkania", column = @Column(name = "nr_mieszkania"))
		})
	private Adres adres;
	
	@ElementCollection
	@CollectionTable(name = "PRZEDMIOTY_UCZNIA", joinColumns = @JoinColumn(name = "id_uczen"))
	@Column(name = "ulubione")
	private List<String> przedmioty;

	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private Szkola szkola;
	

	public Long getId() {
		return id;
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

	public BigDecimal getSredniaOcena() {
		return sredniaOcena;
	}

	public void setSredniaOcena(BigDecimal sredniaOcena) {
		this.sredniaOcena = sredniaOcena;
	}

	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public List<String> getPrzedmioty() {
		if(this.przedmioty==null) {
			przedmioty = new ArrayList<>();
		}
		return przedmioty;
	}

	public void setPrzedmioty(List<String> przedmioty) {
		this.przedmioty = przedmioty;
	}

	public Szkola getSzkola() {
		return szkola;
	}

	public void setSzkola(Szkola szkola) {
		this.szkola = szkola;
	}
	
	

}
