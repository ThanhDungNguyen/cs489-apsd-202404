-- 1. Display the list of ALL Dentists registered in the system, sorted in ascending order of their lastNames.
SELECT *
FROM Dentist
ORDER BY last_name;

-- 2. Display the list of ALL Appointments for a given Dentist by their dentist_Id number. Include in the result, the Patient information.
SELECT *
FROM Appointment a, Patient p
WHERE dentist_id = "D001" AND a.patient_id = p.id;

-- 3. Display the list of ALL Appointments that have been scheduled at a Surgery Location
SELECT a.*
FROM Appointment a, Surgery s
WHERE s.address = "111 Street 1, City 10, IA" AND a.surgery = s.id;

-- 4. Display the list of the Appointments booked for a given Patient on a given Date.
SELECT *
FROM Appointment
WHERE patient_id = "P108" AND (date_time BETWEEN "2013-09-12 00:00:00" AND "2013-09-12 23:59:59");