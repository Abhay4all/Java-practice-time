
//:::ENCAPSULATION:::
// :::::(1) We discuss about the problem
// here occur when
// we don't apply encapsulation


package interface_onward.encapsulation;

public class player {

    public int health;
    public String name;
    public String weapon;

    public void healthdamage(int damage){
        this.health=this.health-damage;
        if(this.health<0){
            System.out.println("player KNOCOUT");
        }
    }
    public int healthremain(){
        return this.health;
    }

}
