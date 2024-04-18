package edu.miu.cs489.lab6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab6.model.Appointment;
import edu.miu.cs489.lab6.repository.AppointmentRepository;
import edu.miu.cs489.lab6.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllAppointments'");
    }

    @Override
    public Appointment addNewAppointment(Appointment newAppointment) {
        appointmentRepository.save(newAppointment);
        return newAppointment;
    }

    @Override
    public Appointment updateAppointment(Appointment updatedAppointment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateAppointment'");
    }

    @Override
    public boolean deleteAppointment(Long appointmentID) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteAppointment'");
    }

}
