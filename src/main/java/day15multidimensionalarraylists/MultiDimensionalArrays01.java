package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

       //If an array has arrays as elements it is called "Multidimensional array"
        //How to create multidimensional array

        int arr [][] = new int[4][2];

        //how to print multidimensional array

        System.out.println(Arrays.deepToString(arr));//[ [0,0], [0,0], [0,0], [0,0], ]

        //How to assign values to multidimensional array

        arr[0][0] = 2;
        arr[0][1] = 3;

        arr[1][0] = 5;
        arr[1][1] = 9;

        arr[2][0] = 10;
        arr[2][1] = 7;

        arr[3][0] = -3;
        arr[3][1] = 8;



        System.out.println(Arrays.deepToString(arr));//[[2, 3], [5, 9], [10, 7], [-3, 8]]





        //How to create multidimensional array in short way
        //it is long way
        String brr[][] = new String[3][4];
        System.out.println(Arrays.deepToString(brr));//[[null, null, null, null], [null, null, null, null], [null, null, null, null]]

        //It is short way
        String crr[][] ={{"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"}};
        System.out.println(Arrays.deepToString(crr));//[[Tom, Jim], [Angie], [Carl, Chris, Ali]]


        //How to print a specific elements from multidimensional array

        System.out.println(crr[2][1]);//Chris
        System.out.println(crr[0][0]);//Tom


        //How to print a specific element from outer array
        System.out.println(Arrays.toString(crr[2]));//[Carl, Chris, Ali]


        //Example 1: Type code to find the number of elements in a multidimensional array

        String drr[][] ={{"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"}};
            int sum = 0;
        for (String[] w : drr){
           sum= sum+ w.length;

        }
        System.out.println(sum);//6















    }
}
