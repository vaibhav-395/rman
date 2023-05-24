class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student1 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student1(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21)");
        }
        this.age = age;

        if (!name.matches("^[a-zA-Z\\s]+$")) {
            throw new NameNotValidException("Name is not valid");
        }
        this.name = name;

        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class StudentExceptionHandling {
    public static void main(String[] args) {
        try {
            // Creating valid student object
            Student1 student1 = new Student1(1, "John Doe", 18, "Computer Science");
            System.out.println("Student 1:");
            System.out.println("Roll No: " + student1.getRollNo());
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Course: " + student1.getCourse());

            System.out.println();

            // Creating student object with invalid age
            Student1 student2 = new Student1(2, "Jane Smith", 22, "Mathematics");
            System.out.println("Student 2:");
            System.out.println("Roll No: " + student2.getRollNo());
            System.out.println("Name: " + student2.getName());
            System.out.println("Age: " + student2.getAge());
            System.out.println("Course: " + student2.getCourse());
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
