public class StudentSystem {
    public static void main(String[] args) {
        // Create School
        School school = new School("Green Valley High School");

        // Add Students
        Student s1 = new Student(1, "Alice", 10);
        Student s2 = new Student(2, "Bob", 9);
        school.addStudent(s1);
        school.addStudent(s2);

        // Add Teachers
        Teacher t1 = new Teacher(101, "Mr. Smith", "Mathematics");
        Teacher t2 = new Teacher(102, "Ms. Johnson", "English");
        school.addTeacher(t1);
        school.addTeacher(t2);

        // Display records
        school.showStudents();
        school.showTeachers();
    }
}
