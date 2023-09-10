public class Counter {
    private int N;
    private int fact;
    private int count;
    private double sum;
    private boolean denomCreated;

    public Counter(int n) {
        this.N = n;
        this.sum = 1;
        this.fact = 1;
        this.count = 1;
        this.denomCreated = false;
    }

    synchronized public void createDenom() throws InterruptedException {
        while (count < N) {
            if (denomCreated) {
                wait();
            }
            this.fact = this.fact * count;
            denomCreated = !denomCreated;
            notify();
        }
    }

    synchronized public void createTerm() throws InterruptedException {
        while (count < N) {
            if (!denomCreated) {
                wait();
            }
            double res = (double) 1 / this.fact;
            sum = sum + res;
            count++;
            denomCreated = !denomCreated;
            notify();
        }
    }

    synchronized public void printSum() {
        System.out.println("sum is : " + this.sum);
        return;
    }
}