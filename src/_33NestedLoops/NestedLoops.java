package NestedLoops;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

        for (int h = 1; h <= 6; h++) {
            for (int m = 0; m < 60; m++) {
                System.out.println(h + ":" + m);
            }
        }

        int[][] myArray = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(myArray);
        System.out.println();
        System.out.println(Arrays.toString(myArray));


        OUTER:
        for (int[] rowArray : myArray) {
            INNER:
            for (int i = 0; i < rowArray.length; i++) {
                if(rowArray[i] % 2 == 0) {
                    continue INNER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }
    }
}
