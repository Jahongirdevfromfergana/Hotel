class User {
    private String name, username, password;
    private boolean isAdmin;

    public User(String name, String username, String password, boolean isAdmin) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() { return username; }
    public boolean isAdmin() { return isAdmin; }
    public boolean checkPassword(String pass) { return this.password.equals(pass); }
    public String getName() { return name; }
}