package week04practiceArrays;

import java.util.Arrays;

public class Q1_Arrays {
    public static void main(String[] args) {

        //Example 1:Type code to check a specific elements in an Array or not


        String str []={"Ellie", "Susan", "Micheal", "George", "Tom"};

        String name ="George";

        int counter=0;

        for (String W: str){


            if (W.equals(name)){

                counter++;

            }
        }
        if (counter>0){
            System.out.println(name +" "+ "exists in the array");
        }else {
            System.out.println(name +" "+ " does not exists in the array");
        }

        //second 2 way: We will have binarySearch().
        //If the element exists binarySearch() method returns the index of the element.
        //When we need to use binarySearch(), we have to sort the array first and then use binarySearch().



        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx=Arrays.binarySearch(str, "George");
        System.out.println(idx);





    }

}
