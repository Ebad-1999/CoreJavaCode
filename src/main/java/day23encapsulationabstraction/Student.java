package day23encapsulationabstraction;

public class Student {

    public String name  =" Tom Hanks";
    private String stdId = "TH123";
    private double stdGPA = 3.89;
    private String disease = "Heart Disease";
    private boolean Successful = false;

    public String getStdId() {
        return stdId;
    }

    public String getDisease(){
        return disease;
    }

    public double getStdGPA() {
        return stdGPA;
    }

    //Note: If the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful() {
        return Successful;
    }

    //Now we use "set()" method.
    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setStdGPA(double stdGPA) {
        this.stdGPA = stdGPA;
    }
    //Even the data type is boolean we use "set" at the beginning of the name.

    public static void main(String[] args) {








        /*
                                    Encapsulation or (Java beans):
        Encapsulation is "data hiding"
        To hide a data we make the access modifier "private"
        After "hiding data", you may need to "read" or "update" the data.
        To "read" or "update" the data we will create some methods.
        To "read" "encapsulated data" you should create "get()" methods, we name it "getters"
        To "update" "encapsulated data" you should create "set()" methods, we name it "setters"

         Note: By using set() method we prevent confusion and save memory by creating just 1 object.
        "get()" and "set()" is also called "Java Beans".

        In addition:
        If a class is "Immutable" it is impossible the value of the existing variable
        If you want to make a class immutable don't create any "setter" method


 */
    }
}
