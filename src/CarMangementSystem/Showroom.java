package CarMangementSystem;

import java.util.Scanner;

public class Showroom implements Utility {
    String showroomName;
    String showroomAddress;
    int totalEmployees;
    int totalCarsInStock = 0;
    String managerName;

    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAddress);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Cars In Stock: " + totalCarsInStock);
    }

    @Override
    public void setDetails() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
			System.out.println();
			System.out.print("SHOWROOM NAME: ");
			showroomName = sc.nextLine();
			System.out.print("SHOWROOM ADDRESS: ");
			showroomAddress = sc.nextLine();
			System.out.print("MANAGER NAME: ");
			managerName = sc.nextLine();
			System.out.print("TOTAL NO OF EMPLOYEES: ");
			totalEmployees = sc.nextInt();
			System.out.print("TOTAL CARS IN STOCK: ");
			totalCarsInStock = sc.nextInt();
			sc.nextLine(); // consume newline
		}
    }
}
