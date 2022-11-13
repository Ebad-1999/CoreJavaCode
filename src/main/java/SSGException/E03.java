package SSGException;

public class E03 {
    public static void main(String[] args) {

        printTheWorkerAge(14);
        printTheWorkerAge(10);

        //Create a method with throw "IllegalArgumentException" for negative ages.
    }

    public static void printTheWorkerAge(int age) {

        if (age>=0){
            System.out.println(age);
        }else {
            throw new IllegalArgumentException();
        }
    }
}
