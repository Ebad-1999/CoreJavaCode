package dad05ternarystringmanipulations;

public class ternary01 {


    public static void main(String[] args) {

      //Way 1:

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
        int i = 12;

//1.Way:
        if(i>0){
            System.out.println("The integer is positive");
        }else{
            System.out.println("The integer is not positive");
        }

//2.Way:ternary
        //Condition           ?  Will be selected for true condition     :    Will be selected for false condition
        String result = i>0   ?    "The integer is positive"             :        "The integer is not positive";
        System.out.println(result);


         //Type a program to print the minimum of 2 doubles on the console. use ternary...
        // 12, 23==>12        345, 23==>          -12, -3==>12
        double d = 345,e = 23;
        double min = d>e ? e : d;// ":" means "else"
        System.out.println(min);

        ////Type code to calculate the absolute value of a number
        //        For positive numbers and zero absolute value is the same with the number
        //        For negative numbers to find absolute value multiply the number by -1

        double f = 0;

        double abs = f>=0  ? f : -1*f;

        //Note: Instead of using ">=", you can use "<". this is better

        double betterAbs = f<0  ? -1*f  : f;

        System.out.println(abs);

        System.out.println(betterAbs);


        /*


         */

        int c = 10, a=12;
        Object res =  c>0 && a>0 ? a*c : "I do not know how to multiply";

        System.out.println(res);
        //Note: when there is different data types we can use "Object" data type. it is Father of data types also it is
        // non-primitive data type.






    }
}
