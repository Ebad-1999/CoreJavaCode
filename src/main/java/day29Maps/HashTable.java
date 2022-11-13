package day29Maps;

import day30mapsiterators.Students;

import java.util.Hashtable;

public class HashTable {
    /*

          1)Hashtable is a Map
            2)Hashtable does not put entries to any order
            3)Hashtable is slower than HashMap
            4)Hashtable is thread-safe and synchronized
     */



        public static void main(String[] args) {

            Hashtable<String, Integer> countryPopulations = new Hashtable<>();

            countryPopulations.put("USA", 400000000);
            countryPopulations.put("Germany", 85000000);
            countryPopulations.put("Turkey", 81000000);

            System.out.println(countryPopulations);


           // Example:

            //Store the student names togather with their email addressse, ages, grades, and, nationality.
            // Tom Hanks = th@gamil.com, 21, 2 "American".

            Hashtable<String, Students> stuInfo = new Hashtable<>();

            stuInfo.put("Tom Hanks", new Students("th@gamil.com", 21, 2, "American"));
            stuInfo.put("Brad Pitt", new Students("br@gamil.com", 24, 3, "Peruvian"));
            stuInfo.put("Angelina Jolie", new Students("an@gamil.com", 17, 4, "English"));
            System.out.println(stuInfo);


            //How to get specific data from Student table
            Students brad = stuInfo.get("Brad Pitt");
            System.out.println(brad);//[email='br@gamil.com', age=24, grade=3, nationality='Peruvian']
            System.out.println(brad.age);//24
            System.out.println(brad.nationality);//Peruvian







        }
}
