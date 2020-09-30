package SearchingArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchArray {


    public static void main(String[] args) {

        int[] numbers = {5,3,2,1, 6, 0};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 0));

//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));


//        int[] numbersSort = {1, 3, 5, 7, 26, 30, 39, 40, 52};
//        System.out.println(Arrays.binarySearch(numbersSort, 27));
//        System.out.println(Arrays.binarySearch(numbersSort, 1));
//        System.out.println(Arrays.binarySearch(numbersSort, 3));
//        System.out.println(Arrays.binarySearch(numbersSort, 6));
//        System.out.println(Arrays.binarySearch(numbersSort, 4));


    }
}
