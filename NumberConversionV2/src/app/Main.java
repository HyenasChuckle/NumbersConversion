package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Welcome to numbers converter!\nEnter your number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println("Choose conversion type, enter:\nb - for binary\no - for octal\nh - for hexadecimal");
        char conversionType = scan.nextLine().charAt(0);

        Converter.convert(number, conversionType);

    }
}