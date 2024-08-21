package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionAdd {
    public static void main(String[] args) {
        // 2개의 2d array를 더하자

        int [] [] arr1 = {
                {12,100,25,33},
                {70,23,41,110},
                {23,4,55,66}
        };
        int [] [] arr2 = {
                {12,11,44,12},
                {70,32,53,76},
                {23,4,32,11}
        };

        int [] [] resultArr = new int[3][4]; // 빈 배열 만들기

        for(int row = 0; row <3; row++) {
            for(int col =0; col <4; col++) {
                resultArr[row] [col] = arr1[row] [col] + arr2[row] [col];
                System.out.printf( "%d ",resultArr[row] [col]);
            }
            System.out.println();
        }

//        System.out.println(Arrays.deepToString(resultArr));
    }
}
