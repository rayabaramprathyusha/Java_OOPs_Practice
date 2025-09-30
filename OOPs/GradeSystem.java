class Student1{
    String name;
    int marks;

    void calculateGrade() {
        if (marks >= 90) {
            System.out.println(name + " got Grade A");
        } else if (marks >= 75) {
            System.out.println(name + " got Grade B");
        } else {
            System.out.println(name + " needs improvement");
        }
    }
}

public class GradeSystem {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Rahul";
        s1.marks = 82;
        s1.calculateGrade();
    }
}
