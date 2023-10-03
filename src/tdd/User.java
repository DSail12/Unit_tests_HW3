package hw3.tdd;

public class User {
    private String name;
    private String password;
    private boolean isAuthenticate = true;
    private boolean isAdmin;
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }
    public boolean authenticate(String inputUsername, String inputPassword) {
        return name.equals(inputUsername) && password.equals(inputPassword);
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public boolean isAuthenticate() {
        return isAuthenticate;
    }
    public void setAuthenticate(boolean isAuthenticated) {
        this.isAuthenticate = isAuthenticated;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}