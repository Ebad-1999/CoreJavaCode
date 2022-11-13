package day15multidimensionalarraylists;

public class MultidimensionalArrays02 {

    public static void main(String[] args) {

        ////Example 1: Print the elements which have “a” from a 2 dimensional String array. { {“learn”, “java”, “it”}, {“is”, “easy”} }

        String arr [][]={ {"learn","Java", "it"}, {"is", "easy"} };

        for (String[] w : arr){

            //"W" mean {["learn", "java", "it"], ["is", "easy"]} and "U" mean {["learn", "java"], ["easy"]}.

            for (String u : w){

                if (u.contains("a")){
                    System.out.print(u+" ");//learn Java easy

                }
            }
        }

        System.out.println();

        //Example 2: Create an integer multidimensional array then find the sum of the elements.

        int brr[][]= {{12, 54}, {3, 2, 7}, {21}};
        int sum = 0;
        for (int [] W :brr){
            for (int u: W){

              sum = sum+u;

            }
        }
        System.out.println(sum);//99




















    }
}
