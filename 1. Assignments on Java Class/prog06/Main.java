/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
public class Main {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 2);
		Complex c2 = new Complex(4, -2);

		Complex sum = Complex.add(c1, c2);
		Complex mul = Complex.multiply(c1, c2);

		System.out.println(c1.toString() + " + " + c2.toString() + " = " + sum.toString());
		System.out.println(c1.toString() + " * " + c2.toString() + " = " + mul.toString());
	}
}
