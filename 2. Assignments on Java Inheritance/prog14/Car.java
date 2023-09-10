public class Car extends Automobile {
    int seatingCapacity;

    Car(final String make, final String type, final double maxSpeed, final double mileage, final int seatingCapacity,
            final double price) {
        super(make, type, maxSpeed, mileage, price);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void printDetails() {
        System.out.println("\n-----------: Car Details :-----------");
        System.out.println("-------------------------------------");
        System.out.printf("| %-15s | %-15s |\n", "Reg. No.", getRegNum());
        System.out.printf("| %-15s | %-15s |\n", "Make", getMake());
        System.out.printf("| %-15s | %-15s |\n", "Type", getType());
        System.out.printf("| %-15s | %-15s |\n", "Max Speed", getMaxSpeed());
        System.out.printf("| %-15s | %-15s |\n", "Mileage", getMileage());
        System.out.printf("| %-15s | %-15s |\n", "Max Capacity", seatingCapacity + " person(s)");
        System.out.printf("| %-15s | %-15.2f |\n", "Price ($)", getPrice());
        System.out.println("-------------------------------------");
    }
}