package day11constructorsmethodcallstatickeword;

public class Static01 {

    /*
    1)"Static" class members (variables and methods are common for all objects created from the class
    2)When you do any update on static class members, all objects will see the
     */

    public static int staticCounter =0;
    public  int nonStaticCounter =0;

    public Static01(){
        staticCounter++;
        nonStaticCounter++;
    }
}

