/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
public class Main {
	public static void main(String[] args) {
		Box box1 = new Box(5, 6, 7);
		Box box2 = new Box(2, 3, 6);

		System.out.println("-------- Box 1 Details --------");
		System.out.println("Area\t:: " + box1.getArea() + " square units.");
		System.out.println("Volume\t:: " + box1.getVolume() + " cube units.");

		System.out.println("-------- Box 2 Details --------");
		System.out.println("Area\t:: " + box2.getArea() + " square units.");
		System.out.println("Volume\t:: " + box2.getVolume() + " cube units.");
	}
}
