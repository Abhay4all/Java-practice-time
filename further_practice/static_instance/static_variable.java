
//:::static variable is shareable
// among instance variable of class:::

package interface_onward.static_instance;

public class static_variable {
    private static String name;

    public static_variable(String name) {
        this.name = name;
    }
    void print(){
        System.out.println("name is"+name);
    }
}
class main2{
public static void main(String arg[]){
   static_variable st=new static_variable(" abhay");
   static_variable st1=new static_variable(" aditya");
   st1.print();
   st.print();//Both show aditya as
    // result because static
    // variable shareable among instance variable+-
}
}
