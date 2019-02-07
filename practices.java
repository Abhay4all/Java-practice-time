public class practices {
    public static void main(String arg[])
    {

        //:::::::::BASICS:::::::://


        System.out.println("hello world");
        int x=10;
        int y=40;
        System.out.println("the value of x is "+x);
        System.out.println("the value of y is "+y);
        int z= x+y;
        System.out.println("the sum is "+z);
        String g="hello abhay pratap singh how are you";
        System.out.println(g);


        //::::::ARRAY:::::://

      int array[]=new int [5];
      for(int t=0;t<array.length;t++){
          array[t]=t;
      }
      for(int element:array){
          System.out.println(element);
      }

        //:::::::::BREAK/CONTINUE::::::://


        for(int m=1;m<10;m++){
            for(int n=0;n<m;n++){
                System.out.print("*");
                if(n==5)
                    continue;
            }
            System.out.println();
        }
    }
}
