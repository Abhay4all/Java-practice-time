
//::::::::INHERITENCE ::EXTENDS___KEYWORD::::://

public class PRACTICE6 {

    PRACTICE6(){
        System.out.println("practice5 constructor");
    }
    int a, b;
    void get(int x,int y){
         a=x;
         b=y;
    }
    int f=24;
}
class second extends PRACTICE6{

    int f=25;
    second() {
        System.out.println("second constructor");
        System.out.println(super.f+"is of super class"+f +"is of subclass");
    }
    int total;

    int sum(){
        return(a+b);
    }
}
    class test1{
        public static void main(String args[]){
            second se=new second();
            se.get(10,20);
            int x=se.sum();
            System.out.println(x);

        }
    }

