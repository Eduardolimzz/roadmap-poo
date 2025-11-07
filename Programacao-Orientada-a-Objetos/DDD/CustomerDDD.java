import java.util.UUID;

public class CustomerDDD {
    private final UUID id;
    private String name;
    private Email email;

    // regras de validação
    public CustomerDDD(String nome, Email email){
        if(nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome é obrigatório");

        this.id = UUID.randomUUID();
        this.name = nome;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email.getEmail();
    }

    //Evite Stters sem definição de inteção de domínio

    // Domínio com explícita  intenção, com regras de negócio
    public void rename(String newname){
        if(newname == null || newname.isBlank())
            throw new IllegalArgumentException("Nome é obrigatório");
        this.name = newname;
    }

    public void changeEmail(Email email){
        this.email = email;
    }
}