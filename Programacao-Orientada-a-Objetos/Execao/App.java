import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class App {
    public static int dividir(int x, int y) {
        try {
            int res = x/y;
            return res;
        } catch (ArithmeticException e) {
            System.out.println("App:Dividir:ArithmeticException");
            return 0;
        }
    }

    public static void main(String[] args) {
        try {
            int div = App.dividir(100, 0);
            System.out.println("100 / 0 = " + div);
            Files.readString(Path.of("dados.txt"));
        } catch (NoSuchFileException e) {
            System.out.println("Tratamento de Exceção NoSuchFileException");
        } catch (ArithmeticException e) {
            System.out.println("Tratamento de ArithmeticException");
            System.out.println("Mensagem: " + e.getLocalizedMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Tratamento de NoSuchFileException");
        }finally{
            System.out.println("Bloco finally");
        }
    }
//        Files.readString(Path.of("dados.txt"));

}

