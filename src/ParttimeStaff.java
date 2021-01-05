public class ParttimeStaff extends Staff {
    private int timeWork;

    public ParttimeStaff(int staffCode, String name, int age, String phone, String email, int timeWork) {
        super(staffCode, name, age, phone, email);
        this.timeWork = timeWork;
    }

    @Override
    public double getSalary() {
        return timeWork*1000;
    }

    @Override
    public String toString() {
        return super.toString() + ", time work= " + this.timeWork + ", salary= " + this.getSalary();
    }
}
