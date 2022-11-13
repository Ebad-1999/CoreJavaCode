package day15multidimensionalarraylists;

import java.util.Arrays;

public class multidimensionalArrays03 {
    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one dimensional array
        // { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        String arr [][]= {{"learn", "java", "it"}, {"is", "easy"} };

        //1.step: find the total number os elements in the multidimensional array

        int sum = 0;
        for (String[] w: arr){

            sum= sum+w.length;
        }
        //2/Step : Create one dimensional array by using the total number of elements in multidimensional array

        String brr[]= new String[sum];

        System.out.println(Arrays.toString(brr));//[null, null, null, null, null]

        //3.step : Transfer the elements from multidimensional array to one dimensional
        int idx = 0;
        for (String[] w : arr){

            for (String u : w){
                brr[idx] = u;
                idx++;

            }
        }
        System.out.println(Arrays.toString(brr));//[learn, java, it, is, easy]


















    }
}
