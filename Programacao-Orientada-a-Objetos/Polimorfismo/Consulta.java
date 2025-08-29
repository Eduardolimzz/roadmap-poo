public class Consulta {
    public static void main(String[] args) {

        System.out.println("--- Cenário: Criando e usando um objeto Medico ---");

        Pessoa p1 = new Medico("Ana", 25, "12345-DF", "Cardiologia");

        System.out.print(" Chamada para p1.comprimentar(): ");
        p1.cumprimentar();

        System.out.print(" Chamada para ((Pessoa)p1).cumprimentar(): ");
        ((Pessoa)p1).cumprimentar();

        System.out.println("\nTentando chamar p1.atender() resultaria em erro de compilação.");

        System.out.print(" Chamada para ((Medico)p1).atender(): ");
        ((Medico)p1).atender();
    }
}