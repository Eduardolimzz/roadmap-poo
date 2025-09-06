class Retangulo extends Forma2D {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super(base == altura ? "Quadrado" : "Retângulo");
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser > 0");
        }
        this.base = base;
        this.altura = altura;
    }

    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double area() {
        return base + altura; // π * r²
    }

    @Override
    public double perimetro() {
        return 2*(base + altura); // π * r²
    }

    @Override
    public void descricao() {
        System.out.println("Nome: " + obterNome());
        System.out.println("Raio: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }

}