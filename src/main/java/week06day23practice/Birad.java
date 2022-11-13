package week06day23practice;

public class Birad extends Animal{
    public void tweet(){
        System.out.println("Birds tweet...");
    }

    @Override
    public void weight() {
        System.out.println("Birds are very light animals");
    }
}
