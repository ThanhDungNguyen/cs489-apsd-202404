package edu.miu.cs489.model;

import java.time.LocalDate;

public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private Double yearlySalary;
    private PensionPlan pensionPlan;

    public Employee() {
        this(null, null, null, null, null, null, null, null);
    }

    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, Double yearlySalary) {
        this(employeeId, firstName, lastName, employmentDate, yearlySalary, null, null, null);
    }

    public Employee(Long employeeId, String firstName, String lastName, LocalDate employmentDate, Double yearlySalary,
                    String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        if (planReferenceNumber != null && enrollmentDate != null && monthlyContribution != null) {
            this.pensionPlan = new PensionPlan(planReferenceNumber, enrollmentDate, monthlyContribution);
        }
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(Double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public boolean willQualifyPensionPlanNextMonth() {
        if (pensionPlan != null)
            return false;

        var qualifiedDate = employmentDate.plusYears(5);
        var nextMonthDate = LocalDate.now().plusMonths(1);
        return qualifiedDate.getYear() == nextMonthDate.getYear() && qualifiedDate.getMonth() == nextMonthDate.getMonth();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employmentDate=" + employmentDate +
                ", yearlySalary=" + yearlySalary +
                ", pensionPlan=" + pensionPlan +
                '}';
    }

    public String toJson() {
        return String.format("{\"employeeId\":%d,\n\"firstName\":\"%s\",\n\"lastName\":\"%s\",\n\"employmentDate\":\"%s\",\n\"yearlySalary\":%f,\n\"pensionPlan\":%s}",
                employeeId, firstName, lastName, employmentDate, yearlySalary, pensionPlan != null ? pensionPlan.toJson() : "{}");
    }
}
