/*
 * Name : Aditya Mayukh Som
 * Roll Number : 002111001123
 * 
23) Consider the series 1+2+3+…+100. This can be considered as (1+3+5+…+99)+(2+4+6+…+100). Create two threads to compute two series in parallel (do not use simplified equation). Finally print the final sum. 
 * 
 */

public class Main {
	public static void main(String[] args) throws InterruptedException {
		int upto = 100;

		Even e = new Even(upto);
		Odd o = new Odd(upto);

		Thread t1 = new Thread(e);
		Thread t2 = new Thread(o);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("sum upto " + upto + " is " + (e.getSum() + o.getSum()));
	}
}
