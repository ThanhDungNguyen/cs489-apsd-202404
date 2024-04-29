package edu.miu.cs489.lab11.ads_dental_surgeries_appointments;

import java.time.LocalDate;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import edu.miu.cs489.lab11.controller.PatientController;
import edu.miu.cs489.lab11.dto.patient.PatientResponse;
import edu.miu.cs489.lab11.service.PatientService;

@WebMvcTest(PatientController.class)
public class PatientControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PatientService patientService;

    @Test
    void patientControllerShouldReturnCorrectData() throws Exception {
        var patient1 = new PatientResponse("P001", "TestFirstName", "TestLastName", "111-111-1111",
                "testf.testl@email.com", LocalDate.of(1988, 1, 1), null);
        var patient2 = new PatientResponse("P002", "TestFirstName", "TestLastName", "111-111-2222",
                "testf.testl@email.com", LocalDate.of(1988, 1, 1), null);
        List<PatientResponse> patients = List.of(patient1, patient2);

        Mockito.when(patientService.getAllPatients()).thenReturn(patients);

        mockMvc.perform(MockMvcRequestBuilders.get("/adsweb/api/v1/patient/list"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.jsonPath("$.size()", CoreMatchers.is(2)));
    }
}
