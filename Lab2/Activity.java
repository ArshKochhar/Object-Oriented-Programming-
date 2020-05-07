public class Stock {

    private int day;
    private int month;
    private int year;
    private String name;
    private int[] values = new int[7];

    public Stock() {
        day = 1;
        month = 1;
        year = 1;
        name = "";
        for (int i = 0; i < 7; i++) {
            values[i] = 0;

        }

    }

    public String getName() {
        return name;

    }

    public int getValue(int ind) {
        if (ind < 0 || ind > 6) {
            return -1;
        } else {
            return values[ind];
        }

    }

    public void setName(String nameIn) {
        name = nameIn;

    }

    public void setValue(int val, int ind) {
        if (val < 0 || ind < 0 || ind > 6) {
            System.out.println("Error, invalid index or value");
        } else {
            values[ind] = val;
        }
    }

    public void printStock() {
        System.out.println(day + "." + month + "." + year);
        System.out.println(name);
        for (int i = 0; i < 7; i++) {
            System.out.print(values[i] + ",");

        }
        System.out.println();

    }

    public int getMeanValue() {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return (int) sum / values.length;

    }

    public Stock(int dayIn, int monthIn, int yearIn, String nameIn, int[] valIn) {
        if (dayIn > 0 && dayIn < 32) {
            day = dayIn;
        } else {
            day = 1;
            System.out.println("Error, please enter a valid day");

        }
        if (monthIn > 0 && monthIn < 13) {
            month = monthIn;

        } else {
            month = 1;
            System.out.println("Error, please enter a valid month");

        }

        if (yearIn > 0) {
            year = yearIn;

        } else {
            year = 1;
            System.out.println("Error, please enter a valid year");

        }

        if (monthIn == 2 && dayIn > 28) {
            System.out.println("Error, please enter a valid day");
            day = 1;

        }

        for (int i = 0; i < valIn.length; i++) {
            if (valIn[i] < 0) {
                values[i] = 0;
            } else {
                values[i] = valIn[i];

            }

        }

        if (valIn.length != 7) {
            System.out.println("Error, please enter right size");
            for (int i = 0; i < valIn.length; i++) {
                values[i] = 0;

            }
        }

        name = nameIn;
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
        if (dayIn > 0 && dayIn < 32) {
            day = dayIn;
        } else {
            day = 1;
            System.out.println("Error, please enter a valid day");

        }
        if (monthIn > 0 && monthIn < 13) {
            month = monthIn;

        } else {
            month = 1;
            System.out.println("Error, please enter a valid month");

        }

        if (yearIn > 0) {
            year = yearIn;

        } else {
            year = 1;
            System.out.println("Error, please enter a valid year");

        }

        if (monthIn == 2 && dayIn > 28) {
            System.out.println("Error, please enter a valid day");
            day = 1;

        }

    }

    public void printDate() {
        System.out.println(day + "." + month + "." + year);

    }

}