import javax.sound.midi.Soundbank;

public class StringMethods {

    public static void main(String[] args) {


//        String str = "java is Fun";

//        System.out.println("length=" + str.length());


        //char at
//        System.out.println(str.charAt(0));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(6));
//        System.out.println(str.charAt(12));

//        String str ="java";
//        String str2 = "Java";
//        String str3 = "ja";
//
//        System.out.println(str.equals(str2));
//        System.out.println(str.equalsIgnoreCase(str2));
//        System.out.println("abc".equalsIgnoreCase("ABC")); //true
//        System.out.println("=======================");
//        System.out.println(str.startsWith("j"));
//        System.out.println(str.startsWith(str3));
//        System.out.println(str.startsWith("J"));
//        System.out.println(str.startsWith("J".toLowerCase()));
//        System.out.println(str.endsWith("av"));
//        System.out.println("java".contains("j"));
//
//        // replace
//        String myString = "Java" + " " + "is" + " "  + "cool";
//        System.out.println(myString.replace('a', 'A'));
//        System.out.println(myString.replace(" " , "_"));
//        System.out.println(myString.replace("is", "_"));
//        System.out.println(myString);
//
//        System.out.println(myString.trim());
//        System.out.println(" Java is cool    ");
//        System.out.println(" Java is cool  ".trim());



        /**
         * Method chanining
         */

        String start = "  Java   ";
        String start2 = "  Java  ST    ";
        String trimmed = start.trim();

        String lowerCase = trimmed.toLowerCase();

        String result = lowerCase.replace('j', 'J');


        System.out.println(result);

        String newRes = start2.trim().toLowerCase().replace("s", "G");
        System.out.println(newRes);


        System.out.println("----------------------------------------");

        String s1 = "AD";

        String s2 = "ad";

        String s3 = new String("AD");


        String s4 = "A" + "D";

        String s5 = "A";

        String s6 = s5 + "D";

        System.out.println(s1 == s2); // f
        System.out.println(s1 == s3); // f
        System.out.println(s1 == s4); // T
        System.out.println(s1 == s5); // F
        System.out.println(s1 == s6); // F
        System.out.println(s1 == "AD"); // T
        System.out.println(s1 == "A" + "D"); // F
        System.out.println(s1 == new String("AD")); // F
        System.out.println(s1 == s5 + "D"); // F


        ///






    }
}

