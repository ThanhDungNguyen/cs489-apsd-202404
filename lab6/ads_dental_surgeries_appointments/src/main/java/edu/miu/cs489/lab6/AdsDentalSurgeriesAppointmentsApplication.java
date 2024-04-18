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
import edu.miu.cs489.lab6.model.Surgery;
import edu.miu.cs489.lab6.service.AddressService;
import edu.miu.cs489.lab6.service.DentistService;
import edu.miu.cs489.lab6.service.PatientService;
import edu.miu.cs489.lab6.service.SurgeryService;

@SpringBootApplication
public class AdsDentalSurgeriesAppointmentsApplication implements CommandLineRunner {
    @Autowired
    private DentistService dentistService;
    @Autowired
    private AddressService addressService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private SurgeryService surgeryService;

    public static void main(String[] args) {
        SpringApplication.run(AdsDentalSurgeriesAppointmentsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add dentists
        var dentist = new Dentist(null, "Tony", "Smith", "111-111-1111", "tony.smith@email.com", "Specialization 1");
        dentistService.addNewDentist(dentist);

        dentist = new Dentist(null, "Helen", "Pearson", "111-111-2222", "helen.pearson@email.com", "Specialization 2");
        dentistService.addNewDentist(dentist);

        dentist = new Dentist(null, "Robin", "Plevin", "111-111-3333", "robin.plevin@email.com", "Specialization 3");
        dentistService.addNewDentist(dentist);

        // Add patients and addresses
        var address = new Address(null, "Street 1", "City 1", "State 1", "11111");
        addressService.addNewAddress(address);

        var patient = new Patient("P100", "Gillian", "White", "222-222-1111", "gillian.white@email.com",
                LocalDate.of(1988, 1, 1), address);
        patientService.addNewPatient(patient);

        address = new Address(null, "Street 2", "City 2", "State 2", "22222");
        addressService.addNewAddress(address);

        patient = new Patient("P105", "Jill", "Bell", "222-222-2222", "jill.bell@email.com",
                LocalDate.of(1988, 2, 2), address);
        patientService.addNewPatient(patient);

        address = new Address(null, "Street 3", "City 3", "State 3", "33333");
        addressService.addNewAddress(address);

        patient = new Patient("P108", "Ian", "MacKay", "222-222-3333", "ian.mackay@email.com",
                LocalDate.of(1988, 3, 3), address);
        patientService.addNewPatient(patient);

        address = new Address(null, "Street 3", "City 3", "State 3", "33333");
        addressService.addNewAddress(address);

        patient = new Patient("P110", "John", "Walker", "222-222-4444", "john.walker@email.com",
                LocalDate.of(1988, 4, 4), address);
        patientService.addNewPatient(patient);

        // Add surgeries and addresses
        address = new Address(null, "Street 4", "City 4", "State 4", "44444");
        addressService.addNewAddress(address);

        var surgery = new Surgery("S10", "Surgery 10", "333-333-1111", address);
        surgeryService.addNewSurgery(surgery);

        address = new Address(null, "Street 5", "City 5", "State 5", "55555");
        addressService.addNewAddress(address);

        surgery = new Surgery("S13", "Surgery 13", "333-333-2222", address);
        surgeryService.addNewSurgery(surgery);

        address = new Address(null, "Street 6", "City 6", "State 6", "66666");
        addressService.addNewAddress(address);

        surgery = new Surgery("S15", "Surgery 15", "333-333-3333", address);
        surgeryService.addNewSurgery(surgery);
    }
}
