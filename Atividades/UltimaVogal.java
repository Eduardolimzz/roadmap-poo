import java.util.Scanner;

public class UltimaVogal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase ou palavra:");
        String texto = scanner.nextLine();

        String textoMinusculo = texto.toLowerCase();

        int indiceUltimaVogal = -1;

        for (int i = textoMinusculo.length() - 1; i >= 0; i--) {

            char caractere = textoMinusculo.charAt(i);

            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                
                indiceUltimaVogal = i;
                break; 
            }
        }

        if (indiceUltimaVogal != -1) {
            System.out.println("A última vogal está no índice: " + indiceUltimaVogal);
        } else {
            System.out.println("Vogal não encontrada!");
        }

        scanner.close();
    }
}