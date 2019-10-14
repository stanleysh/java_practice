import java.util.Scanner;

public class Fundamentals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a number: ");

        int number = input.nextInt();
        
        if (number > 10) {
            String result = String.format("%d is greater than 10", number);
            System.out.println(result);
        } else if (number < 10) {
            String result = String.format("%d is less than 10", number);
            System.out.println(result);
        } else {
            System.out.println("10 is equal to 10");
        };
        input.close();
    }
}