import java.util.Scanner;

public class Main {
    public static final String GREEN = "\033[32m";
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to number Converter!");
        System.out.print("Enter your number: ");

        // Asking user for number in decimal format.
        int enteredNumber = scan.nextInt();
        scan.nextLine(); // Clearing buffer.

        // Printing out entered number in binary format.
        System.out.println(GREEN + "Your number in binary format:" + RESET);
        Converter.convertBinary(enteredNumber);

        // Printing out entered number in octal format.
        System.out.println(GREEN + "Your number in octal format:" + RESET);
        Converter.convertOctal(enteredNumber);

        // Printing out entered number in hexagonal format.
        System.out.println(GREEN + "Your number in hexagonal format:" + RESET);
        Converter.convertHexagonal(enteredNumber);
    }

}