package exercise.chapter_21;

import java.util.Arrays;

public class TwoDimensionArray1 {
    public static void main(String[] args) {
        //2차원 array
        int [] [] arr1 =new int[10][5]; //10개의 로우와 5개의 컬럼

        int [] [] arr2 = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        System.out.println(Arrays.deepToString(arr1)); // 그냥 toString 아님
        System.out.println(Arrays.deepToString(arr2));

        // indexing
        int myInt = arr2 [0] [2]; // 0번째 줄에 2번 이니까 3에 접근
        int myInt2 = arr2 [2] [3]; // 12
        System.out.println(myInt);
        System.out.println(myInt2);

        // indexing update;
        arr2 [2] [3] = 20; // 12를 20으로 바꾸자
        System.out.println(Arrays.deepToString(arr2));

        //for loop
        for(int row = 0; row < 3; row ++) {
            for(int col = 0; col < 4; col ++) {
                System.out.printf("%d ",arr2[row] [col]);
            }
            System.out.println();
        }
    }
}
