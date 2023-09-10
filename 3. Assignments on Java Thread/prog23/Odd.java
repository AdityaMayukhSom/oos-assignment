class Odd implements Runnable {
    int upto;
    int sum;

    Odd(int upto) {
        this.upto = upto;
        this.sum = 0;
    }

    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            sum = sum + i;
        }
    }

    public int getSum() {
        return this.sum;
    }
}