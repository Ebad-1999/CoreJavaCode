package day20accessmodifiersInheritance;

public class CarRunner {

    public static void main(String[] args) {

        Civic c = new Civic();
        c.ecoEngin();
        c.hondaMake();
        c.engin();

        //result is
        //Car class constructor 1
        //Honda class constructor 1
        //Civic class constructor
        //Civic has ecoEngin
        //This car is made in Honda
        //All cars has engin



        System.out.println();

        Accord a = new Accord();
        a.sportDesign();
        a.hondaMake();
        a.engin();

        //result is
        //Car class constructor 1
        //Honda class constructor 1
        //Accord class constructor 1
        //Accord uses sport designer...
        //This car is made in Honda
        //All cars has engin
    }
}
