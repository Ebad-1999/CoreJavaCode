package day07stringmanipulation;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {


        /*String str = "Ali is 13 years old, I like Ali, Ali does not like me!... ";

        int numOfAllChars = str.length();

        int t = str.replaceAll("\\p{Punct}", "").length();
        System.out.println(numOfAllChars-t);//6

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName = input.nextLine();
        System.out.println(fullName);

        String fixedFullNAme = fullName.trim();//trim method remove all spase
        System.out.println(fixedFullNAme);
    }
}
