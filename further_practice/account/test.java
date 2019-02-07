package interface_onward.account;
import java.util.Scanner;
public class test {
    public static void main(String arg[]){
        account acc=new account();//("abhay","1234567","abhayrock123@gmail.com");
        Scanner scan=new Scanner(System.in);
        System.out.println(acc.getCustomername()+"\n"+acc.getCustomeremailaddress()+"\n"+acc.getCustomerphonenumber());
        System.out.println("Enter balance to be deposit");
        double inputbal=scan.nextDouble();
        acc.setBalance(inputbal);
        System.out.println("Balance is ::: "+acc.getBalance());
        System.out.println("Enter the Withdraw amount ");
        double inputwith=scan.nextDouble();
        acc.withdraw(inputwith);


    }
}
