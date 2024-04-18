package edu.miu.cs489.lab6.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab6.model.Surgery;
import edu.miu.cs489.lab6.repository.SurgeryRepository;
import edu.miu.cs489.lab6.service.SurgeryService;

@Service
public class SurgeryServiceImpl implements SurgeryService {
    @Autowired
    private SurgeryRepository surgeryRepository;

    @Override
    public List<Surgery> getAllSurgeries() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllSurgeries'");
    }

    @Override
    public Surgery addNewSurgery(Surgery newSurgery) {
        surgeryRepository.save(newSurgery);
        return newSurgery;
    }

    @Override
    public Surgery updateSurgery(Surgery updatedSurgery) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateSurgery'");
    }

    @Override
    public boolean deleteSurgery(Long surgeryId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteSurgery'");
    }
    
}
