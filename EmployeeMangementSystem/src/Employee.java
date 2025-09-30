public class Employee {
    private int id;
    private String name;
    private double basesalary;
    private String role;
    public Employee(int id, String name, double basesalary, String role) {
        this.id = id;
        this.name = name;
        this.basesalary = basesalary;
        this.role = role;
    }
    public double calculateSalary() {
        if(role.equalsIgnoreCase("Manager")) {
            return basesalary + 2000;
        } else if(role.equalsIgnoreCase("Developer")) {
            return basesalary + 1000;
        } else {
            return basesalary;
        }
    }
    public void showDetails() {
        System.out.println("Employee ID: " + id+", Name: " + name+", Basesalary: " + basesalary+", Role: "+role+",Salary:$"+calculateSalary());
    }
    public String getName(){
        return name;
    }
}