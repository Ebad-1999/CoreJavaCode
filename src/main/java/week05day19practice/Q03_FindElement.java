package week05day19practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_FindElement {
    public static void main(String[] args) {

         /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int [] mid = {12, 5, 8, 21, 13, 15, 50};

        Arrays.sort(mid);
        int midInx = mid.length/2;    //3.5==>3 because we put length/2
        System.out.println(Arrays.toString(mid));//[5, 8, 12, 13, 15, 21, 50]
        System.out.println(midInx);//3

        if (mid.length%2!=0){
            System.out.println(midInx);//3     it mean index 3 (21)
        }else {
            double middle = (mid[midInx]+mid[-1])/2;
            System.out.println(middle);
        }



    }
}
