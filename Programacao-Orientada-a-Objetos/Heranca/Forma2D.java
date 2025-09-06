
public class Forma2D {
    private String nome;

    public Forma2D(String nome) {
        if (nome == null || "".equals(nome)) {
            throw new IllegalArgumentException("Nome não deve ser vazio.");
        }
        this.nome = nome;
    }

    public String obterNome() {
        return nome;
    }

    public void descricao() {
        System.out.println("Nome: " + nome);
        System.out.println("Área: " + area());
        System.out.println("Perimetro: " + perimetro());
    }

    public double area() {
        return 0.0;
    }


    public double perimetro() {
        return 0.0;
    }
}




