package day06;

import java.util.Scanner;

public class ModulusOperator01 {
    public static void main(String[] args) {
        /*Modulus operator:% is called modulus operator in Java.
        It returns the remainder in a division operation.
        13/5 ==> Modulus operator gives you 3.
        13%5==>3


        Ask user to enter an integer then print 'Even' on the console if the number is even.

         */
        Scanner input = new Scanner(System.in);





        System.out.println("Enter an integer");

        int number = input.nextInt(); // -1000, -10, 0==> We should always consider "Boundary values": -1000, -99, -10, 0, 10 and so on.
        //We should use Math.abs(variable name)

        int absNumber = Math.abs(number);

        System.out.println("Is the number even? " + (absNumber % 2 == 0));

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter a digit to check if it is an odd number");

        int checkOdd = input2.nextInt();

        int absCheckOdd = Math.abs(checkOdd);

        System.out.println("Is the number odd? " + (absCheckOdd % 2 != 0));











        Scanner treeDigitsNumber = new Scanner(System.in);

        System.out.println("Enter a 3 digits number");
        int absThreeDigitsNumber = treeDigitsNumber.nextInt();

        int last = absThreeDigitsNumber%10;

        absThreeDigitsNumber = absThreeDigitsNumber / 10;
        int second = absThreeDigitsNumber%10;

        absThreeDigitsNumber = absThreeDigitsNumber / 10;
        int first = absThreeDigitsNumber%10;
        System.out.println(last + second + first );












    }

}
