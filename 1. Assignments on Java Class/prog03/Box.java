public class Box {
	private double height;
	private double width;
	private double breadth;

	public Box(final double height, final double width, final double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	public double getVolume() {
		double volume = this.breadth * this.width * this.height;
		return volume;
	}

	public double getArea() {
		double area = 2 * (this.width * this.breadth + this.breadth * this.height + this.height * this.width);
		return area;
	}
}
