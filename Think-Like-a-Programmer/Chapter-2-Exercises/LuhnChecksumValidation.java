import java.util.Scanner;

public class LuhnChecksumValidation {

    public static int doubleDigitValue(int digit) {
        int doubledDigit = digit * 2;
        int sum;

        if (doubledDigit >= 10) {
            sum = 1 + doubledDigit % 10;
        } else {
            sum = doubledDigit;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char digit;
        int oddLengthChecksum = 0;
        int evenLengthChecksum = 0;
        int position = 1;

        System.out.print("Enter a number: ");
        digit = input.next().charAt(0);

        while (digit != '0') {
            if (position % 2 == 0) {
                oddLengthChecksum += doubleDigitValue(digit - '0');
                evenLengthChecksum += digit - '0';
            } else {
                oddLengthChecksum += digit - '0';
                evenLengthChecksum += doubleDigitValue(digit - '0');
            }

            digit = input.next().charAt(0);
            position++;
        }

        int checksum;
        if ((position - 1) % 2 == 0) {
            checksum = evenLengthChecksum;
        } else {
            checksum = oddLengthChecksum;
        }

        System.out.println("Checksum is " + checksum + ". \n");

        if (checksum % 10 == 0) {
            System.out.println("Checksum is divisible by 10. Valid. \n");
        } else {
            System.out.println("Checksum is not divisible by 10. Invalid. \n");
        }

        input.close();
    }
}