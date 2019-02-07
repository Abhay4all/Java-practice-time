package interface_onward.encapsulation;

public class main {
    public static void main(String arg[]){

        player pla=new player();
        pla.name="abhay";
        pla.health=40;
        pla.healthdamage(100);
        pla.healthremain();
        System.out.println(pla.healthremain());
        pla.health=400;//we can access public integer
        // that means we have control over the
        // player class which is against the oops(encaps.)
        // rule hence we have to apply
        // encapsulation
        System.out.println(pla.healthremain());
    }
}
