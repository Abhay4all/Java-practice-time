
//inheritence example WITH
// :::THIS::::& :::SUPER::::keyword


package interface_onward.inheritence;

public class shape {
    private int x;
    private int y;
    public  shape(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
 class rectangle extends shape{
    private int width;
    private int height;

    public rectangle(){
        super(10,20);
    }

    public rectangle(int x, int y) {
        this(x,y,0,0);//calling 2nd
        // rect. constructor.....than it calls
        // super(x,y) and put height and width to 0....

    }

    public rectangle(int x, int y, int width, int height){
     super(x,y);//calling parent constructor
     this.height=height;
     this.width=width;
    }

     public int getWidth() {
         return width;
     }

     public int getHeight() {
         return height;
     }

 }
class test2{
    public static void main(String arg[]){
        rectangle rect=new rectangle(68,78,56,34);
        System.out.println("x::"+rect.getX());
        System.out.println("height::"+rect.getHeight());
        System.out.println("width::"+rect.getWidth());
        System.out.println("y::"+rect.getY());
    }
}
