package StructuralDesignPatterns.CompositePattern.OrganizationExample.GoodCode;

/**
 * Leaf: Individual Contributor
 */
public class IndividualContributor implements Employee {
    private String name;
    private String position;
    private double salary;

    public IndividualContributor(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println("      " + position + ": " + name + " [Salary: $" + salary + "]");
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
