package lab_4;

public class Employee {
    public int getHours() {
        return baseHours;                // 40 hours/week
    }
    public double getSalary() {
        return baseSalary;               // $40,000.00
    }
    public int getVacationDays() {
        return baseVacationDays;         // 10 days
    }

    public String getVacationForm() {
        return baseVacationForm;         // yellow
    }
    // These are so that test cases can change the base values
    // and make sure that subclasses also change their values.
    // (Your code that you submit is NOT supposed to directly use, call,
    // or modify the values below!  They are here only to help our site
    // successfully test your code.  Please ignore them.)

    private int baseHours = 40;
    private double baseSalary = 40000.0;
    private int baseVacationDays = 10;
    private String baseVacationForm = "yellow";

    public final void setBaseHours(int hours) {
        baseHours = hours;
    }
    public final void setBaseSalary(double salary) {
        baseSalary = salary;
    }
    public final void setBaseVacationDays(int days) {
        baseVacationDays = days;
    }
    public final void setBaseVacationForm(String form) {
        baseVacationForm = form;
    }
    public static class Lawyer extends Employee {
        // overrides getVacationDays from Employee class
        public int getVacationDays() {
            return super.getVacationDays() + 5;
        }

        // overrides getVacationDays from Employee class
        public String getVacationForm() {
            return lawyerVacationForm;
        }

        // this is the Lawyer's added behavior
        public String sue() {
            return "I'll see you in court!";
        }
        // these are so that test cases can change the Lawyer values
        // and make sure that subclasses also change
        private String lawyerVacationForm = "pink";

        public final void setVacationForm(String form) {
            lawyerVacationForm = form;
        }
    }
    public static class StanfordLawyer extends Lawyer {
        @Override
        public double getSalary() {
            return super.getSalary() * 1.2;
        }
        @Override
        public int getVacationDays() {
            return super.getVacationDays() + 3;
        }
        @Override
        public String getVacationForm() {
            return super.getVacationForm().repeat(4);
        }
    }
    public static void main(String[] args) {
        StanfordLawyer stanfordLawyer = new StanfordLawyer();

        System.out.println(stanfordLawyer.getSalary());
        System.out.println(stanfordLawyer.getVacationDays());
        System.out.println(stanfordLawyer.getVacationForm());
    }
}
