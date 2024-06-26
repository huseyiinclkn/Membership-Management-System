package entities.concretes;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public User(){}

    public User(int id, String firstName, String password, String email, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.password = password;
        this.email = email;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
