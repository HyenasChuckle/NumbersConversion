package app;

public class Converter {

    public static void convert(int number, char conversionType) {
        StringBuilder convertedNumber = new StringBuilder();
        // Converting to binary.
        if (conversionType == 'b') {
            while (number > 0) {
                int rest = number % 2;
                convertedNumber.insert(0, rest);
                number /= 2;
            }
            for (int i = convertedNumber.length() - 4; i > 0; i-=4) {
                convertedNumber.insert(i, " ");
            }
            System.out.println(convertedNumber);
        // Converting to octal.
        } else if (conversionType == 'o') {
                if (number >= 0 && number <= 7) {
                    convertedNumber.insert(0, number);
                } else {
                    while (number > 0) {
                        int rest = number % 8;
                        convertedNumber.insert(0, rest);
                        number /= 8;
                    }
                }
            for (int i = convertedNumber.length() - 3; i > 0; i-=3) {
                convertedNumber.insert(i, " ");
            }
            System.out.println(convertedNumber);
        // Converting do hexadecimal.
        } else if (conversionType == 'h') {
            if (number >= 0 && number <= 9) {
                convertedNumber.insert(0, number);
            } else {
                while (number > 0) {
                    int rest = number % 16;
                    if (rest <= 9) {
                        convertedNumber.insert(0, rest);
                    } else {
                        switch (rest) {
                            case 10:
                                convertedNumber.insert(0, 'A');
                                break;
                            case 11:
                                convertedNumber.insert(0, 'B');
                                break;
                            case 12:
                                convertedNumber.insert(0, 'C');
                                break;
                            case 13:
                                convertedNumber.insert(0, 'D');
                                break;
                            case 14:
                                convertedNumber.insert(0, 'E');
                                break;
                            case 15:
                                convertedNumber.insert(0, 'F');
                                break;
                        }
                    }
                    number /= 16;
                }
            }
            System.out.println(convertedNumber);
        } else {
            System.out.print("You should have entered wrong character...");
        }

    }

}