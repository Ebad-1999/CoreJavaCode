package SSGException;

import java.util.ArrayList;
import java.util.List;

public class E02 {

    public static void main(String[] args) {

        String arr[] = {"Ali", "CAn", "Veli", "Han"};
        getElementFromArray(arr,2);
        getElementFromArray(arr,5);

    }

    public static void getElementFromArray(String arr[], int idx){
        System.out.println(arr[idx]);
    }
}
