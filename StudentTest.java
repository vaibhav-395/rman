import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 10);
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");

        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        student.displayCourses();

        student.removeCourse("Science");

        student.displayCourses();
    }
}
