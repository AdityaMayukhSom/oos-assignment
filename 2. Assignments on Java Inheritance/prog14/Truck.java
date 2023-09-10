public class Truck extends Automobile {
    String hoodType;

    Truck(final String make, final String type, final double maxSpeed, final double mileage, final String hoodType,
            final double price) {
        super(make, hoodType, maxSpeed, mileage, price);
        this.hoodType = hoodType;
    }

    public String getHoodType() {
        return hoodType;
    }

    public void printDetails() {
        System.out.println("\n----------: Truck Details :----------");
        System.out.println("-------------------------------------");
        System.out.printf("| %-15s | %-15s |\n", "Reg. No.", getRegNum());
        System.out.printf("| %-15s | %-15s |\n", "Make", getMake());
        System.out.printf("| %-15s | %-15s |\n", "Type", getType());
        System.out.printf("| %-15s | %-15s |\n", "Max Speed", getMaxSpeed());
        System.out.printf("| %-15s | %-15s |\n", "Mileage", getMileage());
        System.out.printf("| %-15s | %-15s |\n", "Hood Type", hoodType);
        System.out.printf("| %-15s | %-15.2f |\n", "Price ($)", getPrice());
        System.out.println("-------------------------------------");
    }
}