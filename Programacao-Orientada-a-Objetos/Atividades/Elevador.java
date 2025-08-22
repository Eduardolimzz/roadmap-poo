public class Elevador{
    private int andarAtual;
    private int capacidadeMaxima;
    private int quantidadePessoas;
    private int totalAndares;

    //Construtor do Elevador - capacidade máxima de 10 pessoas e começa no térreo
    public Elevador(int totalAndares){
        this.totalAndares = totalAndares;
        this.capacidadeMaxima = 10;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public void entrar(){
        if(quantidadePessoas < capacidadeMaxima){
            quantidadePessoas++;
            System.out.println("Pessoa entrou. Pessoas no elevador: " + quantidadePessoas);
        } else {
            System.out.println("Elevador lotado! Capacidade máxima atingida.");
        }
    }

    public void sair(){
        if(quantidadePessoas > 0){
            quantidadePessoas--;
            System.out.println("Pessoa saiu. Pessoas no elevador: " + quantidadePessoas);
        } else {
            System.out.println("Não há ninguém no elevador.");
        }
    }

    public void subir(){
        if(andarAtual < totalAndares - 1){
            andarAtual++;
            System.out.println("Subiu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void descer(){
        if(andarAtual > 0){
            andarAtual--;
            System.out.println("Desceu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no térreo! Não pode descer mais.");
        }
    }
}