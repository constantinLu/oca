package _03WholeNumericPrimitives;

public class CastingPrimitives {

    public static void main(String[] args) {

        /*
        byte –> short –> int –> long –> float –> double
        8 -> 16 -> 32 -> 64 -> 32.matissa -> 64.matissa
         */


        System.out.println("----------CASTING--------");

        char charPrimitive = 'a'; //16 bit

        byte bytePrimitive = 5; // 8 bit
        short shortPrimitive = -16; // 16 bit
        int intPrimitive = 20; // 32 bit
        long longPrimitive = 20; // 64 bit


        float floatPrimitive = 20f; // 32 bit
        double doublePrimitive = 20; //  64 bit


        System.out.println("------------Casting char---");
        //char charByte = bytePrimitive; // char doesn`t support negative vals so it needs explicit casting
        char charByte = (char) shortPrimitive;
        char charByte1 = (char) longPrimitive;
        // same for the rest


        System.out.println("------------Casting byte---");
        //byte byteChar = charPrimitive; // byte has less memory 16 -> 8 // compilation error.
        byte byteInt =  (byte) intPrimitive;
        // same for others


        System.out.println("------------Casting short---");
        //short shortChar = charPrimitive; // char doesn`t accept negative vals. 16 / 16
        short shortByte = bytePrimitive; // no need for casting sh = 16bit byte = 8bit
        short shoryInt = (short) intPrimitive; // int > short
        // same for others


        System.out.println("------------Casting int---");
        int intChar = charPrimitive; // int > char
        int intByte = bytePrimitive; // int > char
        int intLong = (int) longPrimitive; //int < long

        int intFloat = (int) floatPrimitive; // int == float but float has decimal values 2 < 2.230 // has mantissa
        int intDouble = (int) doublePrimitive;
        //same for the rest


        System.out.println("------------Casting long---");
        long longChar = charByte; // long > char
        long longShort = shortPrimitive; // long > short
        long longInt = intPrimitive; // same

        long longFloat = (long) floatPrimitive; // even long > float , float value has a mantissa so needs EXPLICIT CAST
        long longDouble = (long) doublePrimitive; // same

        System.out.println("------------Casting float---");

        float floatChar = charPrimitive; // float > char // IMPLICIT CASTING
        float floatShort = shortPrimitive; // float > short
        float floatInt = intPrimitive;
        float floatLong = longPrimitive; // float has mattisa and thats why it doesn`t need EXPLICIT CASTING

        float floatDouble = (float) doublePrimitive; // float < double  NEEDS EXPLICIT CASTING

        System.out.println("------------Casting long---");

        double doubleChar = charPrimitive; // double > char

        double doubleInt = intPrimitive;
        double doubleLong = longPrimitive;

        double doubleFloat = floatPrimitive;


        byte bs = -0;

    }


    private static int addBytes(byte b1, byte b2) {
         byte sumbyte = b1;
        return sumbyte;

    }
}
