package edu.miu.cs489.lab10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.miu.cs489.lab10.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
