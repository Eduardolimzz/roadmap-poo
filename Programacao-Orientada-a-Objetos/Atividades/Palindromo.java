import java.text.Normalizer;
import java.util.Scanner;

public class Palindromo {
    public static String limparString(String str) {

        str = str.toLowerCase();

        str = str.replaceAll("[^a-zA-Z0-9]", "");
        
        str = removerAcentos(str);
        
        return str;
    }
    public static String removerAcentos(String input) {
        if (input == null) return null;
        return Normalizer.normalize(input, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    public static String inverterString(String str) {
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
        
        return String.valueOf(charArray);
    }

    public static boolean ehPalindromo(String str) {
        String stringLimpa = limparString(str);
        
        String stringInvertida = inverterString(stringLimpa);
        
        for (int i = 0; i < stringLimpa.length(); i++) {
            if (stringLimpa.charAt(i) != stringInvertida.charAt(i)) {
                return false; 
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {

        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("console.encoding", "UTF-8");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma frase para verificar se é palíndromo:");
        String entrada = scanner.nextLine();
        
        String etapa1 = entrada.toLowerCase();
        System.out.println("minúsculas: " + etapa1);
        
        String etapa2 = etapa1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("sem especiais: " + etapa2);
        
        String etapa3 = removerAcentos(etapa2);
        System.out.println("sem acentos: " + etapa3);
        
        boolean resultado = ehPalindromo(entrada);
        
        String stringLimpa = limparString(entrada);
        String stringInvertida = inverterString(stringLimpa);
        System.out.println("String limpa: " + stringLimpa);
        System.out.println("String invertida: " + stringInvertida);
        System.out.println("São iguais? " + stringLimpa.equals(stringInvertida));

        if (resultado) {
            System.out.println("A string \"" + entrada + "\" É um palíndromo!");
        } else {
            System.out.println("A string \"" + entrada + "\" Não é um palíndromo.");
        }
        
        scanner.close();
    }
}