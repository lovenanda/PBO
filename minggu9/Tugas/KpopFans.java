public class KpopFans extends Fans {

    public KpopFans(){
        super(); 
    }

    public KpopFans(String name){
        super(name);
    }

    public void watchingPerformance(Musican musican, String expression) {
        super.showName();
        System.out.print(": "+expression+" melihat idolanya ");
        musican.perform();

    }
    
}
