package week06day23practice;

public class Animal extends Q04Creatures {

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

    public void move(){
        System.out.println("Animals can move...");
    }

    @Override
    public void weight() {
        System.out.println("All animals have weight");
    }

    @Override
    public void consume() {
        System.out.println("All animals consume different food.");
    }
}
