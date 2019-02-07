public class practic2 {
    public static void main(String arg[])
    {
        int a=100;
        int b=100;
        int z=a+b;
        int x=a+b;
        System.out.println("addition "+(z));
        //int postincree=z++;
        //int preincree=++x;
        System.out.println("post"+(z++)+"pre"+(++x));
        System.out.println(z);
        System.out.println(x);
        Boolean j;
        j=(1>7)&&(1<3);
        System.out.println(j);
              if(a>b) {
                  System.out.println(+a +"is greater than " + b);
              }
             else if(a==b) {
                System.out.println( +b+"is equal to"+a);
            }
            else{
                System.out.println(+b+"is greater than "+a);
              }


              //::::STAR PATTERN::::://


        //(1)
              for(int k=1;k<5;k++){
                  for(int l=0;l<k;l++) {
                      System.out.print("*");
                      //System.out.print("k="+k+" l="+l);
                  }
                  System.out.print("\n");
              }
        //(2)
         System.out.println("2nd star pattern");
           for(int m=5;m>0;m--){
               for(int n=0;n<m;n++){
                   System.out.print("*");
               }
               System.out.println("");
           }
        }
    }

