import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ou palavra:");
        String str = scanner.nextLine();

         char[] charArray = str.toCharArray();

        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];

            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
    }
     String stringInvertida = String.valueOf(charArray);

        System.out.println("A string invertida é: " + stringInvertida);

        scanner.close();
}
}