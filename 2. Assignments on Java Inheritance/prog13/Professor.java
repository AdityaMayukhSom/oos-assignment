public class Professor extends Employee {
    private String[] courses;
    private Student[] advisee;

    public Professor(final String name, Date birthDay, String address, double height, double weight,
            Date dateOfJoining, double salary, String[] courses) {
        this(name, birthDay, address, height, weight, dateOfJoining, salary, 0, courses, new Student[] {});
    }

    public Professor(final String name, Date birthDay, String address, double height, double weight,
            Date dateOfJoining, double salary, int experience, String[] courses) {
        this(name, birthDay, address, height, weight, dateOfJoining, salary, experience, courses, new Student[] {});
    }

    public Professor(final String name, Date birthDay, String address, double height, double weight,
            Date dateOfJoining, double salary, int experience, String[] courses, Student[] advisee) {
        super(name, birthDay, address, height, weight, dateOfJoining, salary, experience);
        this.courses = courses;
        this.advisee = advisee;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Student[] getAdvisee() {
        return advisee;
    }

    public void setAdvisee(Student[] advisee) {
        this.advisee = advisee;
    }

    public void addAdvisee(Student student) {
        int newLength = advisee.length + 1;
        Student[] newAdvisee = new Student[newLength];
        for (int i = 0; i < advisee.length; i++) {
            newAdvisee[i] = advisee[i];
        }
        newAdvisee[newLength - 1] = student;
    }
}
