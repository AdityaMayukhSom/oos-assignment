class Even implements Runnable {
    int upto;
    int sum;

    Even(int upto) {
        this.upto = upto;
        this.sum = 0;
    }

    public void run() {
        for (int i = 2; i <= this.upto; i += 2) {
            sum = sum + i;
        }
    }

    public int getSum() {
        return this.sum;
    }
}