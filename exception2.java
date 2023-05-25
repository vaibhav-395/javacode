package src;

// Custom exception for age not within the specified range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// Custom exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

// Student class with attributes and constructor
class Student4 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student4(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the specified range of 15 to 21.");
        }
        if (name.matches(".*\\d.*") || !name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class exception2 {
    public static void main(String[] args) {
        try {
            Student4 student1 = new Student4(1, "John Doe", 18, "Computer Science");
            student1.displayStudentDetails();

            System.out.println();

            Student4 student2 = new Student4(2, "Jane123", 22, "Mathematics");
            student2.displayStudentDetails();
        } catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
