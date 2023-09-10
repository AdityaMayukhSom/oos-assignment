public class TabulationSheet {
	private int[] rollNos;
	private int[] marks;

	public TabulationSheet() {
		this.rollNos = new int[] {};
		this.marks = new int[] {};
	}

	public TabulationSheet(int[] rollNos, int[] marks) {
		this.rollNos = rollNos;
		this.marks = marks;
	}

	public void changeMarks(int rollNo, int newMark) {
		int pos = -1;
		for (int i = 0; i < this.rollNos.length; i++) {
			if (this.rollNos[i] == rollNo) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			throw new Error("roll does not exist");
		}

		this.marks[pos] = newMark;
	}

	public void addNewRoll(int rollNo, int marks) {
		int newNumberOfStudents = this.rollNos.length + 1;

		int[] newRollNos = new int[newNumberOfStudents];
		int[] newMarks = new int[newNumberOfStudents];

		for (int i = 0; i < this.rollNos.length; i++) {
			newRollNos[i] = this.rollNos[i];
			newMarks[i] = this.marks[i];
		}

		newRollNos[newNumberOfStudents - 1] = rollNo;
		newMarks[newNumberOfStudents - 1] = marks;

		this.marks = newMarks;
		this.rollNos = newRollNos;
	}

	public int getMarks(int rollNo) {
		int pos = -1;
		for (int i = 0; i < this.rollNos.length; i++) {
			if (this.rollNos[i] == rollNo) {
				pos = i;
				break;
			}
		}

		if (pos == -1) {
			throw new Error("roll number does not exist");
		}

		return this.marks[pos];
	}
}
