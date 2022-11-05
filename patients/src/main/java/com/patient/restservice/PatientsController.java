package com.patient.restservice;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://patient.com", maxAge = 3600)
@RestController
public class PatientsController {

	@GetMapping("/patients")
	public List<Patient> get() {
		List<Patient> patients = new ArrayList<Patient>(); 
		patients.add(new Patient(1, "patient 1"));
		patients.add(new Patient(2, "patient 2"));
		patients.add(new Patient(3, "patient 3"));
		patients.add(new Patient(4, "patient 4"));
		patients.add(new Patient(5, "patient 5"));
		return patients;
	}
	
}