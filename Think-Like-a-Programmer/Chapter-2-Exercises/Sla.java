/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.

 *******************************************************************************/
import java.util.Scanner;

public class Sla
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número de três ou quatro dígitos:");
        char digitChar = sc.next().charAt(0);

        int threeDigitNumber = (digitChar - '0') * 100;
        int fourDigitNumber = (digitChar - '0') * 1000;

        digitChar = sc.next().charAt(0);

        threeDigitNumber += (digitChar - '0') * 10;
        fourDigitNumber += (digitChar - '0') * 100;

        digitChar = sc.next().charAt(0);

        threeDigitNumber += (digitChar - '0');
        fourDigitNumber += (digitChar - '0') * 10;

        digitChar = sc.next().charAt(0);

        if (digitChar == 10) {
            System.out.println("Numero digitado: " + threeDigitNumber + "\n");
        } else {
            fourDigitNumber += (digitChar - '0');
            System.out.println("Numero digitado: " + fourDigitNumber + "\n");
        }

    }
}