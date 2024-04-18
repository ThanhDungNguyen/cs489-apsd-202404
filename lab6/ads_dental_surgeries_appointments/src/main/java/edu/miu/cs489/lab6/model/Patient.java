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
@Table(name = "patient")
public class Patient {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private LocalDate dateOfBirth;
    @OneToOne
    private Address address;
}
