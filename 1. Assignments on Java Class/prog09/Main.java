/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Soham Dutta", 'M', "Parnashree, Behala", 60000.0);
        Employee employee2 = new Employee("Shruti Roy", 'F', "Asansol", 80000.0);
        Employee employee3 = new Employee("Ananya Bhowmick", 'F', "Bhadreshwar", 55000.0);
        Employee employee4 = new Employee("Debabrata Mondal", 'M', "New Town, Kolkata", 65000.0);
        Employee employee5 = new Employee("Soham Bakshi", 'M', "Shibpur, Howrah", 70000.0);

        Dept itDept = new Dept("Information Technology", "Salt Lake, Sector IV, Chingrighata, Kolkata, 700105");

        itDept.addEmployee(employee1);
        itDept.addEmployee(employee2);
        itDept.addEmployee(employee3);
        itDept.addEmployee(employee4);
        itDept.addEmployee(employee5);

        try {
            Employee removedEmployee = itDept.removeEmployeeById(1000);
            System.out.println("- " + removedEmployee.getName() + " removed from Dept. of " + itDept.getName() + ".");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            Employee removedEmployee = itDept.removeEmployeeById(4000);
            System.out.println(removedEmployee.getName() + " removed from Dept. of " + itDept.getName() + ".");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        itDept.addEmployee(new Employee("Dipta Majhi", 'F', "Chandernagore", 72000.0));

        itDept.printEmployeeTable();

        double yearlyExpenditure = itDept.getYearlyExpenditure();
        System.out.println("Yearly expenditure of " + itDept.getName() + " is $"
                + String.format("%.2f", yearlyExpenditure));
    }
}
