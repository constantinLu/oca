public class NumericPromotions {

    //promotions = converting small types into bigger types
    public static void main(String[] args) {
        int x = 5;
        double y = 10.55;
        System.out.println("x+y= " +  (x + y));
        float f1 = 1.2f;
        long l1 = 123215;
        short s1 = 2;

        byte b = 10;
        int c = 5;
        double d = 4.5;
        double result = b + c + d;
        System.out.println(result);

        byte b1 = 2;
        char c1 = 'a';
        System.out.println((int) c1);
        int i1 = b1 + c1;
        System.out.println(i1);
        x = c1;
        x = b1;
        y = x;
        f1 = x;
        f1 = l1;


        // casting = converting bigger types into smaller data types

        double myD = 55.55;
        int myInt = 4 + (int) myD;
        System.out.println(myInt);


        int anotherInt = 533;
        byte byt3 = 15;
        int intes = anotherInt + byt3;

        byte resByte = (byte) (anotherInt + byt3);
        System.out.println("byte " + resByte);
        System.out.println(intes);
        int sum = 4 * 5 / 4 + 2;
        System.out.println(sum);

        short sh = 2;
        char ch = 'a';

        sh = (short) ch;
        ch = (char) sh;

        int g = 6; // 5 6 5
        int h = 2; // 3 2
        int sumi = 3 + 5 * 3 + 2 * 5 - 3 % 5;
        int sumM = 3 + 15 + 10 -3;
        sumM = 25;
        System.out.println(sumi);
    }


}
