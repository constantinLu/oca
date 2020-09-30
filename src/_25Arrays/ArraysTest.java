package Arrays;

import java.util.Arrays;
public class ArraysTest {
    public static void main(String[] args) {

        /* can contain duplicates
               primitives => prints 0;
               objects => prints nulls;
               on objects = > if one is null it prints null
         */

        String[] nums = {"three","two","one"};
        //java.util.ArraysTest.stream(nums).forEach(num -> System.out.println(num));

        //empty array
        int[] arr = new int[3];
        Arrays.stream(arr).forEach(n -> System.out.println(n));


        Object[] arrObj = new Object[5];
        Arrays.stream(arrObj).forEach(nO -> System.out.println(nO));

        System.out.println("-------------");

        //initialized array
        int[] number = new int[]{10,12,13};
        Arrays.stream(number).forEach(n -> System.out.println(n));



        Object[] objAr = new Object[]{ "_13CharArthimetic", 3, null};
        Arrays.stream(objAr).forEach(nO -> System.out.println(nO));


        System.out.println("====================");

        int[] two = new int[]{10, 11, 12}; // initialized array with 3 elements;

        double[] a = new double[5 * 4 / 2]; // empty array with 10 elements

        //anonymus array
        int[] three = {10, 11, 12};
        Arrays.stream(three).forEach(n -> System.out.println(n));

        //anonymus of lenght 0
        int[] four = {};
        Arrays.stream(four).forEach(n -> System.out.println(n));


        ///DECLARING ARRAY
        int[] a1;
        int [] a2;
        int a4[];

        int[] ids, types; // creates 2 arrays;
        int ods2[], types2; // creates 1 array 1 int;


        String[] anim = {"Parrot", "Cow", "Pig"};
        String[] anim2 = {"Parrot", "Cow", "Pig"};
        String[] myAnim = anim;
        System.out.println(anim == anim2);
        System.out.println(anim == myAnim);
        System.out.println(anim.equals(myAnim));
        Arrays.equals(anim, myAnim);

        System.out.println(anim);
        System.out.println(anim.toString());
        System.out.println(Arrays.toString(anim));

    }
}
