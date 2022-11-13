package day18_PassByValue_Date_Time;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
          1)When you use a variable inside the method, Java creates the copy of the variable and uses it inside the method
          Java does that to protect the original value of variables.
          If in every method usage, the value changes, it creates very big problems.

          2)Some programming languages don't use Pass By Value. They use Pass By Reference.
          If you sue Pass By Reference original value will change in every method usage.

          3)If you insist on changing the original value in Java, you can do it as well.
          Assign the updated value to the original variable then original value will be updated.
        */

        int price =20;

        System.out.println(change(price));//40
        System.out.println(price);


        price  = change(price);
        System.out.println(price);//40



    }

    public static int change(int a){
        return a*2;
    }
}
