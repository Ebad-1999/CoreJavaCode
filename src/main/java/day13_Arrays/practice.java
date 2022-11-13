package day13_Arrays;

import java.util.Arrays;

public class practice {
    public static void main(String[] args) {


          int sum =0;
        int arr[]={11, 12, 13, 14};
        for(int i =0 ; i<4 ; i++ ) {

           sum=sum+arr[i];
            System.out.print(arr[i] + "  ");
        }
        System.out.println(Arrays.toString(arr));


        int sun = 0;
        int ar[]={2, 11, 0, 23, 5};
        for (int w: ar) {
            Arrays.sort(ar);
            System.out.println(ar);
        }




        char arrr[]={'a', 'C', 'c', 'A', 'b' };




        int an[]={2, 11, 0, 23, 7};//23 11 7 2 0
        Arrays.sort(an);
        for (int i = 4 ;i>=0; i--){
            System.out.print(an[i]+ " ");
        }


        int am[]={3, 2, 3, 4, 4, 5};
        int count=0;
           for (int i =0 ; i<am.length; i++) {

               if (am[i] == 3) {

               }
           }

           char ab[]=new char[4];
           ab[0]='A';
           ab[1]='E';
           ab[2]='M';
           for (char w:ab) {
               System.out.println(Arrays.toString(ab));
           }


           int x[]={3, 5, 7};
           int  a = 0;
           int b = 0;
           while (a<x.length){
               b= b+x[a];
               a++;
               System.out.println(b);//15
           }







    }
}
