/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

import java.util.EmptyStackException;

public class Main {
	public static void main(String[] args) {
		Stack st = new Stack(30);
		try {
			st.push(10);
			st.push(20);
			st.push(30);
			st.push(15);
			st.push(9);
			st.printStack();
			st.pop();
			st.pop();
			st.pop();
			st.printStack();
		} catch (EmptyStackException ese) {
			System.err.println("stack is empty");
		} catch (StackOverflowException sofe) {
			System.err.println("stack has reached its maximum capacity");
		}
	}
}
