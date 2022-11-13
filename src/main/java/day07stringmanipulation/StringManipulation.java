package day07stringmanipulation;

public class StringManipulation {
    public static void main(String[] args) {


        String str = "Java is easy";

        boolean isExist = str.contains("a");
        System.out.println(isExist);//true

        boolean ifExist = str.contains("Java");//true
        System.out.println(ifExist);

        boolean itExist = str.contains("java");//false
        System.out.println(itExist);


        boolean result  = str.startsWith("J");
        System.out.println(result);//true

        boolean theResult  = str.startsWith("x");
        System.out.println(theResult);//fales


       //if you uase startWith method with 2 parameter means skip the first characters
        //boolean res = str.startsWith("i",5);
       // System.out.println(res);//true


    /*
    Example 1: Check if the given password
                i) has "A" in any position
                ii) has "xy" at yhe beginning
                iii) has "W" as 7th character
                iv) has 8 characters in total

     */


       String pwd = "xy1AmSW?";

         //i) has "A" in any position
        boolean firstRule = pwd.contains("A");

        //ii) has "xy" at yhe beginning
        boolean secondRule = pwd.startsWith("xy");

        //iii) has "W" as 7th character
        boolean thirdRule = pwd.startsWith("W", 6);

        //iv) has 8 characters in total
        boolean fourthRule = pwd.length()==8;

        System.out.println("Is the password vaild? " + (firstRule && secondRule && thirdRule && fourthRule));



        String s = "Do practice to be better";

        boolean rslt = s.endsWith("e");
        System.out.println(rslt);

        boolean reslt = s.endsWith("better");
        System.out.println(reslt);

        //concat() method is same with the "+" in Java.
        String t =  s.concat("!");
        System.out.println(t);//Do practice to be better!

        String m =  s.concat("please");//Do practice to be betterplease
        System.out.println(m);

        String n =  s.concat("please").concat("!");//Do practice to be betterplease!
        System.out.println(n);

        //Note://If you use multiple methods side by side, it is called "method chain"
















    }

}
