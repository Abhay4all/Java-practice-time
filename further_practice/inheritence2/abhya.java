
//:::inheritence


package interface_onward.inheritence2;

public class abhya {
    public abhya(){
        System.out.println("abhya");
    }
}
class aditya extends abhya{
    public aditya(){
        System.out.println("aditya");
        System.out.println("====================");
        }
}
class khush extends  abhya{
    public khush(){
        System.out.println("khush");
        System.out.println("=====================");
    }
}
class main{
    public static void main(String arg[]){
        khush k=new khush();
        aditya a=new aditya();
    }
        }
