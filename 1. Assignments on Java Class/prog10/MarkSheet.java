import java.util.ArrayList;
import java.util.HashMap;

public class MarkSheet {
    private Student student;
    private HashMap<Subject, Integer> marks;

    public MarkSheet(Student student) {
        this.student = student;
        this.marks = new HashMap<Subject, Integer>();

        ArrayList<Subject> subjects = student.getSubjects();
        for (int i = 0; i < subjects.size(); i++) {
            Subject subject = subjects.get(i);
            this.marks.put(subject, subject.getMarks(student.getRollNo()));
        }
    }

    public void print() {
        // System.out.println("\n************ RESULT ************");
        System.out.printf("\n%-12s :: %20d\n", "Roll Number", student.getRollNo());
        System.out.printf("%-12s :: %20s\n", "Student Name", student.getName());
        // System.out.println("--------------------------------------------");

        // Print subject-wise marks
        System.out.println("\nSubject-wise Marks:");
        System.out.println("--------------------------------");
        System.out.printf("| %-20s | %-5s |\n", "Subject Name", "Marks");
        System.out.println("--------------------------------");

        for (Subject subject : marks.keySet()) {
            System.out.printf("| %-20s | %5d |\n", subject.getName(), marks.get(subject));
        }

        System.out.println("--------------------------------");
    }

}
