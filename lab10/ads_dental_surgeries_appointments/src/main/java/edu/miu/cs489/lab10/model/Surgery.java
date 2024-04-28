package edu.miu.cs489.lab10.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "surgery")
public class Surgery {
    @Id
    private String id;
    private String name;
    private String phoneNumber;
    @OneToOne
    private Address address;
}
