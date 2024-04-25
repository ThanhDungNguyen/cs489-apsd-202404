package edu.miu.cs489.lab9.ads_dental_surgeries_appointments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.Role;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.model.User;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository.RoleRepository;
import edu.miu.cs489.lab9.ads_dental_surgeries_appointments.repository.UserRepository;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class AdsDentalSurgeriesAppointmentsApplication {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(AdsDentalSurgeriesAppointmentsApplication.class, args);
	}

	@PostConstruct
	public void initAdminUser() {
		var adminUser = userRepository.findByUsername("admin");
		if (!adminUser.isPresent()) {
			List<Role> listAdminRoles = new ArrayList<>();
			var adminRole = roleRepository.findByName("admin").orElse(new Role(null, "admin", null));
			listAdminRoles.add(adminRole);

			User newAdminUser = new User(null, "Admin", "Admin", "Admin", "admin",
					passwordEncoder.encode("test1234"), "admin@fairfieldlibrary.com",
					listAdminRoles);
			userRepository.save(newAdminUser);
		}
	}

}
