public class User {
    private String username;
    private String password;

    //construktor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    
}

class DemoUser{
    public static void main(String[] args) {
        User u1 = new User("nanda","kopiluakrasaayam");
    }
}
