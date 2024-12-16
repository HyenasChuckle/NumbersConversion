import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to number Converter!");
        System.out.print("Enter your number: ");

        // Retrieving number from user.
        int enteredNumber = scan.nextInt();
        scan.nextLine(); // Clearing buffer.

        // Printing out binary form of entered number.
        Converter.convertBinary(enteredNumber);

    }
}