public class practice3 {
    public static void main(String arg[]){
        int x=10;
        int z=10;
        int y=20;

        //:::::::WHILE:::::::://


        while((x<y)&&(z<y)){


            System.out.print(x++);
            System.out.println(++z);
        }


        //::::::::DO---WHILE::::::::://


        do{
            System.out.println(z);
            ++z;
        }
        while(z<25);


        //::::::SWITCH CASE::::::://


        int h=2;
        switch(h){
            case 0:
                System.out.println("hello 0");
                break;
            case 1:
                System.out.println("hello 1");
                break;
            case 2:
                System.out.println("hello 2");
                break;
            case 3:
                System.out.println("hello 3");
                break;

            case 4:
                System.out.println("hello 4");
                break;
            default:
                System.out.println("hello Default");
               break;
        }
    }
}
