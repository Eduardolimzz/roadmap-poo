import java.util.Scanner;

public class Slas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número com quantos dígitos você quiser:");
        char digitChar = sc.next().charAt(0);

        int number = (digitChar - '0');
        digitChar = sc.next().charAt(0);

        while(digitChar != '0') {
            number = number * 10 + (digitChar - '0');
            digitChar = sc.next().charAt(0);
        }
        System.out.println("Numero digitado:" + number + "\n");

    }
}