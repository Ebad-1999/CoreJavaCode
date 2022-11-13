package week04practiceArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_MinAndMaxValue {
    public static void main(String[] args) {

        /*Type code to print the sum of the minimum and maximum value of an integer Array.




        System.out.println(Arrays.toString(arr));

        //Put the elements in ascending number by using .sort() method==>.sort()

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int minVa = arr[0];//10
        int maxVa = arr[arr.length-1];//78

        System.out.println(minVa+maxVa);

         */


        //Create an Array and first take the number of the elements and then print them on the console.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the employees to store in the array");

        int len = scan.nextInt();

        String arrEmp[] = new String[len];

        for (int i = 0 ; i<len ; i++){

            System.out.println("Enter"+ (i+1) +". employee name. Please press 'Q' to quite");

            String EmpName = scan.next();

            if(!EmpName.equalsIgnoreCase("Q")){

                arrEmp[i]=EmpName;

            }else {
                break;
            }

        }
        System.out.println(Arrays.toString(arrEmp));


















    }
}
