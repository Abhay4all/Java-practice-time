
//::::::::::DIGIT SUM CHECKER::::::::::::::://
//::::::::::iNTEGER.PARSEINT():::::::::::::// TO CONVERT STRING INTO INTEGER

package interface_onward;
import java.util.Scanner;

public class practice5 {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Intger");
        String st= sc.nextLine();
        int as=Integer.parseInt(st);
        int result = digitsum(as);
        System.out.println(result);
    }

    public static int digitsum(int number) {

        int sum;
        if (number < 10) {
            return -1;
        } else {
            sum = 0;
            int quot = 0;
            while (number != 0) {
                sum += number % 10;
                quot = number / 10;
                number = quot;
            }
            return (sum);
        }


    }
}