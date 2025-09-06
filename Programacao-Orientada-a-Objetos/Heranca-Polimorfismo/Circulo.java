class Circulo extends Forma2D {
    private double raio;

    public Circulo(double raio) {
        super("Círculo");
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser > 0.");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return 3.14 * raio * raio; // π * r²
    }

    @Override
    public double perimetro() {
        return 2 * 3.14 * raio; // 2 * π * r
    }

    @Override
    public void descricao() {
        System.out.println("Nome: " + obterNome());
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}