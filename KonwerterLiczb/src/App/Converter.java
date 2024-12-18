package App;

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
            } else {
                binaryNumber.add(1);
            }
            number /= 2;
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
        StringBuilder result = new StringBuilder();
        // Number in decimal format is the same as in octal if in range <0, 7>.
        if  (number >= 0 && number <= 7) {
            octalNumber.add(number);
            // Expanding list with rest of division by 8.
        } else {
            while (number > 0) {
                int rest = number % 8;
                octalNumber.add(rest);
                number /= 8;
            }
        }
        // Converting octalNumber to String and reversing order by using 'insert'.
        for (Integer n : octalNumber) {
            result.insert(0, n);
        }
        // Making space every 3 numbers.
        for (int i = result.length() - 3; i > 0; i -= 3) {
            result.insert(i, ' ');
        }
        System.out.println(result);
    }

    // Decimal to Hexagonal conversion method.
    public static void convertHexadecimal(int number) {
        ArrayList<Object> hexadecimalNumber = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        // If entered decimal is 0, hexagonal is also 0.
        if (number == 0) {
            hexadecimalNumber.add(0);
        }
        /*  Expanding list with rest of division by 16.
             Or Letter from 'A' to 'F' for number <10, 15>. */
        while (number > 0) {
            int rest = number % 16;
            if (rest <= 9) {
                hexadecimalNumber.add(rest);
            } else {
                switch (rest) {
                    case 10:
                        hexadecimalNumber.add("A");
                        break;
                    case 11:
                        hexadecimalNumber.add("B");
                        break;
                    case 12:
                        hexadecimalNumber.add("C");
                        break;
                    case 13:
                        hexadecimalNumber.add("D");
                        break;
                    case 14:
                        hexadecimalNumber.add("E");
                        break;
                    case 15:
                        hexadecimalNumber.add("F");
                        break;
                }
            }
            number /= 16;
        }
        // Converting hexadecimalNumber to String and reversing order by using 'insert'.
        for (int i = 0; i < hexadecimalNumber.size(); i++){
            result.insert(0,hexadecimalNumber.get(i));
        }
        System.out.println(result);
    }

}