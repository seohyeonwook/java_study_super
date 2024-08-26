package exercise.chapter_21; // 다차원 Array

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // 리터럴

        b+= 5;
        System.out.println(a);
        System.out.println(b);

        int [] arr1 = {1,2,3,4}; // new
        int [] arr2 = arr1;

        arr1[0] =10;

        System.out.println(Arrays.toString(arr1));// 1의 0번쨰를 10으로 바꿧는데
        System.out.println(Arrays.toString(arr2));// 2의 0번째도 10으로 바껴있다  왜??
        // java 복사의 종류 -
        // 1. 얕은 복사 = 같은 물건에 여러 이름 붙이는 것
        // 2. 깊은 복사 = 실제로 물건도 이름도 쌍으로 만듬

        // java 리터럴과 객체 복사 차이
        // java 리터럴 = 유일한 물건 그 자체 - 항상 깊은 복사가 되게끔 되어있음
        // java 객체 = 새로 만들어낸 물건

        // java 리터럴 => 유일한 상수여서 항상 값 자체가 복사됨 (=깊은 복사)

        // 해결 방법 ---------------------------------------

        //for loop - 이방법 안쓰는게 좋다 -어렵다
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int [] arr3 = new int[arr.length];
        for(int i = 0; i < arr.length; i++ ) {
            arr3[i] = arr[i];
        }
        // 2번째 방법
        int [] arr4 = Arrays.copyOf(arr, arr.length);
        // 3번째 방법 - 실무에서 가장 많이씀
        int [] arr5 = arr.clone();

        arr[0] = 100;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
    }
}
