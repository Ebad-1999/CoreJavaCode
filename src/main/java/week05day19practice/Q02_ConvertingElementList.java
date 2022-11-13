package week05day19practice;

import java.util.ArrayList;
import java.util.List;

public class Q02_ConvertingElementList {
    public static void main(String[] args) {


        /*
   If the list has 15 as element, change all 15s to 51
   Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
   */
        List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(11);
        num.add(15);
        num.add(34);
        num.add(43);

        System.out.println(num);//[12, 11, 15, 34, 43]
        if (num.contains(15)){
            for(Integer w : num){
                if(w==15){
                    num.set(num.indexOf(15), 50);
                }
            }
        }else {
            System.out.println(" num does not contain the expected element");
        }
        System.out.println(num);//[12, 11, 50, 34, 43]



    }
}
