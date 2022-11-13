package day15multidimensionalarraylists;

public class multidimensionalArray04 {
    public static void main(String[] args) {

        //Example find the Maximum element in two-dimensional array{{5, 0}, {-2, 4, 1}, {65, -12, 23}}

        int arr[][] = {{5, 0}, {-2, 4}, {65, -12, 23}};

        int max = arr[0][0];

        for (int[] w :arr){

            for (int u : w){

                //1.Way
                //if(max < u){
                //max = u;
                //}
                //2.Way
                max = Math.max(max, u);// max() method selects the maximum value of the given two numbers

            }


        }
        System.out.println(max);























    }
}