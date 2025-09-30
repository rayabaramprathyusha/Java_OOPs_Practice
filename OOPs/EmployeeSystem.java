class Employee {
    int id;
    String name;
    double salary;

    void showDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 201;
        e1.name = "John";
        e1.salary = 50000;

        e1.showDetails();
    }
}
