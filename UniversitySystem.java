import java.util.Scanner;

class Student{
    String name;
    int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
}
class Courses{
    String title;
    int credits;
    public Courses(String title, int credits){
        this.title = title;
        this.credits = credits;
    }
}

class Enrollment{
    Student student;
    Courses course;
    double grade;
    public Enrollment(Student student, Courses course, double grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    void showEnrollment(){
        System.out.println("Student: "+student.name+ "|Course: "+course.title+"|Grade: "+grade);
    }
}
public class UniversitySystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name");
        String name = sc.nextLine();
        System.out.println("Enter Student ID");
        int id = sc.nextInt();
        sc.nextLine();
        Student s=new Student(name,id);

        System.out.println("Enter Course title");
        String title = sc.nextLine();
        System.out.println("Enter Course credits");
        int credits = sc.nextInt();
        sc.nextLine();
        Courses c=new Courses(title,credits);

        System.out.println("Enter grade");
        double grade = sc.nextDouble();


        Enrollment e=new Enrollment(s,c,grade);
        System.out.println("\n Enrollment Details");
        e.showEnrollment();
        sc.close();
    }
}