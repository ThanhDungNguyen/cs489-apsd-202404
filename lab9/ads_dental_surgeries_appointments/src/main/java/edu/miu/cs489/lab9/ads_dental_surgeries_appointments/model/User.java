package edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(nullable = false)
    @NotBlank(message = "* First Name is required")
    private String firstName;
    @Column(nullable = true)
    private String middleName;
    @Column(nullable = false)
    @NotBlank(message = "* Last Name is required")
    private String lastName;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "* Username is required")
    private String username;
    @Column(nullable = false)
    @NotBlank(message = "* Password is required")
    @Size(min = 8)
    private String password;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "* Email is required")
    @Email(message = "{errors.invalid_email}")
    private String email;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = {
            @JoinColumn(name = "USER_ID", referencedColumnName = "userId") }, inverseJoinColumns = {
                    @JoinColumn(name = "ROLE_ID", referencedColumnName = "roleId") })
    private List<Role> roles;
}
