import java.util.ArrayList;

public class Student {
    private static int studentCount = 1000;

    private int rollNo;
    private String name;
    private ArrayList<Subject> subjects;

    public Student(final String name, Subject... subjects) {
        this.name = name;
        this.rollNo = ++Student.studentCount;

        this.subjects = new ArrayList<Subject>();
        for (int i = 0; i < subjects.length; i++) {
            subjects[i].enrollNewStudent(rollNo);
            this.subjects.add(subjects[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    /**
     * Adds new subject to the subjects list of student
     * 
     * @param subject new subject to be added
     */
    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return this.subjects;
    }

    public MarkSheet generateMarkSheet() {
        MarkSheet markSheet = new MarkSheet(this);
        return markSheet;
    }

}
