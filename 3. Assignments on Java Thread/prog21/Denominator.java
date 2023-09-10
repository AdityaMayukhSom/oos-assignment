class Denominator implements Runnable {
    Counter ctr;

    Denominator(Counter ctr) {
        this.ctr = ctr;
    }

    public void run() {
        System.out.println("Denominator Thread Started.");
        try {
            ctr.createDenom();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}