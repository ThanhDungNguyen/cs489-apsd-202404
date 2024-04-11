package edu.miu.cs489.lab6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateTime;
    private String surgeryLocation;
    @ManyToOne
    private Dentist dentist;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Surgery surgery;
}
