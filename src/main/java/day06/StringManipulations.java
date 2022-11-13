package day06;

public class StringManipulations {
    public static void main(String[] args) {
      //Count the alphabetical characters in given String
      //TomHanks!...==>

        String name = "Tom12      Hanks!....";
        int numOfLetters= name.replaceAll("     [^A-Za-z]", "").length();
        System.out.println(numOfLetters);
        /*
        If your code gives you correct out put for some data, but if it is not giving you correct output for some other data
        this is called "Hard coding" it is not accepted.

        If your codes works for all data it is called "Dynamic coding"
         */


        String name2 = "Tom12      Hanks!....";
        int numOfLetters2= name2.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters2);



















    }
}
