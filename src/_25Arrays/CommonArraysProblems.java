package Arrays;

import java.util.Arrays;

public class CommonArraysProblems {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        //Arrays.stream(numbers).forEach(i -> System.out.println(i));

        for (int i = 1; i <= numbers.length - 1; i++) {
            System.out.println(i + " - " + numbers[i]);
        }

        int[] nums = new int[20]; //size only at initialization
        int size = nums.length; // length() - is just for LISTS  length - for arrays;

    }




}
