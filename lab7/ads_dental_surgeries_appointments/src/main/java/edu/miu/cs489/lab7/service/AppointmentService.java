package edu.miu.cs489.lab7.service;

import java.util.List;

import edu.miu.cs489.lab7.model.Appointment;

public interface AppointmentService {
    List<Appointment> getAllAppointments();

    Appointment getAppointmentById(Long appointmentId);

    Appointment addNewAppointment(Appointment newAppointment);

    Appointment updateAppointment(Appointment updatedAppointment);

    boolean deleteAppointmentById(Long appointmentId);
}
