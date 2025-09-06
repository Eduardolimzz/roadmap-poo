public class AppFormas {
    public static void main(String[] args) {
        Forma2D[] formas = {
                new Forma2D("Uma forma"),
                new Circulo(3),
                new Triangulo(3, 3, 3), // equilátero
                new Triangulo(3, 3, 2), // isósceles
                new Triangulo(3, 4, 5), // escaleno
                new Retangulo(4, 5),
                new Retangulo(4, 4), // quadrado
                new Quadrado(4)
        };


        for (Forma2D forma : formas) {
            forma.descricao();
        }
    }
}