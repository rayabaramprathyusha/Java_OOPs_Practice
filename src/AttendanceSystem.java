class Student {
    int id;
    String name;
    int attendance;

    void markAttendance() {
        attendance++;
        System.out.println(name + " attended class. Total: " + attendance);
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 101;
        s1.name = "Alice";

        s1.markAttendance();
        s1.markAttendance();
    }
}
