package week06day23practice;

public class Cat extends Animal {

    public void meow(){

        System.out.println("Cats meow...");//Cats meow...
    }

    @Override
    public void eat() {
        System.out.println("Cat eat meat");//Cat eat meat
    }

    @Override
    public void drink() {
        System.out.println("Cats drink milk");//Cats drink milk
    }
}
