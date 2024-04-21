package edu.miu.cs489.lab7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.miu.cs489.lab7.dto.patient.PatientRequest;
import edu.miu.cs489.lab7.dto.patient.PatientResponse;
import edu.miu.cs489.lab7.exception.DataNotFoundException;
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

    @GetMapping(value = "/get/{patientId}")
    public ResponseEntity<?> getPatientById(@PathVariable String patientId) {
        try {
            var patientResponse = patientService.getPatientById(patientId);
            return new ResponseEntity<PatientResponse>(patientResponse, HttpStatus.OK);
        } catch (DataNotFoundException exception) {
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/register")
    public ResponseEntity<PatientResponse> registerNewPatient(@RequestBody PatientRequest patientRequest) {
        var patientResponse = patientService.addNewPatient(patientRequest);
        return new ResponseEntity<>(patientResponse, HttpStatus.OK);
    }

    @PutMapping(value = "/update/{patientId}")
    public ResponseEntity<?> updatePatient(@PathVariable String patientId,
            @RequestBody PatientRequest updatedPatientRequest) {
        try {
            var patientResponse = patientService.updatePatient(patientId, updatedPatientRequest);
            return new ResponseEntity<PatientResponse>(patientResponse, HttpStatus.OK);
        } catch (DataNotFoundException exception) {
            return new ResponseEntity<String>(exception.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
}
