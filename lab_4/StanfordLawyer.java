package lab_4;

public class StanfordLawyer extends Employee {
    @Override
    public double getSalary() {
        return super.getSalary() * 1.2;
    }
    @Override
    public int getVacationDays() {
        return super.getVacationDays() + 3;
    }
    public String getVacationForm() {
        return "pinkpinkpinkpink";
    }

    public static void main(String[] args) {
        StanfordLawyer stanfordlawyer = new StanfordLawyer();

        System.out.println(stanfordlawyer.getSalary());
        System.out.println(stanfordlawyer.getVacationDays());
        System.out.println(stanfordlawyer.getVacationForm());
    }
}