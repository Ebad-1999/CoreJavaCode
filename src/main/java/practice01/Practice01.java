package practice01;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        /*
         If the score is less than 50 then you will fail
           If the score is greater than 50 then you will pass,
          If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
          here only one condition will be checked.
          if the first part is true then the first action will occur but
          if the first condition is false then the second action will occur,this is the logic of "if else".
        */
        // Create object from Scanner
        Scanner scan = new Scanner(System.in);

        //2.step:  send message to user
        System.out.println("Enter your grade");
        //3.step: Create a container with the appropriate data type
        int score = scan.nextInt();
        //4.step: type code condition with if statement


        /*first way

        if (score<50){
            System.out.println("you failed");
        }else {
            System.out.println("you passed");
        }

         */



         /*2.way with multiple if statement ==> not recommended because of reputation.
        if (score<50){
            System.out.println("you failed");
        }
        if (score >=50){
            System.out.println("you passed");
        }

          */
        //3.way: && ==> "AND" operator checks all conditions. If all conditions are positive will return true.
        //&& operator is pesimistic. Even one false condition return false. If you have 100 conditions and only one
        //of them is false and 99 conditions are true then && operator will return false.
        if (score<50){
            System.out.println("yoy failed");

            }else if((score >=50) && (score<=100))  {
            System.out.println("you passed");

        } else if((score<=0) || score>100 ) {
            System.out.println(" Enter a valid score");
        }










    }



}
