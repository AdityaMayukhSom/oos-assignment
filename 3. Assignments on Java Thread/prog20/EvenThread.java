public class EvenThread implements Runnable {
    Counter ctr;

    EvenThread(Counter ctr) {
        this.ctr = ctr;
    }

    public void run() {
        try {
            ctr.printEven();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
