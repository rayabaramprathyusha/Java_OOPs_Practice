class Employee2{
    int id;
    String name;
    double Salary;
    void showDetails() {
        System.out.println("Employee ID: " + id+ "Employee Name: " + name+ "Employee Salary: " + Salary);
    }
}
public class Employeesys{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 201;
        e1.name = "Jin";
        e1.salary=5500;
        e1.showDetails();
    }
}