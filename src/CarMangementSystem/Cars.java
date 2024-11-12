package CarMangementSystem;

import java.util.Scanner;

public class Cars extends Showroom implements Utility {
    String carName;
    String carColor;
    String carFuelType;
    int carPrice;
    String carType;
    String carTransmission;

    @Override
    public void getDetails() {
        System.out.println("NAME: " + carName);
        System.out.println("COLOR: " + carColor);
        System.out.println("FUEL TYPE: " + carFuelType);
        System.out.println("PRICE: $" + carPrice);
        System.out.println("CAR TYPE: " + carType);
        System.out.println("TRANSMISSION: " + carTransmission);
    }

    @Override
    public void setDetails() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
			System.out.println();
			System.out.print("CAR NAME: ");
			carName = sc.nextLine();
			System.out.print("CAR COLOR: ");
			carColor = sc.nextLine();
			System.out.print("CAR FUEL TYPE (PETROL/DIESEL): ");
			carFuelType = sc.nextLine();
			System.out.print("CAR PRICE: ");
			carPrice = sc.nextInt();
			sc.nextLine(); // consume newline
			System.out.print("CAR TYPE (SEDAN/SUV/HATCHBACK): ");
			carType = sc.nextLine();
			System.out.print("TRANSMISSION TYPE (AUTOMATIC/MANUAL): ");
			carTransmission = sc.nextLine();
		}
        totalCarsInStock++;
    }
}
