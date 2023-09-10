import java.time.LocalDate;

public class Date {
    private final int year;
    private final int month;
    private final int day;

    public Date(final int year, final int month, final int day) {
        if (year < 1) {
            throw new IllegalArgumentException("Year must be positive");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        if (day < 1 || day > getDaysInMonth(year, month)) {
            throw new IllegalArgumentException("Day must be between 1 and " + getDaysInMonth(year, month));
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int getDaysInMonth(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static int computeYearsBetweenDates(Date startDate, Date endDate) {
        int startYear = startDate.getYear();
        int startMonth = startDate.getMonth();
        int startDay = startDate.getDay();

        int endYear = endDate.getYear();
        int endMonth = endDate.getMonth();
        int endDay = endDate.getDay();

        // Check if endDate is earlier than startDate
        if (endYear < startYear || (endYear == startYear && endMonth < startMonth)
                || (endYear == startYear && endMonth == startMonth && endDay < startDay)) {
            throw new IllegalArgumentException("End date cannot be earlier than start date");
        }

        int years = endYear - startYear;

        // Adjust the years if the end date is before the start date in the same month
        // and day
        if (endMonth < startMonth || (endMonth == startMonth && endDay < startDay)) {
            years--;
        }

        return years;
    }

    public static Date now() {
        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        return new Date(year, month, day);
    }

    @Override
    public String toString() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
}
