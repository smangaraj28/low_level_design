package array;

import java.util.*;

public class MultiArray {

    public static void main(String[] args) {
//        <data_type>[][] <2d_array_name> = new <data_type>[<rows>][<cols>];
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int cols = 3;
        int[][] arr2 = new int[5][4]; // rows -> 5, columns -> 4

//        int[][] arr5 = new int[][]; // not correct ( row & col are not specified )
        int[][] arr6 = new int[5][]; // rows -> 5, columns -> not specified ( correct ) , jagged array
//        int[][] arr7 = new int[][4]; // rows -> not specified, columns -> 4 ( not correct )

        String[][] key = new String[3][];

        // Jagged 2D array :

//        String[][] arr3 = new String[2][3]; // rows -> 2 , columns -> 3

//        arr2[1][2] = 10;
//        System.out.println(arr2[1][3]); // will print 10
//        System.out.println(arr2[1][1]); // will print 0
//        arr2[3][4] = 15; // Index 4 out of bounds for length 4

        // outer loop will run for each row
        for(int i = 0; i<rows; i++) {
            // inner loop will run for each column
            for(int j = 0; j<cols;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<rows; i++) {
            // inner loop will run for each column
            for(int j = 0; j<cols;j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(arr2);
                // math     science     computer   100 subjects list
        // s1      87         98
        // s2      13         67            90
        // s3      98                       80
    }

    // [ [98, 100], [110], [12,31,34,21,1] , [12] ]
}
