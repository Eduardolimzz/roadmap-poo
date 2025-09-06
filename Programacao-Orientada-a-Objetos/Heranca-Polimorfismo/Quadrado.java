class Quadrado extends Retangulo{

    public Quadrado(double lado){
        super(lado, lado);

        if (lado <= 0) {
            throw new IllegalArgumentException("Lado do quadrado deve ser > 0.");
        }
    }
    // Getter para o lado (já que herda de Retangulo, pode usar getBase() ou getAltura())
    public double getLado() {
        return getBase(); // Como base == altura no quadrado, tanto faz
    }
    @Override
    public void descricao() {
        System.out.println("Nome: " + obterNome());
        System.out.println("Lado: " + getLado());
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }

}
