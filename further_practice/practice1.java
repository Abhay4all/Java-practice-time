
//::::INTERFACE:::ONWARD::::::://
//:::::ACCESS SPECIFIER:::::::::


package interface_onward;

public interface practice1 {
    void area(int x);
    double pi=  3.14;
}
 class type1 implements practice1{
    public void area(int x){
     System.out.println(pi*x*x+" is the area of circle");
    }
}
class type2 implements practice1{
    public void area(int x){
        System.out.println(4*pi*x*x+" is the area of sphere");
    }

}
class test{
    public static void main(String args[]){
        type1 circle = new type1();
        type2 sphere = new type2();
        circle.area(20);
        sphere.area(20);

        try {
            int j[] = new int[5];
            int x = 10 / 0;
            System.out.println(x);
            for(int r=0;r<10;r++){
                j[r]=r;
            }
        }
        catch(Exception e){
            System.out.println("My exception"+e);
        }

    }
}
