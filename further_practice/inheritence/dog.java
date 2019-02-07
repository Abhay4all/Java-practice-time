
//::::::::INHERITENCE::::::
//::::::::EXTENDS KEYWORD:::
// :::::::OVERRIDE METHOD:::
//::::::SUPER KEYWORD:::

package interface_onward.inheritence;

public class dog extends animal{
private int eyes ;
private int legs;
private int teeth;

    public dog(String name, String size, String brain, String weight, int eyes, int legs, int teeth) {
        super(name, size, "1", weight);//used to intialize
        this.eyes = eyes;                //constructor from
        this.legs = legs;             //from where dog extended
        this.teeth = teeth;           //init. const. of animal
    }
    public void chew(){
        System.out.println("Dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("Dog eat method");
        chew();//dog chew method called.....
        super.eat();//animal eat method.....
    }
    public void move(int speed){
        System.out.println("dog speed is::"+speed);
    }
}

