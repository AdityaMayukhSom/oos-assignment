/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();

		Subject mathematics = new Subject("Mathematics");
		Subject science = new Subject("Science");
		Subject english = new Subject("English");
		Subject history = new Subject("History");
		Subject geography = new Subject("Geography");
		Subject biology = new Subject("Biology");

		Subject[] subjects = new Subject[] { mathematics, science, english, history, geography, biology };

		Student s1 = new Student("Roheena Pal", subjects);
		Student s2 = new Student("Aditya Mayukh Som", subjects);
		Student s3 = new Student("Anushka Mukherjee", subjects);
		Student s4 = new Student("Manosrija Nasrin", subjects);

		Student[] students = new Student[] { s1, s2, s3, s4 };

		int minMarks = 80;
		int variation = 100 - minMarks;

		for (Subject subject : subjects) {
			for (Student student : students) {
				subject.updateStudentMarks(student.getRollNo(), minMarks + random.nextInt(variation));
			}
		}

		for (Student student : students) {
			student.generateMarkSheet().print();
		}
	}
}
