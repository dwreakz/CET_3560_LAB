package Lab_4;

public class LawFirmTest {
    public static class Employee {
        public int getHours() {
            return 40; // General employees work 40 hours per week
        }
        public double getSalary() {
            return 40000.0; // General employees earn $40,000 per year
        }
        public int getVacationDays() {
            return 10; // General employees get 10 vacation days
        }
        public String getName() {
            return "Employee";
        }
    }
    public static class Custodian extends Employee {
        @Override
        public int getHours() {
            return super.getHours() * 2; // Custodians work twice as many hours
        }
        @Override
        public double getSalary() {
            return super.getSalary() - 10000; // Custodians earn $10,000 less
        }
        @Override
        public int getVacationDays() {
            return super.getVacationDays() / 2; // Custodians get half the vacation
        }
        public String clean() {
            return "Workin' for the man.";
        }
        @Override
        public String getName() {
            return "Custodian";
        }
    }

    // Main method to test Custodian behavior
    public static void main(String[] args) {
        Custodian custodian = new Custodian();

        System.out.println("Job Title: " + custodian.getName()); 
        System.out.println("Hours per week: " + custodian.getHours());
        System.out.println("Salary: $" + custodian.getSalary()); 
        System.out.println("Vacation Days: " + custodian.getVacationDays()); 
        System.out.println("Clean Method: " + custodian.clean()); 
    }
}
