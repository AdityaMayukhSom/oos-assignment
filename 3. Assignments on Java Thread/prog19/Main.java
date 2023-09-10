public class Main {
    public static void main(String args[]) {
        try {
            Child child = new Child();
            Thread th = new Thread(child);

            th.start();
            th.join();

            System.out.println("In Main Thread.");
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

    }
}
