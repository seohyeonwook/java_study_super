package exercise.chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {

    static final int SIZE = 10000;
    public static void main(String[] args) {
        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for(int i = 0 ; i < SIZE; i++) {
            integerList1.add(i);
        }

        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();

        for(int i = 0; i < SIZE; i ++) {
            integerList2.add(i);
        }

        System.out.println("IntegerList1 :" + integerList1);
        System.out.println("IntegerList2 :" + integerList2);

        //시간 초 비교

        long startTime;
        long endTime;

        // ArrayList
        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) {
            integerList1.get(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("ArrayList Get 요청 걸린 시간: " + (endTime -startTime) +"ms");

        // LinkedList
        startTime = System.currentTimeMillis();
        for(int i = 0; i < SIZE; i++) {
            integerList2.get(i);
        }

        endTime = System.currentTimeMillis();
        System.out.println("LinkedList Get 요청 걸린 시간: " + (endTime -startTime) +"ms");
    }
}
