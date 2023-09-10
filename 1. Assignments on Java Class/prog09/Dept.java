public class Dept {
    private final String name;
    private final String location;
    private Employee[] employees;

    public Dept(final String name, final String location) {
        this.name = name;
        this.location = location;
        this.employees = new Employee[0];
    }

    public Employee addEmployee(final Employee employee) {
        final Employee[] newEmployees = new Employee[this.employees.length + 1];

        for (int i = 0; i < this.employees.length; i++) {
            newEmployees[i] = this.employees[i];
        }

        newEmployees[this.employees.length] = employee;
        this.employees = newEmployees;

        System.out.println("- "
                + employee.getName()
                + " added to Dept. of "
                + this.name + " with employee id "
                + employee.getEmployeeId()
                + ".");

        return employee;
    }

    public Employee addEmployee(final String name, final Character gender, final String address, final Double salary) {
        final Employee employee = new Employee(name, gender, address, salary);
        this.addEmployee(employee);
        return employee;
    }

    public Employee removeEmployeeById(final int employeeId) throws Exception {
        Employee removedEmployee = null;
        final Employee[] newEmployees = new Employee[this.employees.length - 1];

        for (int i = 0, j = 0; i < this.employees.length; i++) {
            if (this.employees[i].getEmployeeId() != employeeId) {
                if (j != newEmployees.length) {
                    newEmployees[j++] = this.employees[i];
                } else {
                    // else block getting executed implies Employee
                    // is not present in department
                }
            } else {
                removedEmployee = this.employees[i];
            }
        }

        if (removedEmployee == null) {
            final String err = "- Employee with id " + employeeId + " does not work for the department of " + this.name
                    + ".";
            throw new Exception(err);
        } else {
            this.employees = newEmployees;
            return removedEmployee;
        }
    }

    public double getYearlyExpenditure() {
        double totalSalary = 0.0;
        for (final Employee employee : this.employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary * 12.0;
    }

    public void printEmployeeTable() {
        int hyphenRepeatCount = 83;

        System.out.println("\nDepartment Name\t\t:: " + this.name);
        System.out.println("Department Location\t:: " + this.location);
        System.out.println("-".repeat(hyphenRepeatCount));
        System.out.printf("| %-5s | %-6s | %-20s | %-20s | %-16s |\n",
                "ID", "Gender", "Name", "Address", "Salary ($/month)");
        System.out.println("-".repeat(hyphenRepeatCount));

        // Print employee details
        for (final Employee employee : employees) {
            System.out.printf("| %-5d | %6s | %-20s | %-20s | %16.2f |\n",
                    employee.getEmployeeId(), employee.getGender(), employee.getName(), employee.getAddress(),
                    employee.getSalary());
        }

        System.out.println("-".repeat(hyphenRepeatCount) + "\n");
    }

    public String getName() {
        return name;
    }
}
