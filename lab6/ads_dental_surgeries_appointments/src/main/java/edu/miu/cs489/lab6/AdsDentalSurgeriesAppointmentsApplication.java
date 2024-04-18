package edu.miu.cs489.lab6;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs489.lab6.model.Address;
import edu.miu.cs489.lab6.model.Dentist;
import edu.miu.cs489.lab6.model.Patient;
import edu.miu.cs489.lab6.service.AddressService;
import edu.miu.cs489.lab6.service.DentistService;
import edu.miu.cs489.lab6.service.PatientService;

@SpringBootApplication
public class AdsDentalSurgeriesAppointmentsApplication implements CommandLineRunner {
    @Autowired
    private DentistService dentistService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private AddressService addressService;

    public static void main(String[] args) {
        SpringApplication.run(AdsDentalSurgeriesAppointmentsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var dentist = new Dentist(null, "Tony", "Smith", "111-111-1111", "tony.smith@email.com", "Specialization 1");
        dentistService.addNewDentist(dentist);

        dentist = new Dentist(null, "Helen", "Pearson", "111-111-2222", "helen.pearson@email.com", "Specialization 2");
        dentistService.addNewDentist(dentist);

        dentist = new Dentist(null, "Robin", "Plevin", "111-111-3333", "robin.plevin@email.com", "Specialization 3");
        dentistService.addNewDentist(dentist);

        var address = new Address(null, "Street 1", "City 1", "State 1", "11111");
        addressService.addNewAddress(address);

        var patient = new Patient("P100", "Gillian", "White", "222-222-2222", "gillian.white@email.com",
                LocalDate.of(1988, 1, 1), address);
        patientService.addNewPatient(patient);
    }
}
