import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StaffManagement staffManagement = new StaffManagement();
        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1.Add new staff");
            System.out.println("2.Display all");
            System.out.println("3.Display average salary in whole company");
            System.out.println("4.Display Full time staff which has salary below than average salary");
            System.out.println("5.Display total salary must pay for Part time staff");
            System.out.println("6.Display Full time staff by salary sorting");
            System.out.println("0.Exit");
            System.out.println("----------------------------------------");
            System.out.println("Enter your choice:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("How many staffs do you want to add ?");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewStaff(scanner, staffManagement);
                    }
                    break;
                case 2:
                    staffManagement.displayAll();
                    break;
                case 3:
                    System.err.println("Average salary in company: " + staffManagement.countAvgSalary());
                    break;
                case 4:
                    staffManagement.displayFulltimeBelowAvgSalary();
                    break;
                case 5:
                    System.err.println("Salary must pay for Part time staff: " + staffManagement.countSalaryPayForParttime());
                    break;
                case 6:
                    System.out.println(staffManagement.sortSalaryFulltimeStaff());
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    private static void addNewStaff(Scanner scanner, StaffManagement staffManagement) {
        System.out.println("Enter staff's code (Number only)");
        int staffCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter staff's name");
        String name = scanner.nextLine();
        System.out.println("Enter staff's age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter staff's phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter staff's email");
        String email = scanner.nextLine();
        boolean invalidKind = true;
        do {
            System.out.println("Enter kind of staff you want to add (FUllTIME/PARTTIME)");
            String kind = scanner.nextLine();
            if (kind.equalsIgnoreCase("Fulltime")) {
                invalidKind = false;
                System.out.println("Enter staff's bonus money");
                double bonusMoney = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter staff's fine");
                double fine = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter staff fix salary");
                double fixSalary = Double.parseDouble(scanner.nextLine());
                FulltimeStaff fulltimeStaff = new FulltimeStaff(staffCode, name, age, phoneNumber, email, bonusMoney, fine, fixSalary);
                staffManagement.addNewStaff(fulltimeStaff);
                System.err.println("Added successfully");
            } else if (kind.equalsIgnoreCase("Parttime")) {
                invalidKind = false;
                System.out.println("Enter staff's hours work");
                int hoursWork = Integer.parseInt(scanner.nextLine());
                ParttimeStaff parttimeStaff = new ParttimeStaff(staffCode, name, age, phoneNumber, email, hoursWork);
                staffManagement.addNewStaff(parttimeStaff);
                System.err.println("Added successfully");
            }
        } while (invalidKind);
    }
}
