package day20accessmodifiersInheritance;

public class Students {

    //Types of access modifier
   //It is accessible from entire the project, there is no restriction
   public String stName = "Tom Hanks";

   //It can be used just inside the "Student" class.
   //It can be used just inside the class it was created.
   private String stdID = "TH202217007";

    //It can be used just inside the "day20accessModifiersInheritance" package
    //It can be used just inside the package it was created
    double stdGPA = 3.83;// If you don't type any access modifier it will be "default"

    //It can be used inside the "day20accessModifiersInheritance" package, and from the child classes in other packages
    protected String stdAdd = "Miami, FL USA";




    //Following ones are "static", to access static things do not use "object", use class name
    public static String Name = "Tom Hanks";

    private static String ID = "TH202217007";

     static double  GPA = 3.83;// If you don't type any access modifier it will be "default"

    protected static String dAdd = "Miami, FL USA";


    //INTERVIEW QUESTIONS
     /*
        1)What is the difference between "default" and "protected" access modifiers?
            i)"protected" access modifier is wider than "default" modifier
            ii)"default" ones cannot be used from outside the package, therefore it's other name is "package private"
               "protected" ones can be used form the class in other packages if the classes are "child classes"

        2)Could you please tell the name of the access modifiers from the narrowest to the widest?
             private < default < protected < public

        3)Could you please explain all access modifiers?
             ...
     */

    //Note: A class can't be "privet" and can't be "protected"
    // "public" and "default" can be a class.





}
