import java.util.Scanner;

public class ClassRosterValidation {

    // 1. Função que apenas valida (Retorna true ou false)
    public static boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 100;
    }

    // 2. Função que converte a nota em letra
    public static String letterGrade(int grade) {
        // Validação inicial
        if (!isValidGrade(grade)) {
            return "ERROR";
        }

        final String[] GRADE_LETTER = {"F", "D", "D+", "C-", "C", "C+", "B-", "B", "B+", "A-", "A"};
        final int[] LOWEST_GRADE_SCORE = {0, 60, 67, 70, 73, 77, 80, 83, 87, 90, 93};

        int category = 0;
        // Percorre as categorias enquanto a nota for maior ou igual ao limite
        while (category < GRADE_LETTER.length && grade >= LOWEST_GRADE_SCORE[category]) {
            category++;
        }

        // Retorna a categoria encontrada (ajustando o índice)
        return GRADE_LETTER[category - 1];
    }

    // 3. O único método main (Ponto de entrada do programa)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0-100): ");

        // Verifica se o que o usuário digitou é um número
        if (input.hasNextInt()) {
            int grade = input.nextInt();

            String letra = letterGrade(grade);

            System.out.println("Nota digitada: " + grade);
            System.out.println("Conceito final: " + letra);
        } else {
            System.out.println("Erro: Por favor, digite um número inteiro.");
        }

        input.close();
    }
}