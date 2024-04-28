/**
 * ex313
 */
public class ex313 {

    public static void main(String[] args) {
        // create employee objects
        Employee employee1 = new Employee("Reza", "Khibari", 3500);
        Employee employee2 = new Employee("Bob", "Yonge", 7500);

        // Display salary
        displaySalary(employee1);
        displaySalary(employee2);

        // raise 10%
        employee1.raiseTen();
        employee2.raiseTen();

        // Display after raise
        displaySalary(employee1);
        displaySalary(employee2);
 
    }
    // method to display employee
    public static void displaySalary(Employee employee){
        System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("Yearly Salary: " + employee.getYearlySalary());
        System.out.println(); 
    }
}