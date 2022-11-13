package day18_PassByValue_Date_Time;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {


        //How to get current date in Java code

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-28

        //How to get"current time" by typing Java code

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//19:37:18.369913900

        //How to get "current date and current Time" by Java
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-28T19:37:18.371914

        //How to get current date in another country or location bu typing Java codes
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Europe/Madrid"));
        System.out.println(currentDateInJapan);//2022-09-28

        //How to get current date and time in another country
        LocalDateTime currentDateTimeInJopan1 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJopan1);//2022-09-29T00:15:26.581838

        LocalDateTime currentDateTimeInJopan2 = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJopan2);//2022-09-29T00:15:26.581838

        //How to go future in date

        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-28

        LocalDate cdNext = cd1.plusDays(120);
        System.out.println(cdNext);//2023-01-26

        //How to add years for future dates in Java
        LocalDate LocalDateInFuture = cd1.plusYears(2).plusMonths(5).plusDays(120);
        System.out.println(LocalDateInFuture);//2025-06-28

        //How to get to a past date in Java

        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-23

        //Homework: Type code to learn how to go to future and past it times

        //How to get specific date part of the time
        LocalTime ct1 = LocalTime.now();//hour
        int hour  = ct1.getHour();
        System.out.println(hour);//20

        int minute = ct1.getMinute();
        System.out.println(minute);//26


        //How to change the format of the date

        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd/MMM/yyyy"); //28/Eyl/2022==>MMM gives the date format
        // with the acronym of the month name
        String formattedCurrentDate2= dateTimeFormatter.format(cd1);
        System.out.println(formattedCurrentDate2);  //"dd/MM/yyyy" //28/09/2022==>MM gives the month value as double character integer


        DateTimeFormatter dateTimeFormatter2= DateTimeFormatter.ofPattern("dd/MMMM/yyyy"); //28/Eylül/2022==>MMM gives the date format
        // with the full month name
        String formattedCurrentDate3= dateTimeFormatter2.format(cd1);
        System.out.println(formattedCurrentDate3);//28/September/2022

        //How to change the format

        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("HH:mm A");//08:39//hh uses 12 hour of format

        LocalTime lt = LocalTime.now();
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);//HH uses 24 hours of format ==> 20:39



        //How to create specific dates

        LocalDate dob1 = LocalDate.of(2002, 10, 12);
        System.out.println(dob1);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY, 21);
        System.out.println(dob2);

        //How to compare 2 dates

        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is  = dob2.isBefore(dob1);
        System.out.println(is);//false
















    }
}
