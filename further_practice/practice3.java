
    //:::::::::::::CASTING:::::::::::::://

package interface_onward;

public class practice3 {
public static void main(String arg[]){

    byte x=36;
    byte newbyte=(byte)(x/2);//BY DEFAULT JAVA
    // CONVERT NUMBER INTO INTEGER
    // HENCE WE USE TYPE CASTING INT (BYTE) TO CONVERT
    // INTO INTEGER TO BYTE
    System.out.println(newbyte);

    long l=500L+(x/2);//because long
    // accept the integer value
    // hence we dont need to change x/2 into integer
    System.out.println(l);

    float f=(float)5.6;
    float f1=5.678f/2;
    //Simillar to above case in decimal point java
    // by default
    // convert decimal point to double hence we
    // have to cast double to float by
    // writing (float)5.67 or 5.678f
    double d=5.6879/2;
    double d1=5d/2;//here we put 5d because
    //  without d it automatically
    // type cast to int hence
    // result show 2.0
    System.out.println(f1);
    System.out.println(d1);



}
}
