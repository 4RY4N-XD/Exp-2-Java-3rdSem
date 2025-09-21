public class Date {
    private int month;
    private int day;
    private int year;

    // Constructor
    public Date(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Setters with basic validation
    public void setMonth(int month) {
        if (month < 1 || month > 12)
            throw new IllegalArgumentException("Month must be between 1 and 12");
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) // Simplified; you can add month-specific logic later
            throw new IllegalArgumentException("Day must be between 1 and 31");
        this.day = day;
    }

    public void setYear(int year) {
        if (year < 0)
            throw new IllegalArgumentException("Year must be positive");
        this.year = year;
    }

    // Display date in MM/DD/YYYY format
    public String displayDate() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    //override toString for direct printing
    @Override
    public String toString() {
        return displayDate();
    }
}