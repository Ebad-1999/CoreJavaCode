package week06day23practice;

public class Q03Runner {
    public static void main(String[] args) {

        Q03CalculateVolumeOfCube obj = new Q03CalculateVolumeOfCube();// in every object we need a constructor.

        System.out.println(obj.volumeOfCube(12));//1728.0
        System.out.println(obj.volumeOfSquarePrism(12, 1.85));//266.40000000000003
        System.out.println(obj.volumeOfRectangularPrism(15, 7.52, 4.45));//501.96
        System.out.println(obj.totalPrice(3, 2, 5));

    }


}
