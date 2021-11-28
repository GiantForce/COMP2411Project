package com.comp2411.dbms;

import com.comp2411.dbms.controller.patient.Patient;
import com.comp2411.dbms.controller.patient.PatientRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

@Rollback(false)
public class PatientRepositoryTest {
@Autowired PatientRepository repo;

    @Test
    public void testAddNewPatient(){
        Patient newPatient = new Patient();
        newPatient.setPatientID("M1234567");
        newPatient.setFirstName("Ahmed");
        newPatient.setLastName("Masud");
        newPatient.setWeight(72);
        newPatient.setHeight(180);
        newPatient.setAddress("Homantin Kwong Street");
        newPatient.setPhoneNumber("98563218");
        newPatient.setDateOfBirth("98/11/03");

        Patient savedPatient = repo.save(newPatient);

        Assertions.assertNotNull(savedPatient);
        Assertions.assertNotNull(savedPatient.getPatientID());

    }



    @Test
    public void testListAllPatients(){
        repo.findAll();
    }



}
