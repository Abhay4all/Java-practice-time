package interface_onward.encapsulation;

public class main2 {
    public static void main(String arg[]){
        enhancedplayer epla=new enhancedplayer("abhay",220,"fire");
         //above we give health=220 but intial health is given in result is 100
        //due to encapsulation
        System.out.println("Initial health "+epla.remaininghealth());
        epla.health(30);
        System.out.println("Remaining health"+epla.remaininghealth());
    }
}
