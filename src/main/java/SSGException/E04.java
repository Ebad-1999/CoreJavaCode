package SSGException;

public class E04 {
    public static void main(String[] args) {

        String str = "Java is not easy";
        String  z = null;


        try {
            System.out.println(str.length());
            System.out.println(z.length());

        }catch (NumberFormatException e){
            System.out.println("Put an string");
        }




    }
}
