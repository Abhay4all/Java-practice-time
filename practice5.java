
//::::::: CONSTRUCTOR:::::://

public class practice5 {
    double x=90, y, z;

     practice5() {

         y = 50;
         z = 60;
        System.out.println("In constructor");
    }
    double volume() {
        return (x*y*z);
    }
}

     class test {
        public static void main(String arg[]){
         practice5 prat=new practice5();
         double volume=prat.volume();
         System.out.println(volume);
        }
    }





