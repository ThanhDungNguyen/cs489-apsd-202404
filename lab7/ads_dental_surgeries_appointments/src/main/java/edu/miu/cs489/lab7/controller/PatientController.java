package edu.miu.cs489.lab7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;

@RestController
@RequestMapping(value = "/adsweb/api/v1/patient")
public class PatientController {
    @GetMapping(value = "/list")
    public EntityResponse<List<PatientResponse>> getAllPatients() throws Exception {
        throw new Exception("Not implemented");
    }

    @PostMapping(value = "/add")
    public EntityResponse<PatientResponse> addNewPatient(PatientRequest patientRequest) throws Exception {
        throw new Exception("Not implemented");
    }
}
