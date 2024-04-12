package edu.miu.cs489.lab6.service;

import edu.miu.cs489.lab6.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeries();

    Surgery addNewSurgery(Surgery newSurgery);

    Surgery updateSurgery(Surgery updatedSurgery);

    boolean deleteSurgery(Long surgeryId);
}
