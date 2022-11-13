package day33LambdaFP;

import day32LambdaFPFP01.UtilsClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda_intStreamUsage {

    public static void main(String[] args) {




        System.out.println(getSumFromSevenToHundred01());//5029
        System.out.println(getSumFromSevenToHundred02());//5029
        System.out.println(getMultiplicationFromTwoToEleven());//39916800
        System.out.println(calculateFactorial01(-5));//0
        System.out.println(calculateFactorial02(-5));//Do not use negative numbers for factorial operation
        System.out.println(sumOfIntsInGivenRange01(11, 100));//2520
        System.out.println(sumOfIntsInGivenRange02(11, 100));//2520
        System.out.println(sumOfIntsInGivenRange03(-2, -4));//-6

    }

    //Create a method to fine the sum of the Integers from 7 to 100.
    //1.way: IntStream.range (7, )==> has the same functionality with for-loop in structured programming
    public static int getSumFromSevenToHundred01(){

        return IntStream.range(7, 101).reduce(0, Math::addExact);

    }
    //2.way:
    public static int getSumFromSevenToHundred02(){
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }

    //2)Create a method to find the multiplication of the integers from 2 (inc) to 11 (inc).

    public static int getMultiplicationFromTwoToEleven(){
        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

   // IntStream: It is an artificial list  when we don't have a ready  list we can use
    // IntStream(we use from java ready list by using IntStream).

    //3) Create a method to calculate the factorial of a given number. (5! ==> 1*2*3*4*5)
    public static int calculateFactorial01(int x){
        if (x>0){
        return IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        }
        System.out.println("Do not use negative numbers for factorial operation");
        return 0;
    }
    //Note: negative numbers can't be excequate in Factorial

    public static Object calculateFactorial02(int x){

     return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact)  :  "Do not use negative numbers for factorial operation";
    }

    //4) Create a method to calculate the sum of even integers between given two integers
    //1.way
    public static int sumOfIntsInGivenRange01(int a, int b){
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBEEven).reduce(0, Math::addExact );
    }

    //2.way
    public static int sumOfIntsInGivenRange02(int a, int b){
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBEEven).sum();
    }

    //How it will be if first number greater than 2nd one?
    public static int sumOfIntsInGivenRange03(int a, int b){

        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBEEven).sum();
    }





}
