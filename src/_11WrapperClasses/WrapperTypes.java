package PACKAGE_NAME._11WrapperClasses;


public class WrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;

        //boxing / converting primitive -> wrapper
        Integer myInteger = new Integer(10);
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10);
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;

        //unboxing wrapper to primitive
        int myIntPr = Integer.parseInt("2");
        int myInt3 = myInteger3;


        System.out.println("myInteger " + myInteger);
        System.out.println("myInteger2 " + myInteger2);
        System.out.println("myInteger3 " + myInteger3);
        System.out.println("myInteger4 " + myInteger4);
        System.out.println("myInteger5 " + myInteger5);



        //autoboxing
        Integer myIntAuto = 20; // automaticly converts the primitive to wrapper
        Integer myInt2auto = myInt;
    }
}
