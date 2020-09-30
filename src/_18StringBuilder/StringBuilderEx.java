import java.util.ArrayList;
import java.util.List;

public class StringBuilderEx {

    public static void main(String[] args) {


        List<String> removedNonMainProducts = new ArrayList<>();
        removedNonMainProducts.add("1");
        removedNonMainProducts.add("2");
        removedNonMainProducts.add("3");
        removedNonMainProducts.add("4");
        removedNonMainProducts.add("5");
        removedNonMainProducts.add("6");
        removedNonMainProducts.add("8");
        removedNonMainProducts.add("9");
        removedNonMainProducts.add("10");

        System.out.println(removedNonMainProducts.toString());

//        String myString = "";
//
//        for (char c  = 'a'; c <='z'; c++) {
//            myString += c;   // is creating a string every time it`s concatenating.
//        }
//
//        System.out.println(myString);
//
//        _18StringBuilder sb;
//
//
//        // with _18StringBuilder
//
//        System.out.println("--------------------");
//        sb = new _18StringBuilder(); //Create new instance of SB
//        for (char c = 'a'; c <= 'z'; c++) {
//            sb.append(c); // add char to string builder, reuses string builder without creating string each time
//        }
//        System.out.println(sb);
//
//        _18StringBuilder builder = new _18StringBuilder("start");
//        builder.append("-middle"); //"start-middle"
//
//        _18StringBuilder anotherBuilder = builder.append("-end"); // same reference as builder - same ref in the heap
//
//        System.out.println(builder);
//        System.out.println(anotherBuilder);
//        System.out.println(builder == anotherBuilder);
//        System.out.println(System.identityHashCode(builder));
//        System.out.println(System.identityHashCode(anotherBuilder));
//
//        System.out.println("---------------------------------"
//        );
//        _18StringBuilder myBuilder = new _18StringBuilder();
//        System.out.println("size = " + myBuilder.length());
//        System.out.println("capacity =" + myBuilder.capacity());
//
//        myBuilder = new _18StringBuilder(100);
//        System.out.println("size = " + myBuilder.length());
//        System.out.println("capacity =" + myBuilder.capacity());
//
//        myBuilder.append("MyTEsts");
//        System.out.println("size = " + myBuilder.length());
//        System.out.println("capacity =" + myBuilder.capacity());
//
//
//        _18StringBuilder a = new _18StringBuilder("This " );
//        _18StringBuilder b = a.append("Java ");
//        b = b.append("is").append(" so ").append("Cool");
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println("---------------------------");
//        _18StringBuilder sb1 = new _18StringBuilder("uno");
//        sb1.append(", dos, tres, cuatro");
//        sb1.append(3);
//        _18StringBuilder sb2 = new _18StringBuilder(50);
//        sb2 = sb1.append(" hola ");
//        sb2.append("mundo");
//        System.out.println(sb1);
//        System.out.println(sb2);
//        System.out.println(sb1 == sb2);


        /** String Builder Methods
         *
         */

        // charAt(), indexOf(), length(), subString(); - same as String



        StringBuilder sb = new StringBuilder("programming");
        String sub = sb.substring(1,2);
        String sb2 = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        int len = sb.length();
        char ch = sb.charAt(2);
        //System.out.println(ch);

        // append

        StringBuilder b = new StringBuilder().append(1).append("L");
        b.append("-").append(true);
        //System.out.println(b);

        StringBuilder builder = new StringBuilder("programming"); // inseting before index
        builder.insert(7, "-");
        builder.insert(2, 2);
        System.out.println(builder);

        builder.deleteCharAt(2);
        System.out.println(builder);
        builder.delete(7,8);
        builder.delete(7,7); // not change anything //
        System.out.println(builder);

    }
}
