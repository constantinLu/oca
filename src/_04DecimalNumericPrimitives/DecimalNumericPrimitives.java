package acd.lp;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {

        //float myNumber = 25.4;
        float myNumber = 25.4F;
        float myNumber1 = 25.4f;

        // double before = 10_.25; // does not compile
        //double after = 10._25; // does not compile
        //double after = _10.25; // does not compile
        //double last = 10.25_ // does not compile

        double myDouble = 2.43;
        double myDouble2 = 2.54f; // automaticly gets converted to double
        double myDouble3 = 2.55d; // same thing as without d; works with D as well; d is optional
        double scientific = 5.000125E03; // same as myDoublesame
        //double scientific = 5.000125F03; // if it is not E will not compile
        double myDoublesame = 5000.125;

        System.out.println(scientific + " " + myDoublesame);

       // Letter p is used to signify a hexadecimal floating point literal
        double hexPi = 0x1.91eb851eb851fp1; //p indicates hexadecimal floating point number;
        System.out.println("hexPi = " + hexPi);
    }
}
