public class FulltimeStaff extends Staff {
    private double bonusMoney;
    private double fine;
    private double fixSalary;

    public FulltimeStaff(int staffCode, String name, int age, String phone, String email, double bonusMoney, double fine, double fixSalary) {
        super(staffCode, name, age, phone, email);
        this.bonusMoney = bonusMoney;
        this.fine = fine;
        this.fixSalary = fixSalary;
    }

    @Override
    public double getSalary() {
        return fixSalary+bonusMoney-fine;
    }

    @Override
    public String toString() {
        return super.toString() + ", bonus money=" + this.bonusMoney + ", fine= " + this.fine + ", fix salary= " + this.fixSalary + ", salary= " + this.getSalary();
    }
}
