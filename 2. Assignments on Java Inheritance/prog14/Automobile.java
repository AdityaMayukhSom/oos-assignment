import java.util.Random;

public class Automobile {
	private static final String CHARACTER_SET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
	private static final int registrationNumberLength = 10;

	String regNum;
	String make;
	String type;
	double price;
	double maxSpeed;
	double mileage;

	public static String generateRegistrationNumber() {
		StringBuilder registrationNumber = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < registrationNumberLength; i++) {
			int randomIndex = random.nextInt(CHARACTER_SET.length());
			char randomChar = CHARACTER_SET.charAt(randomIndex);
			registrationNumber.append(randomChar);
		}

		return registrationNumber.toString();
	}

	Automobile(final String make, final String type, final double maxSpeed, final double mileage, final double price) {
		this.regNum = Automobile.generateRegistrationNumber();
		this.make = make;
		this.type = type;
		this.maxSpeed = maxSpeed;
		this.mileage = mileage;
		this.price = price;
	}

	public String getRegNum() {
		return regNum;
	}

	public String getMake() {
		return make;
	}

	public String getType() {
		return type;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public double getMileage() {
		return mileage;
	}

	public double getPrice() {
		return price;
	}
}
