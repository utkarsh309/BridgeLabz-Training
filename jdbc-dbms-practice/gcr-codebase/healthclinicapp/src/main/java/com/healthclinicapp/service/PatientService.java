package com.healthclinicapp.service;

import com.healthclinicapp.dao.PatientDao;
import com.healthclinicapp.exception.DuplicatePatientException;
import com.healthclinicapp.model.Patient;


public class PatientService {

	PatientDao patientDao=new PatientDao();
	
	public int registerPatient(Patient patient) throws DuplicatePatientException{
		
		boolean exists=patientDao.isPatientExists(
				patient.getPhone(),patient.getEmail());
		
		if(exists) {
			throw new DuplicatePatientException(
                    "Patient already registered with this phone or email");
			
		}
		
		return patientDao.insertPatient(patient);
	}
	
}
