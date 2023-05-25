package src;

import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String designation;
    double salary;

    Employee(String name, int age, String designation, double salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        System.out.println("Enter details for 5 employees:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            System.out.print("Designation: ");
            String designation = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character

            employees[i] = new Employee(name, age, designation, salary);
        }

        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.salary > 5000) {
                System.out.println("Name: " + employee.name);
            }
        }

        scanner.close();
    }
}
