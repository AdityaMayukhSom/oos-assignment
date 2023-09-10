public class OddThread implements Runnable {
    private Counter ctr;

    OddThread(Counter ctr) {
        this.ctr = ctr;
    }

    public void run() {
        try {
            ctr.printOdd();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
