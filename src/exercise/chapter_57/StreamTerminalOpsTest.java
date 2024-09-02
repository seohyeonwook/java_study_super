package exercise.chapter_57; // 연산 --- 중요

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTerminalOpsTest { // 2
    public static void main(String[] args) {

        // List // 2 - 1
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("Banananananan");
        fruits.add("Strawberry");
        fruits.add("Apple");
        fruits.add("Banananananan");
        fruits.add("Banananananan");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Pineapple");

        // 1. forEach(): 출력 에 많이 사용 // 2 - 2 void 와 저장할때의 모습을 잘 보자
        fruits.stream().forEach( (fruit) -> System.out.println("for-Each출력 : " + fruit) );
        // 변수명 . 스트림

        System.out.println("======================");

        // 2. collect: 다른 또는 같은 컬렉션 반환 // 2 - 3
        Set<String>fruitSet = fruits.stream().collect(Collectors.toSet()); // set 중복 제거
        System.out.println("fruitSet: " +fruitSet);

        System.out.println("======================");

        // 3. findFirst(): Stream의 첫번째 값 산출, Optional // 2 - 4
        Optional<String> fruitOptional = fruits.stream().findFirst();
        System.out.println("Optional fruit : " + fruitOptional.orElseGet( () -> "기본과일"));

        System.out.println("======================");

        //List Integers // 2 - 5
        List<Integer> integers  = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);

        // 4. sum , average // 2 - 6
        System.out.println("sum 값은 : " + integers.stream().mapToInt((i) -> i). sum()); // mapToInt - int라는것을 확인
        System.out.println("sum 값은 : " + integers.stream().mapToInt((i) -> i). average());

        System.out.println("======================");

        // 5. count(), max(), min() // 2 - 7
        System.out.println("Stream의 길이: " + integers.stream().count());
        System.out.println("Stream의 가장 Max 값: " + integers.stream().mapToInt((i) -> i).max());
        System.out.println("Stream의 가장 Min 값: " + integers.stream().mapToInt((i) -> i).min());

        System.out.println("======================");

        // 6. reduce() 로 소모 값 구하기 // 2 - 8
        int result = integers.stream().reduce(0,(int1, int2) -> int1 + int2);
        System.out.println("Reduce로 구한 값: " + result);
    }
}
