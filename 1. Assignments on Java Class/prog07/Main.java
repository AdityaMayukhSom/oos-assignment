/*
 * Name : Aditya Mayukh Som
 * Roll : 002111001123
 */
public class Main {
	public static void main(String[] args) {
		try {
			Date dt;
			if (args.length == 1) {
				int date = Integer.parseInt(args[0]);
				dt = new Date(date);
			} else if (args.length == 2) {
				int date = Integer.parseInt(args[0]);
				int month = Integer.parseInt(args[1]);
				dt = new Date(date, month);
			} else if (args.length == 3) {
				int date = Integer.parseInt(args[0]);
				int month = Integer.parseInt(args[1]);
				int year = Integer.parseInt(args[2]);
				dt = new Date(date, month, year);
			} else {
				System.out.println("wrong arguments list");
				System.out.println("run: java Main <date>");
				System.out.println("run: java Main <date> <month>");
				System.out.println("run: java Main <date> <month> <year>");
				System.out.println("n.b. months are zero based");
				throw new Error("wrong arguments list");
			}

			System.out.println("Previous Date\t:: " + dt.getPreviousDate().toString());
			System.out.println("Present Date\t:: " + dt.toString());
			System.out.println("Upcoming Date\t:: " + dt.getNextDate().toString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
