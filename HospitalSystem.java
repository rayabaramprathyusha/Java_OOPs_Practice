class Patient {
    private String name;
    private int age;
    private String disease;
    private String contactNumber;

    public Patient(String name, int age, String disease, String contactNumber) {
        if (age <= 0) throw new IllegalArgumentException("Age must be positive");
        if (!contactNumber.matches("\\d{10}")) throw new IllegalArgumentException("Invalid contact number");
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.contactNumber = contactNumber;
    }

    public String getPatientSummary() {
        return "Patient: " + name + ", Age: " + age + ", Disease: " + disease;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        try {
            Patient p1 = new Patient("Vinny", 28, "Flu", "9876543210");
            System.out.println(p1.getPatientSummary());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
