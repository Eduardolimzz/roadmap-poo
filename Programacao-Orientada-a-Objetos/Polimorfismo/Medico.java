public class Medico extends Pessoa{

    private String crm;
    private String especialidade;

    Medico(String nome, int idade,
           String crm, String especialidade){
        super(nome, idade);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public void atender() {
        System.out.println(getNome() + "esta atendendo paciente com a especialidade " + this.especialidade + "...");
    }
    @Override
    public void cumprimentar() {
        System.out.println(" Olá! O doutor " + getNome() + " da especialidade " + this.especialidade + "Esta cumprimentando voce ");
    }
}
