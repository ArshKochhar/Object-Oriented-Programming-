import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        int min = 10, max = 20, average = 5;
        String myrole = "Driver";
        byte myfirstbyte = 22;
        double pi = 3.14159;
        char mychar = 'N';

        System.out.println("I am now the " + myrole);
        System.out.println("Our minimum score is " + min);
        System.out.println("We have a byte " + myfirstbyte);
        System.out.println("And double type is " + pi);
        System.out.println("A char looks like " + mychar);

        Date todaysdate = new Date();

        int count = 1;
        while (count <= 10) {
            System.out.println(todaysdate);
            count++;
        }

        for (int i = 1; i <= 25; i++) {
            System.out.println(todaysdate);

        }

        for (int row = 1; row <= 5; row++) {
            for (int column = 1; column <= 10; column++) {
                System.out.print(row * column + "\t");
            }
            System.out.println();
        }

    }
}