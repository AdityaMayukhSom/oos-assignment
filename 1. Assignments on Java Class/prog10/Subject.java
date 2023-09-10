public class Subject {
    private final String name;
    private final TabulationSheet tabulationSheet;

    public Subject(final String name) {
        this.name = name;
        this.tabulationSheet = new TabulationSheet();
    }

    public Subject(final String name, final TabulationSheet tabulationSheet) {
        this.name = name;
        this.tabulationSheet = tabulationSheet;
    }

    public Subject(final String name, int[] rollNos, int[] marks) {
        this.name = name;
        this.tabulationSheet = new TabulationSheet(rollNos, marks);
    }

    public String getName() {
        return this.name;
    }

    public int getMarks(int rollNo) {
        return this.tabulationSheet.getMarks(rollNo);
    }

    public void enrollNewStudent(Student newStudent) {
        this.enrollNewStudent(newStudent.getRollNo(), 0);
    }

    public void enrollNewStudent(int rollNumber) {
        this.enrollNewStudent(rollNumber, 0);
    }

    public void enrollNewStudent(Student newStudent, int marks) {
        this.enrollNewStudent(newStudent.getRollNo(), marks);
    }

    public void enrollNewStudent(int rollNumber, int marks) {
        this.tabulationSheet.addNewRoll(rollNumber, marks);
    }

    public void updateStudentMarks(int rollNo, int marks) {
        this.tabulationSheet.changeMarks(rollNo, marks);
    }

}
