package SSGException;

public class E01 {

    public static void main(String[] args) {

         int a = 12;
         int b = 0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.err.println("You cannot divided a number by zero"+e.getMessage());


        }

    }
}
