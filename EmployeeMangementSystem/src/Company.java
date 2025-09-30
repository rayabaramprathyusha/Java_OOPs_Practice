// File: Company.java
import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department d) {
        departments.add(d);
        System.out.println("Department " + d + " added to company.");
    }

    public void showCompanyDetails() {
        System.out.println("\n--- Company: " + companyName + " ---");
        for (Department d : departments) {
            d.showDepartmentDetails();
        }
    }

    // Override toString for printing department names easily
    @Override
    public String toString() {
        return companyName;
    }
}
