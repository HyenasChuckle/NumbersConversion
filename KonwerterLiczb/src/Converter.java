import java.util.ArrayList;
import java.util.Collections;

class Converter {

    // Decimal do binary conversion method.
    static void convertBinary(int number) {
        boolean keepDividing = true;
        ArrayList<Integer> binaryNumber = new ArrayList<>();

        /* Dividing number by 2. Adding '1' to binaryNumber array list if division
        comes with the rest or '0' if not. */
        if (number == 0) {
            binaryNumber.add(0);
        } else {
            while (keepDividing) {
                if (number > 0) {
                    if (number % 2 == 0) {
                        binaryNumber.add(0);
                        number /= 2;
                    } else {
                        binaryNumber.add(1);
                        number = (number - 1) / 2;
                    }
                } else {
                    keepDividing = false;
                }
            }
        }

        // Adding '0' to the binaryNumber as long as size value is not dividable by 4.
        if (binaryNumber.size() % 4 != 0) {
            int n = binaryNumber.size() % 4;
            for (int i = 4 - n; i > 0; i--) {
                binaryNumber.add(0);
            }
        }

        // Reversing order of binaryNumber list.
        Collections.reverse(binaryNumber);

        // Final results.
        for (int i = 0; i < binaryNumber.size(); i++) {
            if (i == 3 || i == 7 || i == 11 || i == 15) {
                System.out.print(binaryNumber.get(i) + " ");
            } else {
                System.out.print(binaryNumber.get(i));
            }
        }

    }

}