public class Tollbooth {
    private int totalCarsPassed;
    private double totalCashCollected;
    private int carsPassedWithoutPayment;
    private double tollFees;

    public Tollbooth() {
        this(50);
    }

    public Tollbooth(final double tollFees) {
        this.totalCarsPassed = 0;
        this.totalCashCollected = 0;
        this.carsPassedWithoutPayment = 0;
        this.tollFees = tollFees;
    }

    public void carPaid(boolean paid) {
        this.totalCarsPassed++;

        if (!paid) {
            this.carsPassedWithoutPayment++;
        } else {
            this.totalCashCollected += tollFees;
        }
    }

    public void printStatistics() {
        System.out.println("Toll Booth Statistics:");
        System.out.println("+---------------------------------------------+");
        System.out.printf("| %-30s | %-10s |\n", "Statistics", "Value");
        System.out.println("+---------------------------------------------+");
        System.out.printf("| %-30s | %10s |\n", "Cars Passed Without Payment", carsPassedWithoutPayment);
        System.out.printf("| %-30s | %10s |\n", "Cars Passed With Payment", totalCarsPassed - carsPassedWithoutPayment);
        System.out.printf("| %-30s | %10s |\n", "Total Cars Passed", totalCarsPassed);
        System.out.printf("| %-30s | %10.2f |\n", "Toll Fees Per Car (Rs.)", tollFees);
        System.out.println("+---------------------------------------------+");
        System.out.printf("| %-30s | %10.2f |\n", "Total Cash Collected (Rs.)", totalCashCollected);
        System.out.println("+---------------------------------------------+");
    }
}
