package PACKAGE_NAME._16EqualityOperator;

public class EqualityOp {

    public static void main(String[] args) {

        //used for : "==" comparing two operands
        // comparing primitive
        // comparing boolean
        // comparing object references

        int a = 5;
        int b = 3;
        boolean c = a == b; //false;
        boolean d = a != b; // true;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);


        // DOESN`T COMPILE
        //boolean g = true == 0;
        //boolean h = false != "test";
        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false); // false



        // Understanding == and .equals() method.
        // when using == on object -> object references
        // when using .equals() on object -> checking the internal value  ex(value of 1 is equal with value of 1) if the object has the equal() method.

        Integer i  = 127;
        Integer s = 127;
        System.out.println(i == s);

        System.out.println(i.equals(s));


        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;
        System.out.println(int1 == int2);
        System.out.println(int1 == int3);
        System.out.println(int2 == int3);

        System.out.println(new Integer(1) == 1);





    }
}
