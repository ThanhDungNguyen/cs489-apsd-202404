package edu.miu.cs489.lab10.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.miu.cs489.lab10.model.Appointment;
import edu.miu.cs489.lab10.repository.AppointmentRepository;
import edu.miu.cs489.lab10.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long appointmentId) {
        return appointmentRepository.findById(appointmentId).orElse(null);
    }

    @Override
    public Appointment addNewAppointment(Appointment newAppointment) {
        appointmentRepository.save(newAppointment);
        return newAppointment;
    }

    @Override
    public Appointment updateAppointment(Appointment updatedAppointment) {
        appointmentRepository.save(updatedAppointment);
        return updatedAppointment;
    }

    @Override
    public boolean deleteAppointmentById(Long appointmentId) {
        appointmentRepository.deleteById(appointmentId);
        return true;
    }

}
