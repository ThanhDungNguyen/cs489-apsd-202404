package edu.miu.cs489.lab7.controller;

import java.util.List;

import org.springframework.web.servlet.function.EntityResponse;

import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;

public class PatientController {
    public EntityResponse<List<PatientResponse>> getAllPatients() throws Exception {
        throw new Exception("Not implemented");
    }

    public EntityResponse<PatientResponse> addNewPatient(PatientRequest patientRequest) throws Exception {
        throw new Exception("Not implemented");
    }
}
