package CarMangementSystem;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements Utility {
    String empId;
    String empName;
    int empAge;
    String empDepartment;

    @Override
    public void getDetails() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Age: " + empAge);
        System.out.println("Department: " + empDepartment);
        System.out.println("Showroom Name: " + showroomName);
    }

    @Override
    public void setDetails() {
        try (Scanner sc = new Scanner(System.in)) {
			empId = UUID.randomUUID().toString(); // Generate a random UUID for the employee ID
			System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
			System.out.println();
			System.out.print("EMPLOYEE NAME: ");
			empName = sc.nextLine();
			System.out.print("EMPLOYEE AGE: ");
			empAge = sc.nextInt();
			sc.nextLine(); // consume newline
			System.out.print("EMPLOYEE DEPARTMENT: ");
			empDepartment = sc.nextLine();
			System.out.print("SHOWROOM NAME: ");
			showroomName = sc.nextLine();
		}
    }
}
