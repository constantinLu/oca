package MultidimensionalArrays;

import java.util.Arrays;

public class Multi {

    public static void main(String[] args) {

        //ROWS ARE FIRST
        /*  1D - just rows
            2D - ROWS AND COLUMNS - TABLE (like in excel)
            3D - ROWS AND COLUMNS AND MULTIPLE SHEET (EXCEL DOCUMENT);
         */

        // 1D array
        int myArray[] = new int[] {0, 1};

        String[] myDarray = new String[] {"Six", "Seven", "Eight", "Nine"};
        Object[] my1Darray = new Object[] {"Six", "Seven", "Eight", "Nine"};
        double[] dus = new double[] {1.5, 2.4};



        //2D array

        int[][] array = new int[2][4]; // 2 rows and 4 columns;
        int anotherArray[][] = new int[2][3]; //2 rows and 3 columns;

        int[] myIntArray[] = new int[0][];

        String[][] my2Darray = new String[][] {
                {"One", "Two"},
                {"Three", "Four", "Five"},
                {"Six", "Seven", "Eight", "Nine"},
                null
        };

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 4;
        //numberTable[0][3] = 5;


        //3D ARRAYS
        // pages, rows, columns
        int[][][] threeArray = new int[3][3][3];

        int oneMorthreeArray[][][] = new int[3][3][3];

        int[] anotherthree[][];

        int[][][] threeDArray = {
                {{1,2,3}, {4,5,6}, {7,8,9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24,}, null}
        };

        Arrays.stream(threeDArray).forEach(a -> Arrays.stream(a).forEach(s -> System.out.println(Arrays.toString(s))));
    }
}
