import java.util.Arrays;

public class Student extends Person {
    private static int studentCount = 1000;

    private int roll;
    private int[] marks;
    private String[] subjects;

    public Student(final String name, final Date birthDay, final String address,
            final double height, final double weight, final String[] subjects) {
        this(name, birthDay, address, height, weight, subjects, new int[] {});

    }

    public Student(final String name, final Date birthDay, final String address, final double height,
            final double weight, final String[] subjects, final int[] marks) {
        super(name, birthDay, address, height, weight);
        this.roll = ++Student.studentCount;
        this.marks = marks;
        this.subjects = subjects;
    }

    public int getRoll() {
        return roll;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(final String... subjects) {
        this.subjects = subjects;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(final int... marks) {
        this.marks = marks;
    }

    public String calculateGrades() {
        int totalMarks = 0;

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        final double averageMarks = (double) totalMarks / marks.length;

        if (averageMarks >= 90) {
            return "A+";
        } else if (averageMarks >= 80) {
            return "A";
        } else if (averageMarks >= 70) {
            return "B";
        } else if (averageMarks >= 60) {
            return "C";
        } else if (averageMarks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public void printDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("---------------------------------------");
        System.out.printf("%-15s: %s\n", "Name", this.getName());
        System.out.printf("%-15s: %d\n", "Roll", this.getRoll());
        System.out.printf("%-15s: %s\n", "Birth Date", this.getDateOfBirth().toString());
        System.out.printf("%-15s: %d\n", "Age", this.getAge());
        System.out.printf("%-15s: %s\n", "Address", this.getAddress());
        System.out.printf("%-15s: %.2f\n", "Height", this.getHeight());
        System.out.printf("%-15s: %.2f\n", "Weight", this.getWeight());
        System.out.printf("%-15s: %s\n", "Subjects", Arrays.toString(this.getSubjects()));
        System.out.printf("%-15s: %s\n", "Marks", Arrays.toString(this.getMarks()));
        System.out.printf("%-15s: %s\n", "Grade", this.calculateGrades());
        System.out.println("---------------------------------------");
    }

}
