package edu.miu.cs489.lab6;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.aspectj.internal.lang.annotation.ajcDeclarePrecedence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.miu.cs489.lab6.model.Address;
import edu.miu.cs489.lab6.model.Appointment;
import edu.miu.cs489.lab6.model.Dentist;
import edu.miu.cs489.lab6.model.Patient;
import edu.miu.cs489.lab6.model.Surgery;
import edu.miu.cs489.lab6.service.AddressService;
import edu.miu.cs489.lab6.service.AppointmentService;
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
    @Autowired
    private AppointmentService appointmentService;

    public static void main(String[] args) {
        SpringApplication.run(AdsDentalSurgeriesAppointmentsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Add dentists
        var dentist1 = new Dentist(null, "Tony", "Smith", "111-111-1111", "tony.smith@email.com",
                "Specialization 1");
        dentistService.addNewDentist(dentist1);

        var dentist2 = new Dentist(null, "Helen", "Pearson", "111-111-2222", "helen.pearson@email.com",
                "Specialization 2");
        dentistService.addNewDentist(dentist2);

        var dentist3 = new Dentist(null, "Robin", "Plevin", "111-111-3333", "robin.plevin@email.com",
                "Specialization 3");
        dentistService.addNewDentist(dentist3);

        var dentist4 = new Dentist(null, "First1", "Last1", "111-111-4444", "first.last@email.com",
                "Specialization 4");
        dentistService.addNewDentist(dentist4);

        // Add addresses
        var address1 = new Address(null, "Street 1", "City 1", "State 1", "11111");
        addressService.addNewAddress(address1);

        var address2 = new Address(null, "Street 2", "City 2", "State 2", "22222");
        addressService.addNewAddress(address2);

        var address3 = new Address(null, "Street 3", "City 3", "State 3", "33333");
        addressService.addNewAddress(address3);

        var address4 = new Address(null, "Street 4", "City 4", "State 4", "44444");
        addressService.addNewAddress(address4);

        var address5 = new Address(null, "Street 5", "City 5", "State 5", "55555");
        addressService.addNewAddress(address5);

        var address6 = new Address(null, "Street 6", "City 6", "State 6", "66666");
        addressService.addNewAddress(address6);

        var address7 = new Address(null, "Street 7", "City 7", "State 7", "77777");
        addressService.addNewAddress(address7);

        var address8 = new Address(null, "Street 8", "City 8", "State 8", "88888");
        addressService.addNewAddress(address8);

        var address9 = new Address(null, "Street 9", "City 9", "State 9", "99999");
        addressService.addNewAddress(address9);

        var address10 = new Address(null, "Street 10", "City 10", "State 10", "99990");
        addressService.addNewAddress(address10);

        var address11 = new Address(null, "Street 11", "City 11", "State 11", "99900");
        addressService.addNewAddress(address11);

        var address12 = new Address(null, "Street 12", "City 12", "State 12", "99000");
        addressService.addNewAddress(address12);

        // Add patients
        var patient1 = new Patient("P100", "Gillian", "White", "222-222-1111", "gillian.white@email.com",
                LocalDate.of(1988, 1, 1), address1);
        patientService.addNewPatient(patient1);

        var patient2 = new Patient("P105", "Jill", "Bell", "222-222-2222", "jill.bell@email.com",
                LocalDate.of(1988, 2, 2), address2);
        patientService.addNewPatient(patient2);

        var patient3 = new Patient("P108", "Ian", "MacKay", "222-222-3333", "ian.mackay@email.com",
                LocalDate.of(1988, 3, 3), address3);
        patientService.addNewPatient(patient3);

        var patient4 = new Patient("P110", "John", "Walker", "222-222-4444", "john.walker@email.com",
                LocalDate.of(1988, 4, 4), address4);
        patientService.addNewPatient(patient4);

        var patient5 = new Patient("P115", "First2", "Last2", "222-222-5555", "first2.last2@email.com",
                LocalDate.of(1988, 4, 4), address12);
        patientService.addNewPatient(patient5);

        // Add surgeries
        var surgery1 = new Surgery("S10", "Surgery 10", "333-333-1111", address5);
        surgeryService.addNewSurgery(surgery1);

        var surgery2 = new Surgery("S13", "Surgery 13", "333-333-2222", address6);
        surgeryService.addNewSurgery(surgery2);

        var surgery3 = new Surgery("S15", "Surgery 15", "333-333-3333", address7);
        surgeryService.addNewSurgery(surgery3);

        // Add appointments
        var appointment1 = new Appointment(null, LocalDateTime.of(2013, 9, 12, 10, 0, 0), dentist1, patient1,
                surgery3);
        appointmentService.addNewAppointment(appointment1);

        var appointment2 = new Appointment(null, LocalDateTime.of(2013, 9, 12, 12, 0, 0), dentist1, patient2,
                surgery3);
        appointmentService.addNewAppointment(appointment2);

        var appointment3 = new Appointment(null, LocalDateTime.of(2013, 9, 12, 10, 0, 0), dentist2, patient3,
                surgery1);
        appointmentService.addNewAppointment(appointment3);

        var appointment4 = new Appointment(null, LocalDateTime.of(2013, 9, 14, 14, 0, 0), dentist2, patient3,
                surgery1);
        appointmentService.addNewAppointment(appointment4);

        var appointment5 = new Appointment(null, LocalDateTime.of(2013, 9, 14, 16, 30, 0), dentist3, patient2,
                surgery3);
        appointmentService.addNewAppointment(appointment5);

        var appointment6 = new Appointment(null, LocalDateTime.of(2013, 9, 15, 18, 0, 0), dentist3, patient4,
                surgery2);
        appointmentService.addNewAppointment(appointment6);

        // CRUD for Dentist
        var dentists = dentistService.getAllDentists();
        dentists.stream().forEach(System.out::println);

        var aDentist = dentistService.getDentistByID(2L);
        System.out.println(String.format("A dentist: %s", aDentist));

        aDentist.setSpecialization("New specialization");
        dentistService.updateDentist(aDentist);

        var updatedDentist = dentistService.getDentistByID(2L);
        System.out.println(String.format("Updated dentist: %s", updatedDentist));

        dentistService.deleteDentist(4L);
        dentists = dentistService.getAllDentists();
        dentists.stream().forEach(System.out::println);

        // CRUD for addresses
        var addresses = addressService.getAllAddresses();
        addresses.stream().forEach(System.out::println);

        var anAddress = addressService.getAddressByID(2L);
        System.out.println(String.format("An address: %s", anAddress));

        anAddress.setStreet("Street 22");
        addressService.updateAddress(anAddress);

        var updatedAddress = addressService.getAddressByID(2L);
        System.out.println(String.format("Updated address: %s", updatedAddress));

        addressService.deleteAddress(11L);
        addresses = addressService.getAllAddresses();
        addresses.stream().forEach(System.out::println);

        // CRUD for patients
        var patients = patientService.getAllPatients();
        patients.stream().forEach(System.out::println);

        var aPatient = patientService.getPatientById("P105");
        System.out.println(String.format("A patient: %s", aPatient));

        aPatient.setPhoneNumber("222-333-2222");
        System.out.println(String.format("Updated patient: %s", aPatient));

        patientService.deletePatient("P115");
        patients = patientService.getAllPatients();
        patients.stream().forEach(System.out::println);
    }
}
