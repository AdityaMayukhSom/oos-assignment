/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int experimentCount = 1000;
        double probabilityOfPaying = 0.9;

        Random random = new Random();
        Tollbooth tollbooth = new Tollbooth();

        // Simulating cars passing by the toll booth
        while (--experimentCount >= 0) {
            double res = random.nextDouble();
            tollbooth.carPaid(res < probabilityOfPaying);
        }

        tollbooth.printStatistics();
    }
}
