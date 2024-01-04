package pl.zste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "szkoly")
public class Szkola {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAZWA_SZKOLY")
	private String nazwaSzkoly;
	
	@OneToOne(mappedBy = "szkola") // to jest nazwa pola z którego mapowana jest istniejąca  relacja bazodanowa
	private Uczen uczen;			// w naszym przypadku jest to klasa Uczen pole private Szkola szkola
	
	public Long getId() {
		return id;
	}

	public String getNazwaSzkoly() {
		return nazwaSzkoly;
	}

	public void setNazwaSzkoly(String nazwaSzkoly) {
		this.nazwaSzkoly = nazwaSzkoly;
	}
	

	public Uczen getUczen() {
		return uczen;
	}

	public void setUczen(Uczen uczen) {
		this.uczen = uczen;
	}

	@Override
	public String toString() {
		return "Szkola - nazwaSzkoly = " + nazwaSzkoly;
	}
	
	

}
