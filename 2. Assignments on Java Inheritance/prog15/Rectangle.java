// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double width;
    private double height;
    private double x;
    private double y;

    public Rectangle(double width, double height, double x, double y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public void rotate() {
        System.out.println("Rotating a rectangle");
    }

    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}