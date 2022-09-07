public class User {
    private String username;
    private String password;

    //construktor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

    //getter untuk mengambil username dan password

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    
    
}

class DemoUser{
    public static void main(String[] args) {
        User u1 = new User("nanda","kopiluakrasaayam");
        System.out.println("username : "+u1.getUsername());
        System.out.println("password : "+u1.getPassword());


    }
}
