// File: Department.java
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println(e.getName() + " added to " + deptName + " department.");
    }

    public void showDepartmentDetails() {
        System.out.println("\nDepartment: " + deptName);
        System.out.println("Employees:");
        for (Employee e : employees) {
            e.showDetails();
        }
    }
}
