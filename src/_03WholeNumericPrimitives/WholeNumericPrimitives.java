package acd.lp;

public class WholeNumericPrimitives {

    public static void main(String[] args) {

        long max = 323425235436575L;
        long n = 2_400L;

        /* OCTAL NUMBERS
        STARTS WITH 0 in FRONT
         */
        //octal (0 to 7);
       // 022 = (0 × 8²) + (2 × 8¹) + (2 × 8⁰) = 18
        int  otc = 07;
        int firstOctal = 010; // 8 in decimal
        int secondOctal = 022; // 18 in decimal

        int sumOCt = firstOctal + secondOctal;
        System.out.println("--------------OCTAL-------------Starts with: 0number");
        System.out.println("first = " + firstOctal + " " + "secondOCt = " + secondOctal);
        System.out.println("sum = " + sumOCt + " octSum = " + Integer.toOctalString(sumOCt));


        /* HEXADECIMAL NUMBERS
        STARTS with 0x in front
        (0 - 9, A -F)
        base 16
        1E = (1 × 16¹) + (14 × 16⁰) = 30
         */
        int firstHex = 0xF; // 15 in decimal
        int secondHex = 0X1E; // 30 in decimal
        int sumHex = firstHex + secondHex; // 45 decimal , 2d Hex;
        System.out.println("--------------HEX-------------Starts with: 0xnumber");
        System.out.println("First = " + firstHex + " second = " + secondHex);
        System.out.println("decimalSum = " + sumHex + " HexSum = " +  Integer.toHexString(sumHex));


         /* BINARY NUMBERS
        STARTS with 0b in front
        (0 - 1)
        base 2
        1001 = (1 × 2³) + (0 × 2²) + (0 × 2¹) + (1 × 2⁰) = 9
         */
        int firstBinary = 0B1001; // 9 in decimal
        int secondBinary = 0b0111; // 7 in decimal
        int sumBinary = firstBinary + secondBinary;
        int thirdBinary = 0b10;

        System.out.println("--------------BINARY-------------Starts with: 0bnumber");
        System.out.println("First = " + firstBinary + " second = " + secondBinary);
        System.out.println("decimalSum = " + sumBinary + " BinarySum = " +  Integer.toBinaryString(sumBinary));
    }
}

