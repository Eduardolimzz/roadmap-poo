public class Elevador{
    private int andarAtual;
    private int capacidadeMax;
    private int qtdPessoas;
    private int totalAndares;

    //Construtor padrão do Elevador, se colocar private não vai conseguir acessar o construtor sem os parametros
    public Elevador(int andares, int capacidadeMax){
        //acessa uma variavel referindo-se ao objeto atual da classe
        this.capacidadeMax = capacidadeMax;
        totalAndares = andares;
        andarAtual = 0;
        qtdPessoas = 0;
    }
    //não preciso colocar parametro para subir pois é uma regra de negocio
    public void subir(){
        if(andarAtual == totalAndares - 1){
            System.out.println("Ultimo andar alcançado");
            return;
        }
        andarAtual++;
    }
    public void descer(){
        if(andarAtual == 0){
            System.out.println("Você está no primeiro andar, não é possível descer");
            return;
        }
        andarAtual--;
    }
}

