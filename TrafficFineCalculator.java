package day6;
import java.util.Scanner;

public class TrafficFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: vehicle type
        System.out.print("Enter vehicle type (2 for 2-wheeler or 4 for 4-wheeler): ");
        int vehicleType = scanner.nextInt();

        // Input: actual speed
        System.out.print("Enter your speed: ");
        int actualSpeed = scanner.nextInt();

        // Input: speed limit
        System.out.print("Enter speed limit: ");
        int speedLimit = scanner.nextInt();

        // Calculate extra speed
        int extraSpeed = actualSpeed - speedLimit;

        // Decision based on speed
        if (extraSpeed <= 0) {
            System.out.println("No fine. Drive safely!");
        } else {
            int fine = 0;

            if (vehicleType == 2) {
                if (extraSpeed <= 10) {
                    fine = 500;
                } else if (extraSpeed <= 20) {
                    fine = 1000;
                } else {
                    fine = 2000;
                }
            } else if (vehicleType == 4) {
                if (extraSpeed <= 10) {
                    fine = 1000;
                } else if (extraSpeed <= 20) {
                    fine = 2000;
                } else {
                    fine = 3000;
                }
            } else {
                System.out.println("Invalid vehicle type entered. Please enter 2 or 4.");
                scanner.close();
                return;
            }

            System.out.println("You exceeded the speed limit by " + extraSpeed + " km/h.");
            System.out.println("Your fine amount is: ₹" + fine);
        }

        scanner.close();
    }
}
