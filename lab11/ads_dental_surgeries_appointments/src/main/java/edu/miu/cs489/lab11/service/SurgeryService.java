package edu.miu.cs489.lab11.service;

import java.util.List;

import edu.miu.cs489.lab11.model.Surgery;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery getSurgeryById(String surgeryId);

    Surgery addNewSurgery(Surgery newSurgery);

    Surgery updateSurgery(Surgery updatedSurgery);

    boolean deleteSurgery(String surgeryId);
}
