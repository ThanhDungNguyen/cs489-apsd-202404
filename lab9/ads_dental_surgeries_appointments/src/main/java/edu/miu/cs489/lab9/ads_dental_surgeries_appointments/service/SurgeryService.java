package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.service;

import java.util.List;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Surgery;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery getSurgeryById(String surgeryId);

    Surgery addNewSurgery(Surgery newSurgery);

    Surgery updateSurgery(Surgery updatedSurgery);

    boolean deleteSurgery(String surgeryId);
}
