package acd.learnprogramming;


import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static acd.learnprogramming.Config.*;
public class StaticImportsExample {

    public static void main(String[] args) {
        int min = min(5, 7);
        out.println("min = " + min);
        out.println(PI);

        printConfig();

        out.println("name= " + NAME);
        out.println("count= " + MAX_COLUMN_COUNT);
    }

}
