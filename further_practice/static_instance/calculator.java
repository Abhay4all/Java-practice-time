
//::: STATIC AND INSTANCE method and variable::::
//::

package interface_onward.static_instance;

public class calculator {
    public static void printsum(int a,int b){
        System.out.println(a+b);
        System.out.println("static method");
    }
}
class main{
    public static void main(String arg[]){
        System.out.println("In main method");
        System.out.println("Calling static method from another class");
      calculator.printsum(20,30);//calling static method
        // by calling classname.methodname
        egstatic();//calling static method without use classname
        //only by calling methodname
    }
    static void egstatic(){
    System.out.println("main class own static method");
    }
}
