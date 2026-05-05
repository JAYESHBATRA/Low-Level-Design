package StructuralDesignPatterns.CompositePattern.OrganizationExample.GoodCode;

public class OrganizationMain {
    public static void main(String[] args) {
        // Leaves
        Employee dev1 = new IndividualContributor("Alice", "Developer", 80000);
        Employee dev2 = new IndividualContributor("Bob", "Developer", 85000);
        Employee designer = new IndividualContributor("Charlie", "Designer", 75000);

        // Composite (Engineering Manager)
        Manager engManager = new Manager("David", "Engineering Manager", 120000);
        engManager.addSubordinate(dev1);
        engManager.addSubordinate(dev2);

        // Top-level Composite (CEO)
        Manager ceo = new Manager("Eve", "CEO", 250000);
        ceo.addSubordinate(engManager);
        ceo.addSubordinate(designer);

        System.out.println("--- Organization Details ---");
        ceo.showDetails();

        System.out.println("\nTotal Organization Salary Budget: $" + ceo.getSalary());
    }
}
