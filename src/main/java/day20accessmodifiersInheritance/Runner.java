package day20accessmodifiersInheritance;

public class Runner {
    public static  void main(String[] args) {


        //Now we should draw object like : std1, std2, ...
        Students std1 = new Students();
        System.out.println(std1.stName);//Tom Hanks+

        Students std2 = new Students();
        System.out.println(std2.stdGPA);//3.83



        //How we can run our data without creating object
        //We use statics class
        //Or
        //If you want to access data inside the class
        //without using any object, the data must be static

        System.out.println(Students.dAdd);//Miami, FL USA


        System.out.println(Students.Name);//Tom Hanks























    }
}
