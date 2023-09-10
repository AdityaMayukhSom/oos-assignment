/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */

public class Main {
        public static void main(String[] args) {
                Student student = new Student(
                                "Aditya Mayukh Som",
                                new Date(2005, 9, 12),
                                "10 Downing Street, London, SW1A 2AA, United Kingdom",
                                5.5,
                                55.5,
                                new String[] { "Maths", "Science", "English" },
                                new int[] { 95, 90, 85 });

                Technician technician = new Technician(
                                "Ada Lovelace",
                                new Date(1985, 9, 22),
                                "221B Baker Street, London, NW1 6XE, United Kingdom",
                                80.0,
                                5.9,
                                new Date(2015, 7, 1),
                                70000.00,
                                10,
                                "High Energy Physics");

                Professor professor = new Professor(
                                "Albert Einstein",
                                new Date(1973, 10, 2),
                                "160 Fleet Street, London, EC4A 2DQ, United Kingdom",
                                5.8,
                                70.0,
                                new Date(2010, 1, 1),
                                100000.0,
                                15,
                                new String[] { "Mathematics", "Machine Learning", "Artificial Intelligence" });

                technician.printDetails();
                student.printDetails();
                professor.addAdvisee(student);
        }
}
