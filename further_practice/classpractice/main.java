package interface_onward.classpractice;
import java.util.Scanner;
public class main {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter car model");
        String input=scan.nextLine();
        car baleno=new car();
        baleno.setmodel(input);
        System.out.println("your entered car model is::: "+baleno.getmodel());

    }
}
