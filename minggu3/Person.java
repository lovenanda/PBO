/**
 * Person
 */
public class Person {

    //atribut

    private String name;

    //constructor

    public Person(String name){
    }

    //setter 
    
    public void setName(String name){
        this.name = name;
    }

    //getter

    public String getName(){
        return this.name;
    }

}

//main class
class DemoPerson{
    public static void main(String[] args) {
        Person p1 = new Person("nanda");
        System.out.println("nama awal : "+p1.getName());
        p1.setName("mandra");
        System.out.println("telah berganti menjadi : "+p1.getName());
    }
}