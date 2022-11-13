package day18_PassByValue_Date_Time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 1:Type the code that finds out how many months Ali lived. Date of birth of Ali is 4th of june 1997.
        LocalDate doAli = LocalDate.of(1997, Month.JUNE, 4);
        LocalDate currentDate = LocalDate.now();

        int numOfMonths = (int)ChronoUnit.MONTHS.between(doAli, currentDate);
        System.out.println(numOfMonths);//303

        //Example 2: Tom was born 45years,8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type the code to calculate the exact date of birth of Ali and Veli.
        //Type code to check if the date of birth of Ali and Veli is the same or not.

        LocalDate dotom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate doveli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);

        System.out.println(dotom);//1969-07-04
        System.out.println(doveli);//1969-07-04
        boolean isSame = dotom.equals(doveli);
        System.out.println(isSame);//true



    }
}
