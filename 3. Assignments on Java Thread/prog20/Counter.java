public class Counter {
	private int count = 1;
	private int N;

	public Counter(int n) {
		this.N = n;
	}

	synchronized public void printOdd() throws InterruptedException {
		while (count < N) {
			if (count % 2 == 0) {
				wait();
			}

			System.out.print(String.format("%-13s : %03d\n", "Odd Thread", count));
			// System.out.println("Odd Thread : " + count);
			count++;
			notify();
		}
	}

	synchronized public void printEven() throws InterruptedException {
		while (count < N) {
			if (count % 2 == 1) {
				wait();
			}

			System.out.print(String.format("%-13s : %03d\n", "Even Thread", count));
			// System.out.println("Even Thread : " + count);
			count++;
			notify();
		}
	}
}
