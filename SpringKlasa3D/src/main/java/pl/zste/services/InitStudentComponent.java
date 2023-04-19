package pl.zste.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class InitStudentComponent {
	
	private CreateStudentService service;

	private InitStudentComponent(@Autowired CreateStudentService service) {
		this.service = service;
	}
	
	@PostConstruct
	public void init() {
		//teraz sama metoda init nie bezie tworzyła kontekstu transakcji 
		//lecz metoda create z beanu service już tak
		service.create();
	}
	
	 

}
