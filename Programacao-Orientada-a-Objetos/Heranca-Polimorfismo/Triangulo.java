class Triangulo extends Forma2D {
    private double lado1; //atributo
    private double lado2; //atributo
    private double lado3; //atributo

    public Triangulo(double lado1, double lado2, double lado3) {
        //               PARÂMETRO    PARÂMETRO    PARÂMETRO
        super(TipoTriangulo(lado1, lado2, lado3));
        //     passa os parâmetros para o metodo Tipo Triangulo

        if (!FormarTriangulo(lado1, lado2, lado3)) {
            throw new IllegalArgumentException("Os três lados informados não formam um triângulo. Para formar um triângulo, a cada dois lados somados, deverá ser maior que o terceiro.");
        }

        this.lado1 = lado1; //  atributo =  parâmetro
        this.lado2 = lado2; //  atributo =  parâmetro
        this.lado3 = lado3; //  atributo =  parâmetro
    }

    private static boolean FormarTriangulo(double a, double b, double c) {
        //                                PARÂMETRO PARÂMETRO PARÂMETRO
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private static String TipoTriangulo(double a, double b, double c) {
        //Os valores passam para o metodo
        if (a == b && b == c) {
            return "Triângulo Equilátero"; // Todos os lados iguais
        } else if (a == b || a == c || b == c) {
            return "Triângulo Isósceles"; // Dois lados iguais
        } else {
            return "Triângulo Escaleno"; // Todos os lados diferentes
        }
    }

    // Getters
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double area() {
        double s = perimetro() / 2.0; // semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void descricao() {
        System.out.println("Nome: " + obterNome());
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
