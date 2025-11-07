import java.util.Objects;

public class Email {

    private final String value;

    public Email(String value) {
        if (value == null || value.matches("^(\\w+(\\.\\w)*)+@[a-z]+\\.[a-z]{2,3}$"))
            throw new IllegalArgumentException("Email é invalido");
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Email)) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
