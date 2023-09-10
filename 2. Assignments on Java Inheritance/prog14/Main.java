/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("Input.txt");
                Scanner sc = new Scanner(fis);) {
            // System.out.print("Enter car make: ");
            String carMake = sc.nextLine();

            // System.out.print("Enter car type: ");
            String carType = sc.nextLine();

            // System.out.print("Enter car max speed: ");
            double carMaxSpeed = 0;
            if (sc.hasNextDouble()) {
                carMaxSpeed = sc.nextDouble();
            }

            // System.out.print("Enter car mileage: ");
            double carMileage = 0;
            if (sc.hasNextDouble()) {
                carMileage = sc.nextDouble();
            }

            // System.out.print("Enter car seating capacity: ");
            int carSeatingCapacity = 0;
            if (sc.hasNextInt()) {
                carSeatingCapacity = sc.nextInt();
            }
            sc.nextLine(); // Consume the remaining newline character

            double carPrice = 0;
            if (sc.hasNextDouble()) {
                carPrice = sc.nextDouble();
            }
            sc.nextLine(); // Consume the remaining newline character

            // System.out.print("Enter truck make: ");
            String truckMake = sc.nextLine();

            // System.out.print("Enter truck type: ");
            String truckType = sc.nextLine();

            // System.out.print("Enter truck max speed: ");
            double truckMaxSpeed = 0;
            if (sc.hasNextDouble()) {
                truckMaxSpeed = sc.nextDouble();
            }

            // System.out.print("Enter truck mileage: ");
            double truckMileage = 0;
            if (sc.hasNextDouble()) {
                truckMileage = sc.nextDouble();
            }
            sc.nextLine(); // Consume the remaining newline character

            // System.out.print("Enter truck hood type: ");
            String truckHoodType = sc.nextLine();

            double truckPrice = 0;
            if (sc.hasNextDouble()) {
                truckPrice = sc.nextDouble();
            }

            sc.close();

            Car car = new Car(carMake, carType, carMaxSpeed, carMileage, carSeatingCapacity, carPrice);
            Truck truck = new Truck(truckMake, truckType, truckMaxSpeed, truckMileage, truckHoodType, truckPrice);

            car.printDetails();
            truck.printDetails();
            // System.out.println("Car capacity: " + car.getSeatingCapacity());
            // System.out.println("Truck hood type: " + truck.getHoodType());
        } catch (FileNotFoundException fnf) {
            System.err.println("Input.txt file not found!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
