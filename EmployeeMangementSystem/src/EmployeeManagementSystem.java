
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create company
        Company myCompany = new Company("Tech Solutions Inc.");

        // Create departments
        Department devDept = new Department("Development");
        Department hrDept = new Department("Human Resources");

        // Add departments to company
        myCompany.addDepartment(devDept);
        myCompany.addDepartment(hrDept);

        // Create employees
        Employee e1 = new Employee(101, "Alice", 5000, "Manager");
        Employee e2 = new Employee(102, "Bob", 4000, "Developer");
        Employee e3 = new Employee(103, "Charlie", 3000, "Intern");

        // Assign employees to departments
        devDept.addEmployee(e1);
        devDept.addEmployee(e2);
        hrDept.addEmployee(e3);

        // Show company details
        myCompany.showCompanyDetails();
    }
}
