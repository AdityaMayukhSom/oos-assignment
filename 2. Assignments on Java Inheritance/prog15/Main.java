/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
public class Main {
    public static void main(String[] args) {
        // Create two circles
        Circle circle1 = new Circle(5.0, 0.0, 0.0);
        Circle circle2 = new Circle(3.0, 2.0, 2.0);

        // Create three rectangles
        Rectangle rectangle1 = new Rectangle(4.0, 6.0, 1.0, 1.0);
        Rectangle rectangle2 = new Rectangle(7.0, 3.0, -1.0, -2.0);
        Rectangle rectangle3 = new Rectangle(2.0, 2.0, 3.0, 3.0);

        // Print details before moving
        System.out.println(
                "Circle 1 - Radius: " + circle1.getRadius() + ", X: " + circle1.getX() + ", Y: " + circle1.getY());
        System.out.println(
                "Circle 2 - Radius: " + circle2.getRadius() + ", X: " + circle2.getX() + ", Y: " + circle2.getY());
        System.out.println("Rectangle 1 - Width: " + rectangle1.getWidth() + ", Height: " + rectangle1.getHeight()
                + ", X: " + rectangle1.getX() + ", Y: " + rectangle1.getY());
        System.out.println("Rectangle 2 - Width: " + rectangle2.getWidth() + ", Height: " + rectangle2.getHeight()
                + ", X: " + rectangle2.getX() + ", Y: " + rectangle2.getY());
        System.out.println("Rectangle 3 - Width: " + rectangle3.getWidth() + ", Height: " + rectangle3.getHeight()
                + ", X: " + rectangle3.getX() + ", Y: " + rectangle3.getY());

        // Move the shapes
        circle1.move(2.0, 3.0);
        circle2.move(-1.0, 2.0);
        rectangle1.move(1.0, -1.0);
        rectangle2.move(0.5, -0.5);
        rectangle3.move(-2.0, -3.0);

        // Print details after moving
        System.out.println(
                "Circle 1 - Radius: " + circle1.getRadius() + ", X: " + circle1.getX() + ", Y: " + circle1.getY());
        System.out.println(
                "Circle 2 - Radius: " + circle2.getRadius() + ", X: " + circle2.getX() + ", Y: " + circle2.getY());
        System.out.println("Rectangle 1 - Width: " + rectangle1.getWidth() + ", Height: " + rectangle1.getHeight()
                + ", X: " + rectangle1.getX() + ", Y: " + rectangle1.getY());
        System.out.println("Rectangle 2 - Width: " + rectangle2.getWidth() + ", Height: " + rectangle2.getHeight()
                + ", X: " + rectangle2.getX() + ", Y: " + rectangle2.getY());
        System.out.println("Rectangle 3 - Width: " + rectangle3.getWidth() + ", Height: " + rectangle3.getHeight()
                + ", X: " + rectangle3.getX() + ", Y: " + rectangle3.getY());
    }
}
