package exercise.chapter_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args) {
        // intdex get
        // 90, 87, 88, 75, 99, 67

        int[] studentScores = {90, 87, 88, 75, 99, 67};
        System.out.println(studentScores[0]); //1번 -특정 인덱스 가져오는법

        int score1 = studentScores[0];
        System.out.println(score1); //2번


        // 배열 숫자 변경
        studentScores[2] = 93; // 0번 부터 시작
        System.out.println(Arrays.toString(studentScores));


    }
}
