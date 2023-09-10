import java.util.EmptyStackException;

public class Stack {
	private int[] arr;
	private int size;
	private int top;

	public Stack(final int size) throws Error {
		if (size < 0) {
			throw new Error("stack size cannot be negative");
		}

		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}

	/** This function returns the size of the current stack */
	public int push(final int data) throws StackOverflowException {
		if (this.top == this.size - 1) {
			throw new StackOverflowException();
		}

		this.top++;
		this.arr[this.top] = data;
		return (this.top + 1);
	}

	/**
	 * Removes the top element from the stack.
	 * 
	 * @return Removed element from the stack.
	 * @throws EmptyStackException if the stack is empty.
	 */
	public int pop() throws EmptyStackException {
		if (size == -1) {
			throw new EmptyStackException();
		}

		int data = this.arr[this.top];
		this.top--;

		return data;
	}

	public void printStack() {
		System.out.println("----: stack begin :----");

		if (top != -1) {
			System.out.println(this.arr[top] + " <- top");

		}
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(this.arr[i]);
		}

		System.out.println("----: stack ending :----");
	}
}
