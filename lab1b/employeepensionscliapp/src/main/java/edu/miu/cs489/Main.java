package edu.miu.cs489;

import edu.miu.cs489.model.Employee;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var employees = List.of(
                new Employee(1L, "Daniel", "Agar", LocalDate.of(2018, 1, 17), 105945.50, "EX1089", LocalDate.of(2023, 1, 17), 100.00),
                new Employee(2L, "Benard", "Shaw", LocalDate.of(2019, 4, 3), 197750.00),
                new Employee(3L, "Carly", "Agar", LocalDate.of(2014, 5, 16), 842000.75, "SM2307", LocalDate.of(2019, 11, 4), 1555.50),
                new Employee(4L, "Wesley", "Schneider", LocalDate.of(2019, 5, 2), 74500.00)
        );
        printAllEmployees(employees);
    }

    public static void printAllEmployees(List<Employee> employees) {
        System.out.println("All Employees:");
        System.out.print("[");
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(employees.get(i).toJson());
            System.out.println(i < (employees.size() - 1) ? "," : "");
        }
        System.out.print("]");
    }
}
