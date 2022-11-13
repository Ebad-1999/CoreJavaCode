package day06;

public class ConcatenationIf {
    /*
             Concatenation: Joining Strings with each other or with other data types.
               To do concatenation we have 2 options:
               1) Use '+' sign ==>we can use this way with all data types
               2) Use 'concat()' method ==>Inside the concat() parenthesis you can put just String not other data types
       */
    public static void main(String[] args) {

        String s = "Tom", t = "Hanks";

        int i = 12, a = 5;
        char c = 'A';
        System.out.println(s+" "+t);//Tom Hanks

        //1.way: By using "+" sign
        //Addition operation
        System.out.println(s+i+a); //Tom125
        System.out.println(s+(i+a)); //Tom17
        System.out.println('s'+i+a);//132
        System.out.println("s"+i+a);//s125

        System.out.println(i+a+s);//17Tom
        System.out.println(i+s+a);//12Tom5

        //Multiplication operation
        System.out.println(s+ a*i);//Tom60

        System.out.println(i+c+s);//77Tom

        System.out.println(c+s+a);//ATom5



        //2. way: By using concat()
        System.out.println(s.concat( " ").concat(t));//Tom Hanks












    }
}
