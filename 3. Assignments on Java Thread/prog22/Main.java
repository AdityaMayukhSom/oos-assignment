/*
 * Name : Aditya Mayukh Som
 * Roll Number : 002111001123
 * 
Consider a file that contains a number of integers. Create two threads. Call them ‘producer’ and ‘consumer’ thread. Producer thread will be reading the integers from the file continuously while consumer thread will add them up. Use proper synchronization mechanism if needed. * 
 */

public class Main {
    public static void main(String[] args) {
        String delimiter = " ";

        if (args.length < 1) {
            System.out.println("WRONG NUMBER OF ARGUMENTS GIVEN.");
            System.out.println("TRY :: java <MainClassName> <InputFileName>");
            System.out.println("NOTE :: Default Delimiter Is Space.");
            System.out.println("TRY :: java <MainClassName> <InputFileName> <Delimiter>");
            System.exit(-1);
        }

        if (args.length == 2) {
            delimiter = args[1];
        }

        System.out.println("Main Thread Running");
        Utility utility = new Utility(args[0], delimiter);

        Producer producer = new Producer(utility);
        Consumer consumer = new Consumer(utility);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        utility.printSum();
    }
}