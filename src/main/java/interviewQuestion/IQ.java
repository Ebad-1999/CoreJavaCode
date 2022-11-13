package interviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class IQ {
    /*

    //It is accessible from entire the project, there is no restriction
    public String stName = "Tom Hanks";

    //It can be used just inside the "Student" class.
    //It can be used just inside the class it was created.
    private String stdID = "TH202217007";

    //It can be used just inside the "day20accessmodifiersinheritance" package
    //It can be used just inside the package it was created
    double stdGPA = 3.83;// If you don't type any access modifier it will be "default"

    //It can be used inside the "day20accessmodifiersinheritance" package, and from the child classes in other packages
    protected String stdAdd = "Miami, FL USA";




    //Following ones are "static", to access static things do not use "object", use class name
    public static String Name = "Tom Hanks";

    private static String ID = "TH202217007";

    static double  GPA = 3.83;// If you don't type any access modifier it will be "default"

    protected static String dAdd = "Miami, FL USA";

     */


    public static void main(String[] args) {
        List<Integer> l= new ArrayList<>();
        l.add(12);
        l.add(13);
        l.add(141);
        l.add(28);
        l.add(15);
        l.add(5);
        l.add(5);
        l.add(3);

        print(l);//12 13 141 28 15 5 5 3

    }

    public static void print(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t+" "));
    }


    //INTERVIEW QUESTION
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


    /*
    what is polymorphism
    Types of “Polymorphism”

        1) Method Overloading is a compile time (static) polymorphism.
        This allows us to have more than one method having the same name,
        if the parameters of methods are different in number, sequence and
        data types of parameters.

        2) Method Overriding is a run time (dynamic) polymorphism.
        This allows us to have more than one method having the same signature,
        and the body of the methods have different codes.
     */

    //***What is the prerequisite of overriding?==>Interview question
    //It is inheritance.



    //How do we connect two classes
    //by extends

    /*
    what is OOP(Object Oriented programing)
    1) Inheritance
    2) Polymorphism
    3) Encapsulation
    4) Abstraction
     */



    /*
    what is final variable:
    "final" keyword is very Important in Java
    "final" Keyword can be used for variables
    If you make a variable you can't change its value like "pi" value

   "final" variable must be initialized.
     public statics final double pi = 3.14;


     */

    /*
    How we can make  class parent of  class
    Answer: by using extend word+name of class

    How we can make  interface parent of  class
    Answer: by using implement word+name of interface

    How we can make  interface parent of  interface
    Answer: by using extend word+name of interface
     */

    /*
    Exceptions are mostly the interview question
    definition and types
     */


    /*
        1) If you want to execute a code for every scenario, use "finally" black after try body.
        2) "try" can be used in these ways:
        a) try + catch
        b) try + multiple catch
        c) try + multiple catch + finally
        Note: try can't be use alone
         */

    /*
    HashSet
1) It consists of unique elements,
an element can be used only once in Sets. no duplicate elements
2) If you want to add an element back to the HashSet,
the old one is deleted and the new one is overwritten.
3)HashSets are the fastest among Sets.
The order in which the values are entered is not taken into account.
4) HashSet can use "null" object as element.
However, if you want to add multiple null values to a HashSet,
 there will be only one null value.
 LinkedHashset :
 1) They do not accept repeated elements. They arrange the elements according to the insertion order.
 2) LinkedHashSet runs slower than HashSet.
 3) LinkedHashSet can use "null" object as element.
4) They are fast in adding and removing operations.
TreeSet :
1) TreeSet does not accept repeated elements, because it is Set.
2) Arranges the elements according to natural Order (alphabetical if String, smallest to largest).
3) TreeSet is the slowest of the sets. That's why you should be careful when using TreeSet...
4)TRICK :TreeSet "null" object cannot be used as an element.
 Set Methods:
            .add(element);-->Adds element to Set
            .addAll(collection);-->adds all the elements of the desired collection
            .contains(element);-->freezes true if the desired element is in sett, false otherwise.
            .containsAll(collection);-->freezes true if all of the requested collection exists in the searched set, false otherwise
            .remove(element);-->removes and freezes true if the desired element is found, false if not found
            .removeAll(collection);-->removes all elements of the requested collection if it finds it and freezes true, if not found false returns
            .equlas(set2);--> freezes true if all elements are the same as the requested set2, false otherwise
            .retainAll(collection1);-->Deletes all elements except the elements of collection1, true if deleted, false otherwise (returns the intersecting common elements.)
            .clear();-->Delete all elements in sett
            .isEmpty();-->Freezes true if the set has no elements, false if any
            .size();-->returns the number of elements of the set
            .clone();--> when you use clone method, you can make data type "Object"


            Interview Question:

            - How can you decide on being QA engineer3
2- How many years have you been in IT sector.4
3-did you have IT background before deciding to be QA tester.5
4-How did you become a QA Tester. via bootcamp or some collegeus , university,6
5- If bootcamp , what kind of challenges did you live or encounter.7
6- Could you please tell about your interview experiences.8
7-For coding part, did they ask you difficult questions? Is it enough to study questions which Mr. Suleyman taught us in class?
9
8-How did you prepare for interviews?10
9-During the bootcamp how many hours did you study in a day?11
10-What do you think about QA's future?will it continue to be demanded job in the near future?
12
11-what are your suggestions to us about evaluating this camp process?13
12-How much Java do they ask in interviews?14
13-Where do you work and how much do you make per hour/month/year?15
14-Have you ever thought be a java developer instead of QA16
15- Are you working in the USA or Canada? Do you think do not having an experince in IT sector is a barrier to get a job?
17
16-Do you know are there available also internship opportunities in the market?18
17- Do you think the age is a disadvantage to get a job in IT sector, especially if we are experienced in another major?
19
18 - What are the job opportunities in Dubai IT market specially because it is already occupied by the Indian people. There's general perception here that Indians are very good at IT? Is it true?
20
19-Just to get the real test environment experience, can you explain your daily routine as a QA? How many coworker are there in your team.How is the QA-Developer relations.
Have you experienced bug rejection or disagrement with the developer?. How do you adress this kind of issues? Have you experienced a missed bug? What should be our course of action in these situation.
21
20-During the interview period, did you apply to any IT campany which had a vacancy or made some elemination according to some criterias. Which type of companies do you advice us?
22
21- During the interviews, did you face with expected questions or surprises and unexpected questions. What type of questions (behavioural, java, SDLC, Selenium) was the bigger challange for you.
23
22- Did you get offer after taking how many interviews with different campanies?24
23- what is a secret of JAVA ? I think I do not know anything about it and this freaks me out
25
24-How much does the salary start at the market now, if we work with a foreign company from Turkey, how is the situation in terms of salary?
     */
}


