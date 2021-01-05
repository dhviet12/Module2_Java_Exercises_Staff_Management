public class Staff {
    private int staffCode;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Staff(int staffCode, String name, int age, String phone, String email) {
        this.staffCode = staffCode;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
    public double getSalary(){
        return 0;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffCode=" + staffCode +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
