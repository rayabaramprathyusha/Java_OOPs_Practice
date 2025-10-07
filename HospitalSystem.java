import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String disease;
    private String phonenumber;

    public Patient(String name,int age,String disease,String phonenumber) {
        String errorMessage = "";
        if (age < 0 || age > 100)
            errorMessage += "Age must be between 0 and 100. ";
        if (!phonenumber.matches("\\d{10}"))
            errorMessage += "Invalid phone number. ";

        if (!errorMessage.isEmpty())
            throw new IllegalArgumentException(errorMessage);
        this.name = name;
        this.age = age;
        this.disease=disease;
        this.phonenumber=phonenumber;
    }
    public String getPatientSummary() {
        return "Patient: " + name + " Age: " + age + " Disease: " + disease;
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
           System.out.println("Please enter Patient name: ");
           String name = sc.nextLine();
           System.out.println("Please enter Patient age: ");
           int age = sc.nextInt();
           sc.nextLine();
           System.out.println("Please enter DISEASE Name: ");
           String disease=sc.nextLine();
           System.out.println("Please enter Patient phone number: ");
           String phonenumber = sc.nextLine();
           Patient p1=new Patient(name,age,disease,phonenumber);

           System.out.println("Patient added successfully.");
           System.out.println(p1.getPatientSummary());
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
