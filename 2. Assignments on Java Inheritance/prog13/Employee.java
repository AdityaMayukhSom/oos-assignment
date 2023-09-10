public class Employee extends Person {
    private int experience;
    private double salary;
    private Date dateOfJoining;

    public Employee(final String name, final Date birthDay, final String address, final double height,
            final double weight, final Date dateOfJoining, final double salary, final int experience) {
        super(name, birthDay, address, height, weight);
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(final Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(final int experience) {
        this.experience = experience;
    }

}
