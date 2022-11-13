public class test {

    public static void main(String[] args) {

        int x= 12;
        int y = 11;


        System.out.print(x+y);

        test s =new test();
        s.stu(20, 60);
        s.stu2(100, 20);
        stu3(66, 10);
        System.out.println(s.rr(20,2));
    }

    public void stu (int x, int y){
        System.out.println(x+y);
        System.out.println(x-y);

    }


    public void stu2(int x, int y){
        System.out.println(x/y);
        System.out.println(x-y);
    }

    public static void stu3(int m, int n){
        System.out.println(m+n);
    }

    public int rr(int g, int h){
        return g/h;
    }
}
