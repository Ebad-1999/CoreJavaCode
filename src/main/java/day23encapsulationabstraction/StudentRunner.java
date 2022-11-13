package day23encapsulationabstraction;

public class StudentRunner {

    public static void main(String[] args) {

        Student st1  = new Student();
        System.out.println(st1.name);//Tom Hanks

        System.out.println(st1.getStdId());//TH123
        System.out.println(st1.getStdGPA());//3.89
        System.out.println(st1.getDisease());//Heart Disease
        System.out.println(st1.isSuccessful());//false


        st1.setDisease(null);
        System.out.println(st1.getDisease());//null

        st1.setStdGPA(4.0);
        System.out.println(st1.getStdGPA());//4.0
    }
}
