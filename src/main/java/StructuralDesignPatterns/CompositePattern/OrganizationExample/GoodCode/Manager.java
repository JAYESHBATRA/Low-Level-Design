package StructuralDesignPatterns.CompositePattern.OrganizationExample.GoodCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite: Manager who can manage multiple Employees.
 */
public class Manager implements Employee {
    private String name;
    private String position;
    private double salary;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void addSubordinate(Employee emp) {
        team.add(emp);
    }

    @Override
    public void showDetails() {
        System.out.println("\nManager: " + name + " (" + position + ") [Salary: $" + salary + "]");
        System.out.println("Team under " + name + ":");
        for (Employee emp : team) {
            emp.showDetails();
        }
    }

    @Override
    public double getSalary() {
        double totalSalary = salary;
        for (Employee emp : team) {
            totalSalary += emp.getSalary();
        }
        return totalSalary;
    }
}
