
public class Employee {
    private static int id = 1000;

    private final String name;
    private final int employeeId;
    private final String address;
    private final double salary;
    private final char gender;

    public Employee(final String name, final Character gender, final String address, final Double salary) {
        this.name = name;
        this.employeeId = Employee.id++;
        this.gender = gender;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public char getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
}
