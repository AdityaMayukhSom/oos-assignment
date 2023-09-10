public class Consumer implements Runnable {
    Utility util;

    Consumer(Utility util) {
        this.util = util;
    }

    public void run() {
        try {
            util.add();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}
