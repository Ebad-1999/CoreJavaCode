package day33LambdaFP;

import day32LambdaFPFP01.UtilsClass;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class LambdaStringUsage {

    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tom");
        l.add("Ben");

        printInUpperCase(l);//TOM ALLEY MARK AMANDA JOHN JACKSON MARRY ALBERTO TUCKER BEN
        System.out.println();
        printInUpperCase02(l);//[TOM, ALLEY, MARK, AMANDA, JOHN, JACKSON, MARRY, ALBERTO, TUCKER, BEN]
        System.out.println();
        printEleSortedByLengths(l);//TOM BEN MARK JOHN ALLEY MARRY AMANDA TUCKER JACKSON ALBERTO
        System.out.println();
        printEleInReverseOrderSortedByLength(l);//JACKSON ALBERTO AMANDA TUCKER ALLEY MARRY MARK JOHN TOM BEN
        System.out.println();
        printDistinctEleSortedByLastChar(l);//AMANDA MARK TOM JOHN JACKSON BEN ALBERTO ALLEY MARRY
        System.out.println();
        printSortedByLengthAndSortedByInitial(l);//BEN TOM TOM JOHN MARK ALLEY MARRY AMANDA ALBERTO JACKSON
        System.out.println();
//        removeIfTheLengthIsGreaterThanFive(l);//[TOM, ALLEY, MARK, JOHN, MARRY, TOM, BEN]
//        System.out.println();
//        printRemoveIfStartingWithAOrEndingWithN02(l);//[TOM, MARK, MARRY, TOM]
        System.out.println();
//        removeIfStartingWithAOrEndingWithN03(l);//[TOM, MARK, JOHN, TOM, BEN]
//        System.out.println();
//        removeIfStartingWithAOrEndingWithN04(l);//[TOM, MARK, JOHN, TOM, BEN]xxxxx
        System.out.println();
        System.out.println(checkLengthToBeLessThanTwelve(l));//true
        System.out.println();
        System.out.println(checkNotToStartWithX(l));//true
        System.out.println();
        System.out.println(checkAnyEleEndsWithN(l));//false
    }

    //1)Create a method to print all list elements in uppercase.

    public static void printInUpperCase(List<String> list){

        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    public static void printInUpperCase02(List<String> list){
        //2.Way:
        list.replaceAll(String::toUpperCase);
        System.out.println(list);

    }

    //2) Create a method to print the elements after ordering according to their lengths

    public static void printEleSortedByLengths(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithTheSpace);

    }

    //3)Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printEleInReverseOrderSortedByLength(List<String> list){
        list
                .stream().
                sorted(Comparator.comparing(String::length).reversed())
                .forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    //4) Create a method to sort the distinct elements by using their last characters

    public static void printDistinctEleSortedByLastChar(List<String> list){
        list.stream().distinct().
                sorted(Comparator.comparing(UtilsClass::getLastChar)).
                forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    //5)Create a method to sort the elements according to their lengths then according to their first character

    public static void printSortedByLengthAndSortedByInitial(List<String> list){
        list.stream().
                sorted(Comparator.comparing(String::length).thenComparing(t-> t.charAt(0))).
                forEach(UtilsClass::printInTheSameLineWithTheSpace);
    }

    //6) Remove the elements if the length of the element is greater than 5

    //Note: we do not use foreach() because we are making a new list between [].

//    public static void removeIfTheLengthIsGreaterThanFive(List<String> list){
//        list.removeIf(t-> t.length()>5);
//        System.out.println(list);
//    }
//
//    // 7)Remove the elements if the element is starting with 'A', 'a' or ending with 'N', 'n'
//    //Note: we do not use foreach() because we are making a new list between [].
//
////    //1.way
////    public static void removeIfStartingWithAOrEndingWithN01(List<String> list){
////        list.removeIf(t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N'  ||  t.charAt(t.length()-1)=='n');
////        System.out.println(list);
////    }
//
//    //2.way
//    public static voidremoveIfStartingWithAOrEndingWithN02(List<String> list){
//        list.removeIf(t-> t.startsWith("A") || t.startsWith("a") || t.endsWith("N")  ||  t.endsWith("n"));
//        System.out.println(list);
//    }

    //8) Remove the elements if the length is between 5 and 9 or ending with 'o'
    //1.way
//    public static void printRemoveIfStartingWithAOrEndingWithN03(List<String> list){
//        list.removeIf(t-> t.length()>4 && t.length()<10  || t.endsWith("o"));
//        System.out.println(list);
//    }
//
//    //2.way
//    public static void printRemoveIfStartingWithAOrEndingWithN04(List<String> list) {
//
//        Predicate<String>  checkCondition = t-> ((t.length() > 4 && t.length() < 10)  ||  t.endsWith("o"));
//        list.removeIf(t -> checkCondition.test(t));
//        System.out.println(list);
//
//
//    }

    //9) Create a method to check if the lengths of the all elements are lass than 12.
    public static boolean checkLengthToBeLessThanTwelve(List<String> list){
        return list.stream().allMatch(t-> t.length()<12);
    }

    //10) Create a method to check if the initial of any elements is not "X".

    public static boolean checkNotToStartWithX(List<String> list){
        return list.stream().noneMatch(t-> t.startsWith("X"));
    }

    //11) Create a method to check if at least one of the elements ending with "n".

    public static boolean checkAnyEleEndsWithN(List<String> list){
        return list.stream().anyMatch(t-> t.endsWith("n"));
    }






}
