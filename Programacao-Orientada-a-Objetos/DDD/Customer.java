import java.util.UUID;

public class Customer {

    private final UUID id;
    private String name;
    private String email;


    public Customer(String name, String email) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Nome é Obrigatório");
        if (email == null || !email.matches("^(\\w+(\\.\\w)*)+@[a-z]+\\.[a-z]{2,3}$"))
            throw new IllegalArgumentException("Email é inválido");

        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void rename(String newName) {
        if (newName == null || newName.isBlank())
            throw new IllegalArgumentException("Nome é Obrigatório");
        this.name = newName;
    }

    public void Changeemail(String newEmail) {
        if (newEmail == null || !newEmail.matches("^(\\w+(\\.\\w)*)+@[a-z]+\\.[a-z]{2,3}$"))
            throw new IllegalArgumentException("Email é inválido");
        this.name = newEmail;
    }
}

