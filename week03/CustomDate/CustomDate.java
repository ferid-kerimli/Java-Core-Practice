package week03.CustomDate;

public class CustomDate {
    private int month; private int day; private int year;
    public CustomDate (int month, int day, int year) {
        if (isValid(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (isValid(month, this.day, this.year)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Invalid month");
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (isValid(this.month, day, this.year)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid day");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (isValid(this.month, this.day, year)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid year");
        }
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
    
    public int difference(CustomDate date) {
        return Math.abs(daysSinceEpoch(this) - daysSinceEpoch(date));
    }
    
    public static int compare(CustomDate date1, CustomDate date2) {
        if (date1.year < date2.year) {
            return 1;
        } else if (date1.year > date2.year) {
            return -1;
        } else {
            if (date1.month < date2.month) {
                return 1;
            } else if (date1.month > date2.month) {
                return -1;
            } else {
                if (date1.day < date2.day) {
                    return 1;
                } else if (date1.day > date2.day) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
    
    public void displayFormatted() {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(day + " " + months[month - 1] + " " + year);
    }
    
    private boolean isValid(int month, int day, int year) {
        if (month < 1 || month > 12 || day < 1 || day > 31 || year < 0)
            return false;
    
        // Checking for valid day in the month
        if (day > daysInMonth(month, year))
            return false;
    
        return true;
    }
    
    private int daysInMonth(int month, int year) {
        int daysInMonth;
        switch (month) {
            case 2:
                daysInMonth = (isLeapYear(year)) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                daysInMonth = 31;
        }
        return daysInMonth;
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    private int daysSinceEpoch(CustomDate date) {
        int days = 0;
        for (int y = 0; y < date.year; y++) {
            days += (isLeapYear(y)) ? 366 : 365;
        }
        for (int m = 1; m < date.month; m++) {
            days += daysInMonth(m, date.year);
        }
        days += date.day;
        return days;
    }
}
