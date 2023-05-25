package src;

// Abstract class Marks
abstract class Marks {
    public abstract double getPercentage();
}

// Class A
class A extends Marks {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public A(int subject1Marks, int subject2Marks, int subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    @Override
    public double getPercentage() {
        int totalMarks = 100; // Total marks for each subject
        int totalSubjects = 3; // Total number of subjects
        double percentage = (subject1Marks + subject2Marks + subject3Marks) / (double)(totalMarks * totalSubjects) * 100;
        return percentage;
    }
}

// Class B
class B extends Marks {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;

    public B(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
    }

    @Override
    public double getPercentage() {
        int totalMarks = 100; // Total marks for each subject
        int totalSubjects = 4; // Total number of subjects
        double percentage = (subject1Marks + subject2Marks + subject3Marks + subject4Marks) / (double)(totalMarks * totalSubjects) * 100;
        return percentage;
    }
}

// Main class
public class PercentageCalculation {
    public static void main(String[] args) {
        // Create an object of class A with marks for three subjects
        A studentA = new A(85, 90, 92);

        // Create an object of class B with marks for four subjects
        B studentB = new B(75, 80, 88, 90);

        // Print the percentage of marks for both students
        System.out.println("Percentage of marks for Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks for Student B: " + studentB.getPercentage());
    }
}
