
//:::STRING ARRRAY:::::::HASNEXT:::::

package interface_onward;
import java.util.Scanner;
public class practice6 {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int i=0;
        String s[] = new String[10];

        while(i<5){
            System.out.println("Enter the name ");
            boolean isint=scan.hasNextInt();
            if(isint) {//:::HASNEXTiNT CHECK WHETHER NEXT INPUT IS INTEGER OR NOT
                s[i] = scan.nextLine();
                i++;
            }
            else {
                System.out.println("So sorry");
                break;
            }

        }
        for(int x=0;x<i;x++){
            System.out.println("Enter Name is "+s[x]);
        }
    }
}
