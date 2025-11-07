import java.util.UUID;

public class Customer {
    private final UUID id;
    private String name;
    private String email;

    // regras de validação
    public Customer(String nome, String email){
        if(name == null || name.isBlank())
            throw new IllegalArgumentException("Nome é obrigatório");
        if(email==null||!email.matches("^(\\w+(\\.\\w)?)+@[a-z]+\\.[a-z]+(\\.[a-z]+)?$"))
            throw new IllegalArgumentException("Email invalido");
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email.toLowerCase();
    }

    public UUID getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    //Evite Stters sem definição de inteção de domínio

    // Domínio com explícita  intenção, com regras de negócio
    public void rename(String newname){
        if(newname == null || newname.isBlank())
            throw new IllegalArgumentException("Nome é obrigatório");
        this.name = newname;
    }
    public void changeEmail(String newEmail){
        if(newEmail==null||!newEmail.matches("^(\\w+(\\.\\w)?)+@[a-z]+\\.[a-z]+(\\.[a-z]+)?$"))
            throw new IllegalArgumentException("Email invalido");
        this.email = newEmail;
    }
}