/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

public class Room {
	private double height;
	private double width;
	private double breadth;

	public Room(final double height, final double width, final double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	public double getVolume() {
		double vol = this.height * this.width * this.breadth;
		return vol;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getBreadth() {
		return breadth;
	}
}
