/**
 * Employee
 */
public class Employee {

        private String firstName;
        private String lastName;
        private double monthlySalary;
    
        // Constructor to initialize instance variables
        public Employee(String firstName, String lastName, double monthlySalary) {
            this.firstName = firstName;
            this.lastName = lastName;
            setMonthlySalary(monthlySalary); 
        }
    
        // Getter and setter methods for firstName
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        // Getter and setter methods for lastName
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        // Getter and setter methods for monthlySalary
        public double getMonthlySalary() {
            return monthlySalary;
        }
    
        public void setMonthlySalary(double monthlySalary) {
            if (monthlySalary > 0) {
                this.monthlySalary = monthlySalary;
            } else {
                this.monthlySalary = 0.0;
            }
        }
    
        // Method to calculate yearly salary
        public double getYearlySalary() {
            return monthlySalary * 12;
        }
    
        // Method to give a raise of 10%
        public void raiseTen() {
            double raiseAmount = monthlySalary * 0.10;
            monthlySalary += raiseAmount;
        }
    }
    