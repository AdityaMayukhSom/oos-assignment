public class Producer implements Runnable {
    Utility util;

    Producer(Utility util) {
        this.util = util;
    }

    public void run() {
        try {
            util.read();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
