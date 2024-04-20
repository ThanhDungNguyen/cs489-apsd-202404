package edu.miu.cs489.lab7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;
import edu.miu.cs489.lab7.service.PatientService;

@RestController
@RequestMapping(value = "/adsweb/api/v1/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping(value = "/list")
    public ResponseEntity<List<PatientResponse>> getAllPatients() {
        var patients = patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<PatientResponse> addNewPatient(@RequestBody PatientRequest patientRequest) {
        var patientResponse = patientService.addNewPatient(patientRequest);
        return new ResponseEntity<>(patientResponse, HttpStatus.OK);
    }
}
