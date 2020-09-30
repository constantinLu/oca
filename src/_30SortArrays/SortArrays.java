package SortArrays;

import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);
        Arrays.stream(numbers).forEach(i -> System.out.println(i));

        System.out.println(Arrays.toString(numbers));

        System.out.println("--------");

        String[] strArr = {"50", "9", "500"};

        Arrays.sort(strArr);

        System.out.println(Arrays.toString(strArr));
    }


}
