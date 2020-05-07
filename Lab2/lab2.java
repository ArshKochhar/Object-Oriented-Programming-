public class Activity {
    private int day;
    private int month;
    private int year;

    public Activity() {

        day = 1;
        month = 1;
        year = 1;

    }

    public Activity(int dayIn, int monthIn, int yearIn) {

        if ((day <= 31 && day > 0) && (month <= 12) && month > 0) {
            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11 && day <= 30) {
                day = dayIn;
                month = monthIn;
                year = yearIn;
            }
        }

        else {
            if (dayIn > 31 || dayIn < 0) {
                day = 1;
            }
            if (monthIn > 12 || monthIn < 0) {
                month = 1;
            }
        }

        if (month == 2 && day <= 28) {
            day = dayIn;
            month = monthIn;
            year = yearIn;

        }
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(int dayIn, int monthIn, int yearIn) {

        if ((day <= 31 && day > 0) && (month <= 12) && month > 0) {
            if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11 && day <= 30) {
                day = dayIn;
                month = monthIn;
                year = yearIn;
            }
        } else {
            System.out.println("Not a valid date");
        }

        if (month == 2 && day <= 28) {
            day = dayIn;
            month = monthIn;
            year = yearIn;
        } else {
            System.out.println("Not a valid date");
        }

    }

    public void printDate() {
        System.out.println(dayIn + "." + monthIn + "." + yearIn);
    }

}