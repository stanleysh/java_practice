import java.util.Scanner;

public class DataTypes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String documentary = "Chernobyl";
        final String comedy = "Tropic Thunder";
        final String drama = "Godfather";
        final String dramedy = "Lala Land";

        System.out.println("Please rate your enjoyment of documentaries [1-5]");
        int docResult = input.nextInt();

        System.out.println("Do you like dramas? [1-5]");
        int dramResult = input.nextInt();

        System.out.println("Do you like comedies? [1-5]");
        int comResult = input.nextInt();

        System.out.println(docResult + " " + dramResult + " " + comResult);

        if (docResult >= 4) {
            System.out.println("I recommend watching " + documentary);
        } else if (dramResult >= 4  && comResult >= 4) {
            System.out.println("I recommend watching " + dramedy);
        } else if (dramResult >= 4) {
            System.out.println("I recommend watching " + drama);
        } else if (comResult >= 4) {
            System.out.println("I recommend watching " + comedy);
        } else {
            System.out.println("I reccommend you read Sapiens by Yuval Noah Harari");
        };
        input.close();
    }
}