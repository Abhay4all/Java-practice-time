
//:::with ENCAPSULATION ::::::
//:::


package interface_onward.encapsulation;

public class enhancedplayer {
    private String fullname;//::make private is encapsulation
    private int health=100;
    private String weapon;

    public enhancedplayer(String fullname, int health, String weapon){
        this.fullname = fullname;
        if(health>0 && health<=200)
        this.health=health;

        this.weapon=weapon;

    }
    public void health(int damage){
        this.health=this.health-damage;
         if(this.health<=0){
            System.out.println("player knockout");
        }
    }
    public int remaininghealth(){
        return health;
    }
}
