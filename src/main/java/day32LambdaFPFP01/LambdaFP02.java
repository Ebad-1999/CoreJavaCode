package day32LambdaFPFP01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP02 {

    /*
    1) "variable" or "variables" gives ==> "logic"  ==> this structure is called "Lambda Expression"
    2) In Functional Programming, we can use "Lambda Expression", it is allowed but not recommended
    Instead of "Lambda Expressions" we prefer "method reference".
    3) Method Reference is Class Name::"Method Name".
    For ex:   "String :: length" (Do not type method parenthesis, type just method name)

    You can use your own class to create the required method for your application.
     */

    public static void main(String[] args) {


            List<Integer> l = new ArrayList<>();

            l.add(8);
            l.add(9);
            l.add(131);
            l.add(10);
            l.add(9);
            l.add(10);
            l.add(2);
            l.add(8);
            printElementsFunctional(l);//8 9 131 10 9 10 2 8
        System.out.println();
        printEvenElementsStructure(l);//8 10 10 2 8
        System.out.println();
        printSquareOfOddElements(l);//81 17161 81
        System.out.println();
        printCubOfDistinctOddElements(l);//729 2248091
        System.out.println();
        sumOfSquaresDistinctEvenElements(l);//168
        System.out.println();
        productOfCubesOFDistinctEvenElements(l);//4096000
        System.out.println();
        getMaxElement(l);//131
        System.out.println();
        getMinGreaterThanSevenEvenNum(l);//8
        System.out.println();
        getHalfOfDistinctEleInReverseOrder(l);//[65.5, 5.0, 4.5, 4.0]


    }

    //1) Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.  (Structure)

    public static void printElementsFunctional(List<Integer> list){
        list.stream().forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    //2) Create a method to print the even elements in the list on the console in the same line with space
    //between two consecutive elements (Functional with method reference )

    public static void printEvenElementsStructure (List<Integer> list){
        list.stream().filter(UtilsClass::checkToBEEven).forEach(UtilsClass::printInTheSameLineWithTheSpace);

    }

    //3) Create a method to print the square of odd elements on the console
    // in the same line with a apace between two consecutive elements

    public static void printSquareOfOddElements(List<Integer> list){

        list.stream().filter(UtilsClass::checkToBEOdd).map(UtilsClass::getSquare).forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    //4) Create a method to print the cube of Odd distinct (not same) elements on the console in the same line
    //with a space between two consecutive elements.

    public static void printCubOfDistinctOddElements(List<Integer> list){
        list.stream().distinct().filter(UtilsClass::checkToBEOdd).map(UtilsClass::getCub).forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }


    //5) Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresDistinctEvenElements (List<Integer> list) {
        //1.way
        Integer sum = list.stream().distinct().filter(UtilsClass::checkToBEEven).map(UtilsClass::getSquare).reduce(0, Math::addExact);

        System.out.println(sum);
    }

    public static void sumOfSquaresDistinctEvenElements02 (List<Integer> list) {
        //2.way
        Integer sum= list.stream().distinct().filter(UtilsClass::checkToBEEven).map(UtilsClass::getSquare).reduce(0, Integer::sum);

        System.out.println(sum);
    }

    //6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOFDistinctEvenElements(List<Integer>list){

        Integer product = list.
                stream().distinct().
                filter(UtilsClass::checkToBEEven).
                map(UtilsClass::getCub).
                reduce(1, Math::multiplyExact);
        System.out.println(product);
    }


    //7) Create a method to find the maximum value from the list elements

    //1.way
    public static void getMaxElement(List<Integer> list){

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(max);

    }

   //Home //8) create a method to find the minimum value from the list elements (in (2 ways).

    //9) Create a method to fine the minimum value is greater than 7 and even elements from the list.

    public static void getMinGreaterThanSevenEvenNum(List<Integer> list){
        Integer min = list.stream().distinct().filter(t-> t>7).filter(UtilsClass::checkToBEEven).reduce(Integer.MAX_VALUE,Math::min);
        System.out.println(min);
    }

    //10) Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in a list.
    public static void getHalfOfDistinctEleInReverseOrder(List<Integer> list){
        List<Double> result = list.stream().distinct().filter(t-> t>5).map(UtilsClass::getHalf).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }







}
