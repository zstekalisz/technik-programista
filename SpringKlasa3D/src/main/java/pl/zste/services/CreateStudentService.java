package pl.zste.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import jakarta.annotation.PostConstruct;
import pl.zste.model.Adres;
import pl.zste.model.Szkola;
import pl.zste.model.Uczen;
import pl.zste.repository.UczenRepository;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CreateStudentService {
	
	
	private UczenRepository uczenRepository;
	
	@Autowired
	public CreateStudentService(UczenRepository uczenRepository) {
		this.uczenRepository= uczenRepository;
	}
	
	//@PostConstruct - dla @PostConstruct wg doc. nie jest tworzony kontekst transakcji
	// więc komentujemy i przenosimy wywołanie do innego bean-a
	public void create() {
		Uczen uczen = new Uczen();
		uczen.setImie("Oskar");
		uczen.setNazwisko("Brzęczyszczykiewicz");
		uczen.setDataUrodzenia(new Date());
		uczen.setSredniaOcena(new BigDecimal("3.45"));
		uczen.setWiek(16);
		Adres adres = new Adres();
		adres.setMiasto("Kalisz");
		adres.setUlica("Częstochowska");
		adres.setPoczta("Kalisz");
		adres.setNrDomu(6);
		adres.setNrMieszkania(45);
		adres.setKodPocztowy("62-800");
		uczen.setAdres(adres);
		List<String> przedmioty = new ArrayList<>();
		przedmioty.add("j.polski");
		przedmioty.add("matematyka");
		przedmioty.add("historia");
		uczen.setPrzedmioty(przedmioty);
		Szkola szkola = new Szkola();
		szkola.setNazwaSzkoly("ZST-E Kalisz");
		szkola.setUczen(uczen);
		uczen.setSzkola(szkola);
		uczenRepository.create(uczen);
	}

}
