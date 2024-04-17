package edu.miu.cs489.lab6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs489.lab6.model.Dentist;
import edu.miu.cs489.lab6.service.DentistService;

@SpringBootApplication
public class AdsDentalSurgeriesAppointmentsApplication implements CommandLineRunner {
    @Autowired
    private DentistService dentistService;

    public static void main(String[] args) {
        SpringApplication.run(AdsDentalSurgeriesAppointmentsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var dentist = new Dentist(null, "Tony", "Smith", "111-111-1111", "tony.smith@email.com", "Specialization 1");
        dentistService.addNewDentist(dentist);
    }
}
