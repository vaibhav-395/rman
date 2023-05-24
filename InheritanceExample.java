import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void acceptData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public void acceptData() {
        super.acceptData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public boolean hasSalaryGreaterThan(double amount) {
        return salary > amount;
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Accept data for 5 persons
        System.out.println("Enter data for 5 employees:");
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].acceptData();
        }

        // Display names of employees with salary greater than 5000
        System.out.println("Employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan(5000)) {
                System.out.println(employee.name);
            }
        }
    }
}
