package acd.lp;

public class DefaultInitialization {

    static int global;
    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {

        int localInt;
        //System.out.println(localInt);

        System.out.println("Default int " + global);
        System.out.println("Default boolean " + myBoolean);
        System.out.println("Default byte " + myByte);
        System.out.println("Default short " + myShort);
        System.out.println("Default myfloat " + myFloat);
        System.out.println("Default double " + myDouble);
        System.out.println("Default char " + myChar);
    }
}
