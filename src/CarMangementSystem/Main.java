package CarMangementSystem;

import java.util.Scanner;

public class Main {
    static void mainMenu() {
        System.out.println();
        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
        System.out.println();
        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
        System.out.println();
        System.out.println("1]. ADD SHOWROOMS \t\t\t 2]. ADD EMPLOYEES \t\t\t 3]. ADD CARS");
        System.out.println();
        System.out.println("4]. GET SHOWROOMS \t\t\t 5]. GET EMPLOYEES \t\t\t 6]. GET CARS");
        System.out.println();
        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom[] showrooms = new Showroom[5];
        Employees[] employees = new Employees[5];
        Cars[] cars = new Cars[5];
        int carCounter = 0;
        int showroomCounter = 0;
        int employeesCounter = 0;
        int choice = 100;

        while (choice != 0) {
            mainMenu();
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (showroomCounter < showrooms.length) {
                        showrooms[showroomCounter] = new Showroom();
                        showrooms[showroomCounter].setDetails();
                        showroomCounter++;
                    } else {
                        System.out.println("Showroom limit reached!");
                    }
                    break;

                case 2:
                    if (employeesCounter < employees.length) {
                        employees[employeesCounter] = new Employees();
                        employees[employeesCounter].setDetails();
                        employeesCounter++;
                    } else {
                        System.out.println("Employees limit reached!");
                    }
                    break;

                case 3:
                    if (carCounter < cars.length) {
                        cars[carCounter] = new Cars();
                        cars[carCounter].setDetails();
                        carCounter++;
                    } else {
                        System.out.println("Cars limit reached!");
                    }
                    break;

                case 4:
                    for (int i = 0; i < showroomCounter; i++) {
                        showrooms[i].getDetails();
                        System.out.println();
                    }
                    break;

                case 5:
                    for (int i = 0; i < employeesCounter; i++) {
                        employees[i].getDetails();
                        System.out.println();
                    }
                    break;

                case 6:
                    for (int i = 0; i < carCounter; i++) {
                        cars[i].getDetails();
                        System.out.println();
                    }
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;
            }
        }

        sc.close(); // Close scanner resource
    }
}
