package day13_Arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

     //Example 1: Create a nString Array and print the elements in alphabetical orders on the console in different lines.

        String cities[]= new String[5];

        cities[0] = "Tokyo";
        cities[1] = "Berlin";
        cities[2] = "Istanbul";
        cities[3] = "Jacksonville";
        cities[4] = "Calgary";
        System.out.println(Arrays.toString(cities));


        //How to put elements in natural order. Natural order for String ==> alphabetical order
        //                                      Natural order numeric values ==> ascending order
        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        //(W) mean every single name

        for (String w:cities){
            System.out.println(w);
        }


        System.out.println("====================");



        //Example 2:Create a String Array and print the elements whose length is less than 5
        //Shorter way to create on array:

        String names[] = {"Ali", "Thomas","Mark", "Jackson", "Tom", "Martin", "Ahmad", "Taj", "Alam Khan" };
        System.out.println(Arrays.toString(names));

        for (String w: names){
            if (w.length()<5){
                System.out.println(w);
            }
        }


        System.out.println("========================");

        //Example 3: Create a String Array and print the elements before "Tom".

        String Student[]= {"Ali", "Aisha", "Janet", "Tom", "John"};

        for (String w:Student){

            if (w.equals("Tom")){
                break;
            }
            System.out.println(w);
        }


        System.out.println("=======================");
        //Example 4: Create a String Array and print the elements before "Tom" and "Tom".

        String Student2[]= {"Ali", "Aisha", "Janet", "Tom", "John"};

        for (String w:Student2){
            System.out.println(w);

            if (w.equals("Tom")){
                break;


            }


        }
        System.out.println("============================");

        //Example 5: Create a String Array and print the elements different frim "Tom".
        String employee[]={"Ali", "Aisha", "Janet", "Tom", "John", "Michael", "Susan"};

        for (String w: employee){

            if (w.equals("Tom")){
                continue;//skip
            }
            System.out.println(w);
        }













    }
}
