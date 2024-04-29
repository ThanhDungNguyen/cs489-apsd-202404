package edu.miu.cs489.lab11.ads_dental_surgeries_appointments;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.miu.cs489.lab11.dto.patient.PatientRequest;
import edu.miu.cs489.lab11.dto.patient.PatientResponse;
import edu.miu.cs489.lab11.exception.DataNotFoundException;
import edu.miu.cs489.lab11.service.PatientService;

@SpringBootTest
class AdsDentalSurgeriesAppointmentsApplicationTests {
	@Autowired
	private PatientService patientService;

	@Test
	void canFindExistingPatient() throws DataNotFoundException {
		var patientRequest = new PatientRequest("P001", "TestFirstName", "TestLastName", "111-111-1111",
				"testf.testl@email.com", LocalDate.of(1988, 1, 1), null);
		patientService.addNewPatient(patientRequest);

		var expectedResponse = new PatientResponse("P001", "TestFirstName", "TestLastName", "111-111-1111",
				"testf.testl@email.com", LocalDate.of(1988, 1, 1), null);

		Assertions.assertEquals(patientService.getPatientById("P001"), expectedResponse);
	}

	@Test
	void canHandleFindingNonExistingPatient() throws DataNotFoundException {
		var patientRequest = new PatientRequest("P001", "TestFirstName", "TestLastName", "111-111-1111",
				"testf.testl@email.com", LocalDate.of(1988, 1, 1), null);
		patientService.addNewPatient(patientRequest);

		Assertions.assertThrows(DataNotFoundException.class, () -> {
			patientService.getPatientById("P002");
		});
	}

}
