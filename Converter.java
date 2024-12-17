import java.util.ArrayList;
import java.util.Collections;

public class Converter {

    // Decimal to binary conversion method.
    public static void convertBinary(int number) {
        ArrayList<Integer> binaryNumber = new ArrayList<>();
        /* Dividing number by 2. Adding '1' to binaryNumber array list if division
        comes with the rest or '0' if not. */
        if (number == 0) {
            binaryNumber.add(0);
        }
        while (number > 0) {
            if (number % 2 == 0) {
                binaryNumber.add(0);
                number /= 2;
            } else {
                binaryNumber.add(1);
                number = (number - 1) / 2;
            }
        }
        // Adding '0' to the binaryNumber as long as size value is not dividable by 4.
        if (binaryNumber.size() % 4 != 0) {
            int n = binaryNumber.size() % 4;
            for (int i = 4 - n; i > 0; i--) {
                binaryNumber.add(0);
            }
        }
        // Reversing list order to reflect proper result.
        Collections.reverse(binaryNumber);
        // Converting list to a String.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < binaryNumber.size(); i++) {
            result.append(binaryNumber.get(i));
            // Adding space after every next 4 numbers (Excluding last 4 numbers).
            if ((i + 1) % 4 == 0 && i != binaryNumber.size() - 1) {
                result.append(" ");
            }
        }
        System.out.println(result);
    }

    // Decimal to Octal conversion method.
    public static void convertOctal(int number) {
        ArrayList<Integer> octalNumber = new ArrayList<>();
        // Number in decimal format is the same as in octal if in range <0, 7>.
        if  (number >= 0 && number <= 7) {
            octalNumber.add(number);
            // Expanding list with rest of division by 8.
        } else {
            while (number > 0) {
                if (number % 8 == 0) {
                    octalNumber.add(0);
                } else {
                    octalNumber.add(number % 8);
                }
                number /= 8;
            }
        }
        // Reversing list order to reflect proper result.
        Collections.reverse(octalNumber);
        // Converting list to a string.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < octalNumber.size(); i++) {
            result.append(octalNumber.get(i));
            // Adding space after every next 3 numbers (Excluding last 3 numbers).
        }
        System.out.println(result);
    }

    // Decimal to Hexagonal conversion method.
    public static void convertHexagonal(int number) {
        ArrayList<Object> hexagonalNumber = new ArrayList<>();
        // If entered decimal is 0, hexagonal is also 0.
        if (number == 0) {
            hexagonalNumber.add(0);
        }
        /*  Expanding list with rest of division by 16.
             Or Letter from 'A' to 'F' for number <10, 15>. */
        while (number > 0) {
            if (number % 16 <= 9) {
                hexagonalNumber.add(number % 16);
            } else {
                int rest = number % 16;
                switch (rest) {
                    case 10:
                        hexagonalNumber.add("A");
                        break;
                    case 11:
                        hexagonalNumber.add("B");
                        break;
                    case 12:
                        hexagonalNumber.add("C");
                        break;
                    case 13:
                        hexagonalNumber.add("D");
                        break;
                    case 14:
                        hexagonalNumber.add("E");
                        break;
                    case 15:
                        hexagonalNumber.add("F");
                        break;
                }
            }
            number /= 16;
        }
        // Reversing list order to reflect proper result.
        Collections.reverse(hexagonalNumber);
        // Converting list to a string.
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hexagonalNumber.size(); i++){
            result.append(hexagonalNumber.get(i));
        }
        System.out.println(result);
    }

}