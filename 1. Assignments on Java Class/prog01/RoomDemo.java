public class RoomDemo {
	public static void main(String[] args) {
		Room room = new Room(4, 5, 6);
		System.out.println("Heigth of room is :: " + room.getHeight() + " units.");
		System.out.println("Width of room is :: " + room.getWidth() + "units.");
		System.out.println("Breadth of room is :: " + room.getBreadth() + " units.");
		System.out.println("Volume of room is :: " + room.getVolume() + " cube units.");
	}
}
