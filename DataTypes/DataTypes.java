import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final String documentary = "Chernobyl";
        final String comedy = "Tropic Thunder";
        final String drama = "Godfather";
        final String dramedy = "Lala Land";

        System.out.println("Do you like documentaries? [y/n]");
        String docResult = input.nextLine();

        System.out.println("Do you like dramas? [y/n]");
        String dramResult = input.nextLine();

        System.out.println("Do you like comedies? [y/n]");
        String comResult = input.nextLine();

        System.out.println(docResult + " " + dramResult + " " + comResult);

        if (docResult.equals("y")) {
            System.out.println("I recommend watching " + documentary);
        } else if (dramResult.equals("y")  && comResult.equals("y")) {
            System.out.println("I recommend watching " + dramedy);
        } else if (dramResult.equals("y")) {
            System.out.println("I recommend watching " + drama);
        } else if (comResult.equals("y")) {
            System.out.println("I recommend watching " + comedy);
        } else {
            System.out.println("I reccommend you read Sapiens by Yuval Noah Harari");
        };
        input.close();
    }
}
