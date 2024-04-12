package edu.miu.cs489.lab6.service;

import edu.miu.cs489.lab6.model.Appointment;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAllAppointments();

    Appointment addNewAppointment(Appointment newAppointment);

    Appointment updateAppointment(Appointment updatedAppointment);

    boolean deleteAppointment(Long appointmentID);
}
