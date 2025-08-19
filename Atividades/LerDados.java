import java.util.Scanner;

public class LerDados { 

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 

        String linha = sc.nextLine();

        String[] partes = linha.split("\t"); 

        int inteiro = Integer.parseInt(partes[0]); 
        double flutuante = Double.parseDouble(partes[1]);
        String nome = partes[2]; 

        System.out.println("Você digitou o inteiro: " + inteiro);
        System.out.println("Você digitou o ponto flutuante: " + flutuante);
        System.out.println("Você digitou o nome composto: " + nome);

        sc.close();
    }
}