package VarArgs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    public static void main(String... args) {

//        public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println(Arrays.toString(args));

        print(args);
        print("Java");
        print("this", "is", "myString", "array");
    }

    private static void print(String... myArgs) {
        System.out.println(Arrays.toString(myArgs));
    }
}
