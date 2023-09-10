public class Technician extends Employee {
    private String expertise;

    public Technician(final String name, Date birthDay, String address, double height, double weight,
            Date dateOfJoining, double salary, final String expertise) {
        this(name, birthDay, address, height, weight, dateOfJoining, salary, 0, expertise);
    }

    public Technician(final String name, Date birthDay, String address, double height, double weight,
            Date dateOfJoining, double salary, int experience, final String expertise) {
        super(name, birthDay, address, height, weight, dateOfJoining, salary, experience);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(final String expertise) {
        this.expertise = expertise;
    }

    public void printDetails() {
        System.out.println("\nTechnician Details:");
        System.out.println("---------------------------------------");
        System.out.printf("%-20s: %s\n", "Name", this.getName());
        System.out.printf("%-20s: %d\n", "Age", this.getAge());
        System.out.printf("%-20s: %s\n", "Address", this.getAddress());
        System.out.printf("%-20s: $%.2f\n", "Salary", this.getSalary());
        System.out.printf("%-20s: %s\n", "Date of Joining", this.getDateOfJoining().toString());
        System.out.printf("%-20s: %d years\n", "Experience", getExperience());
        System.out.printf("%-20s: %s\n", "Expertise", this.getExpertise());
        System.out.println("---------------------------------------");
    }

}
