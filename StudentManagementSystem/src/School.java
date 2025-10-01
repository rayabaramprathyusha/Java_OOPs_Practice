import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Added Student: " + student.getName());
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("Added Teacher: " + teacher.getName());
    }

    public void showStudents() {
        System.out.println("\n--- Student Records ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void showTeachers() {
        System.out.println("\n--- Teacher Records ---");
        for (Teacher t : teachers) {
            System.out.println(t);
        }
    }
}
