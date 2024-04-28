package edu.miu.cs489.lab10.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab10.model.Surgery;
import edu.miu.cs489.lab10.repository.SurgeryRepository;
import edu.miu.cs489.lab10.service.SurgeryService;

@Service
public class SurgeryServiceImpl implements SurgeryService {
    @Autowired
    private SurgeryRepository surgeryRepository;

    @Override
    public List<Surgery> getAllSurgeries() {
        return surgeryRepository.findAll();
    }

    @Override
    public Surgery getSurgeryById(String surgeryId) {
        return surgeryRepository.findById(surgeryId).orElse(null);
    }

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        surgeryRepository.save(newSurgery);
        return newSurgery;
    }

    @Override
    public Surgery updateSurgery(Surgery updatedSurgery) {
        surgeryRepository.save(updatedSurgery);
        return updatedSurgery;
    }

    @Override
    public boolean deleteSurgery(String surgeryId) {
        surgeryRepository.deleteById(surgeryId);
        return true;
    }

}
