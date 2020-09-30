package UnderstandingEquality;

public class Equality {

    public static void main(String[] args) {

    StringBuilder one = new StringBuilder();
    StringBuilder two = new StringBuilder();
    StringBuilder three = one.append("java");

    StringBuilder four = one;


        System.out.println(one == two); // false
        System.out.println(one == three); // three
        System.out.println(four == one);

        String x = "Java";
        String y = "Java";

        System.out.println("------------------");
        String xy = new String("Java");
        String yx = new String("Java");
        System.out.println(x == y);
        System.out.println(xy == yx);


        System.out.println("---------------");

        String a = "Java";
        String b= " Java ".trim();

        System.out.println(a == b);

        System.out.println("-----------");
        String c = "Java";
        String d = "Ja".trim() + "va";
        System.out.println(c == d);

        int n = 4;
        String dog = "husy";
        String an = n + "1";
        System.out.println(an);
        System.out.println("---------------");

        String str = "Hello";
        System.out.println("Hello ".trim() == str);
        System.out.println("Hello"== str);
        System.out.println("Hell".concat("o")== str);


        System.out.println(str.equals(one));
        //_18StringBuilder sb1 = "one";  //doesn`t compile
        System.out.println(one.substring(5, 3).length());

    }




}
    // it allows you to compare the equality of two different objects like ablow str.equals(one) // str = String , one =String builder
    // Doesnt` allow to compare with == different objects
    //Questions :
    /*
    1. - G
    2. - A,C,D - x
    3. - B,C,E
    4. - B
    5. -
    6. -
    7. - B,D,E
    8. - A, E, D
    9. - A

     */


