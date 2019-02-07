
//::::::  THREAD :::::::::://

package interface_onward;

public class practice2 {
    public static void main(String args[]){
        Thread t=new Thread();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                t.sleep(1000);
            }
        }
            catch(InterruptedException e){
                System.out.println("intrupted exception"+e);
            }
        }
    }


