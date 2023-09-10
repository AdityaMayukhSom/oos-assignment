import java.util.HashMap;

public class Date {
	private final int date;
	private final int month;
	private final int year;
	private final boolean isLeapYear;
	private static final HashMap<String, Integer> monthDateCount;

	static {
		monthDateCount = new HashMap<String, Integer>();

		monthDateCount.put("January", 31);
		monthDateCount.put("February", 28);
		monthDateCount.put("March", 31);
		monthDateCount.put("April", 30);
		monthDateCount.put("May", 31);
		monthDateCount.put("June", 30);
		monthDateCount.put("July", 31);
		monthDateCount.put("August", 31);
		monthDateCount.put("September", 30);
		monthDateCount.put("October", 31);
		monthDateCount.put("November", 30);
		monthDateCount.put("December", 31);
	}

	private static boolean isLeapYear(final int year) {
		boolean leap = false;

		if (year % 400 == 0) {
			leap = true;
		} else if (year % 100 == 0) {
			leap = false;
		} else if (year % 4 == 0) {
			leap = true;
		} else {
			leap = false;
		}

		return leap;
	}

	private final String[] monthList = { "January", "February", "March", "April", "May",
			"June", "July", "August", "September", "October", "November", "December" };

	public Date() throws Exception {
		this(1, 0, 1970);
	}

	public Date(final int date) throws Exception {
		this(date, 0, 1970);
	}

	public Date(final int date, final int month) throws Exception {
		this(date, month, 1970);
	}

	/** months are zero based */
	public Date(final int date, final int month, final int year) throws Exception {
		if (date < 1) {
			throw new Exception("date must be positive");
		}

		if (date > 31) {
			throw new Exception("date out of bound");
		}

		if (month < 0) {
			throw new Exception("month cannot be negative");
		}

		if (month > 11) {
			throw new Exception("month index out of bound");
		}

		if (year < 1) {
			throw new Exception("year must be positive");
		}

		this.isLeapYear = Date.isLeapYear(year);

		if (month == 1 && this.isLeapYear && date > 29) {
			final String errstr = "date " + date + " not possible for february for year " + year
					+ " which is a leapyear";
			throw new Exception(errstr);
		}

		if (month == 1 && !this.isLeapYear && date > 28) {
			final String errstr = "date " + date + " not possible for february for year " + year
					+ " which is not a leapyear";
			throw new Exception(errstr);
		}

		if (month != 1 && date > monthDateCount.get(monthList[month])) {
			throw new Exception("date not valid for the month " + monthList[month]);
		}

		this.date = date;
		this.month = month;
		this.year = year;
	}

	public Date getPreviousDate() throws Exception {
		if (this.month == 0 && this.date == 1) {
			return new Date(31, 11, this.year - 1);
		} else if (this.date == 1 && this.month == 2 && this.isLeapYear) {
			return new Date(29, 1, this.year);
		} else if (this.date == 1 && this.month == 2) {
			return new Date(28, 1, this.year);
		} else if (this.date == 1) {
			return new Date(monthDateCount.get(monthList[this.month - 1]), this.month - 1, this.year);
		} else {
			return new Date(this.date - 1, this.month, this.year);
		}
	}

	public Date getNextDate() throws Exception {
		if (this.month == 1 && this.date == 29) {
			// if the date is 29th february, next date is 1st march
			return new Date(1, this.month + 1, this.year);
		} else if (this.month == 1 && this.date == 28 && this.isLeapYear) {
			// if year is leapyear and date is 28th february, next date is 29th february
			return new Date(29, this.month, this.year);
		} else if (this.month == 11 && this.date == 31) {
			// handling 31st December, next date is 1st January of next year
			return new Date(1, 0, this.year + 1);
		} else if (this.date == monthDateCount.get(monthList[this.month])) {
			// if the date is the last date of the month, next date is 1st of the next month
			return new Date(1, this.month + 1, this.year);
		} else {
			// if none of above occurs, the next date is simply one date after current date
			return new Date(this.date + 1, this.month, this.year);
		}
	}

	@Override
	public String toString() {
		if (this.date < 10) {
			return "0" + this.date + " " + monthList[this.month] + ", " + this.year;
		} else {
			return this.date + " " + monthList[this.month] + ", " + this.year;
		}
	}
}
