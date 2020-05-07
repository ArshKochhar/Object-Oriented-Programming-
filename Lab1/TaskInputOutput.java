import java.util.Scanner;

public class TaskInputOutput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LabExampleIO obj = new LabExampleIO();
        // Ask user for input name
        System.out.println("What are two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println("Your Sum is:" + sum);
        System.out.println("Your Product is:" + product);

    }
}
