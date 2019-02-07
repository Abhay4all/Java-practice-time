
//::::::::METHOD & METHOD-OVERLOADING:::::://

public class practice4 {
    int a=4;
    int b=5;
    void sum(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    int sum(int x,int y, int g){
        return (x+y+g);
    }

}
class first{
    public static void main(String arg[]){
        practice4 pra=new practice4();
        System.out.println(pra.a+"&"+pra.b+"&"+pra.hashCode());
        int x=++pra.a;//pre-increment(first increment than put value)
        int y=++pra.b;//post-increment(first put value than increment)
        pra.sum(x,y);
        pra.sum(002,300);
        System.out.println(+pra.sum(20,30,40));

    }
}
