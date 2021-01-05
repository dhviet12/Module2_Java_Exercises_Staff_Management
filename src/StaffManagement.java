import java.util.ArrayList;
import java.util.List;

public class StaffManagement {
    private ArrayList<Staff> management = new ArrayList<>();

    public void addNewStaff(Staff staff) {
        management.add(staff);
    }

    public void displayAll() {
        for (Staff staff : management) {
            System.out.println(staff.toString());
        }
    }

    public double countAvgSalary() {
        double sumSalary = 0;
        for (int i = 0; i < management.size(); i++) {
            sumSalary += management.get(i).getSalary();
        }
        double avgSalary = sumSalary / management.size();
        return avgSalary;
    }

    public void displayFulltimeBelowAvgSalary() {
        for (int i = 0; i < management.size(); i++) {
            if (management.get(i) instanceof FulltimeStaff && management.get(i).getSalary() < countAvgSalary()) {
                System.out.println(management.get(i));
            }
        }
    }

    public double countSalaryPayForParttime() {
        double sumSalary = 0;
        for (int i = 0; i < management.size(); i++) {
            if (management.get(i) instanceof ParttimeStaff) {
                sumSalary += management.get(i).getSalary();
            }
        }
        return sumSalary;
    }
    public List<Staff> sortSalaryFulltimeStaff(){
        List<Staff> staff = new ArrayList<>();
        for (Staff staff1: management){
            if(staff1 instanceof FulltimeStaff){
                staff.add(staff1);
            }
        }
        for (int i = 1; i < staff.size(); i++) {
            for (int j = 0; j < staff.size()-i; j++) {
                if(staff.get(j).getSalary()> staff.get(j+1).getSalary()){
                    Staff staff1 = staff.get(j);
                    staff.set(j,staff.get(j+1));
                    staff.set(j+1, staff1);
                }
            }
        }
        return staff;
    }


}
