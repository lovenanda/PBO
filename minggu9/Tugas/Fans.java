
public class Fans {
    private String name;
    
    public Fans(){
        this.name = "noname";
    }

    public Fans(String name){
        this.name = name;
    }

    public void showName(){
        System.out.print(this.name);
    }

    public void watchingPerformance(){
        System.out.println(this.name+": melihat idolanya dari youtube");
        
    }
     
    public void watchingPerformance(Musican musican){{
        System.out.print(this.name+": melihat idolanya ");
        musican.perform();
    }
        
    }
}
