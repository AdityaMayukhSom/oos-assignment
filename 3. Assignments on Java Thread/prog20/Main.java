/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 * 
 * Create two threads and call them EvenThread and OddThread. EvenThread will print number as 2 4 6 8 10... and OddThread will print number as 1 3 5…. Now synchronize these two thread to get the output as 1 2 3 4 5 6 7 8.
 */

class Main {
	public static void main(String[] args) {
		Counter ctr = new Counter(10);

		EvenThread evenThread = new EvenThread(ctr);
		OddThread oddThread = new OddThread(ctr);

		Thread t1 = new Thread(evenThread);
		Thread t2 = new Thread(oddThread);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}
}
