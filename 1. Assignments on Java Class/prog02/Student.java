public class Student {
	private final String name;
	private Marks marks;

	public Student(final String name) {
		this.name = name;
	}

	public Student(final String name, final double mathematicsMarks, final double chemistryMarks,
			final double physicsMarks) {
		this.name = name;
		this.marks = new Marks(mathematicsMarks, chemistryMarks, physicsMarks);
	}

	public double calculateAverage() {
		return this.marks.getAverage();
	}

	@Override
	public String toString() {
		final String str = "Student Name\t:: " + name + " \nTotal Marks\t:: " + this.marks.getTotalMarks() + "\n";
		return str;
	}
}

class Marks {
	private final double mathematicsMarks;
	private final double chemistryMarks;
	private final double physicsMarks;

	Marks(final double mathematicsMarks, final double chemistryMarks, final double physicsMarks) {
		this.mathematicsMarks = mathematicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.physicsMarks = physicsMarks;
	}

	public double getAverage() {
		final double average = (this.mathematicsMarks + this.physicsMarks + this.chemistryMarks) / 3;
		return average;
	}

	public double getTotalMarks() {
		final double totalMarks = this.mathematicsMarks + this.physicsMarks + this.chemistryMarks;
		return totalMarks;
	}
}
