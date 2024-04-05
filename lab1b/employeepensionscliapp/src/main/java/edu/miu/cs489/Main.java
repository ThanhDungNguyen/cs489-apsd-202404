package edu.miu.cs489;

import edu.miu.cs489.model.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var employees = List.of(
                new Employee(1L, "Daniel", "Agar", LocalDate.of(2018, 1, 17), 105945.50, "EX1089", LocalDate.of(2023, 1, 17), 100.00),
                new Employee(2L, "Benard", "Shaw", LocalDate.of(2019, 4, 3), 197750.00),
                new Employee(3L, "Carly", "Agar", LocalDate.of(2014, 5, 16), 842000.75, "SM2307", LocalDate.of(2019, 11, 4), 1555.50),
                new Employee(4L, "Wesley", "Schneider", LocalDate.of(2019, 5, 2), 74500.00)
        );
        printAllEmployees(employees);
        printMonthlyUpcomingEnrolleesReport(employees);
    }

    public static void printAllEmployees(List<Employee> employees) {
        var sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        System.out.println("All Employees:");
        System.out.println("[");
        for (int i = 0; i < sortedEmployees.size(); i++) {
            System.out.print(sortedEmployees.get(i).toJson());
            System.out.println(i < (sortedEmployees.size() - 1) ? "," : "");
        }
        System.out.println("]");
    }

    public static void printMonthlyUpcomingEnrolleesReport(List<Employee> employees) {
        var qualifiedEmployees = employees.stream().filter(Employee::willQualifyPensionPlanNextMonth).collect(Collectors.toList());

        System.out.println("Monthly Upcoming Enrollees Report:");
        System.out.println("[");
        for (int i = 0; i < qualifiedEmployees.size(); i++) {
            System.out.print(qualifiedEmployees.get(i).toJson());
            System.out.println(i < (qualifiedEmployees.size() - 1) ? "," : "");
        }
        System.out.println("]");
    }
}
