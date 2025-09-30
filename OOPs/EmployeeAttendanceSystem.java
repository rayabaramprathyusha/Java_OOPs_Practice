class Employee1 {
    int id;
    String name;
    int attendanceDays;

    void markAttendance() {
        attendanceDays++;
        System.out.println(name + " attended. Total days: " + attendanceDays);
    }
}

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.id = 301;
        e1.name = "Sam";

        Employee1 e2 = new Employee1();
        e2.id = 302;
        e2.name = "Sophia";

        e1.markAttendance();
        e2.markAttendance();
        e1.markAttendance();
    }
}
