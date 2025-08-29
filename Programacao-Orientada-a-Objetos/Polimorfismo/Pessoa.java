public abstract class Pessoa {

    private String nome;
    private int idade;


    //Construtor da classe pessoa
    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    //metodo abstrato que deve ser implementado pelas subclasses
    public abstract void cumprimentar();

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}
