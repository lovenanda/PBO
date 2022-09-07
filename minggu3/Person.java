/**
 * Person
 */
public class Person {

    private String name;

    Person(String name){
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

}

class DemoPerson{
    public static void main(String[] args) {
        Person p1 = new Person("nanda");
        System.out.println("nama awal : "+p1.getName());
        p1.setName("mandra");
        System.out.println("telah berganti menjadi : "+p1.getName());
    }
}