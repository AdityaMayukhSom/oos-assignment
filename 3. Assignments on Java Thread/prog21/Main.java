/*
 * Name : Aditya Mayukh Som
 * Roll Number : 002111001123
 * 
Consider the following series
x = 1+1/1! +1/2! + 1/3! + ………1/10!
Create two threads t1 & t2.  t1 will generate the denominators and t2 will form the term and add them up. Finally print the result.
 */

public class Main {
	public static void main(String[] args) throws InterruptedException {
		try {
			Counter ctr = new Counter(10);

			Term term = new Term(ctr);
			Denominator den = new Denominator(ctr);

			Thread t1 = new Thread(den);
			Thread t2 = new Thread(term);

			System.out.println("Main Thread.");

			t1.start();
			t2.start();

			t1.join();
			t2.join();

			ctr.printSum();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}

	}
}
