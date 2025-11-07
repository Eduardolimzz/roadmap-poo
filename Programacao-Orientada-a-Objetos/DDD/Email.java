import java.util.Objects;

public class Email {

    private final String value;

    public Email(String value){
        if(value==null||!value.matches("^(\\w+(\\.\\w)?)+@[a-z]+\\.[a-z]+(\\.[a-z]+)?$"))
            throw new IllegalArgumentException("Email invalido");
        this.value = value.toLowerCase();
    }

    public String getEmail (){
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}