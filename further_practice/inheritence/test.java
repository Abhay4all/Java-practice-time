package interface_onward.inheritence;

public class test {
    public static void main(String arg[]){
        animal ani =new animal("prokaryotic","23","0","1 gram");
        System.out.println(ani.getName()+" "+ani.getBrain()+" "+ani.getSize()+" "+ani.getWeight());
        dog dog1=new dog("alsation","55","","20kg",2,4,36);
        dog1.eat();
        System.out.println(dog1.getBrain());
        dog1.move(5);
    }
}
