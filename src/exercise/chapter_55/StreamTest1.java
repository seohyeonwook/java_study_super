package exercise.chapter_55;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

    public static void main(String[] args) {

        // Stream.of, Arrays.Stream, Collection(= List) -> Stream // 3가지 종류

        // Stream.of
        Stream<String> fruits = Stream.of("Apple", "banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Array.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple", "banana", "Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        // Collection - 가장 많이 사용
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("banana");
        fruitsList.add("Orange");
        fruitsList.add("mango");
        fruitsList.add("Grapes");

        Stream<String> fruit3 = fruitsList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.add(9);
        integerList.add(10);

        Stream<Integer> integerStream3 = integerList.stream();

        // Stream 가지고 For-loop
        for(String fruit: fruitsList) { // fruitsList에서 하나씩 꺼내서 fruit에 저장
            System.out.println("For -loop로 fruit 산출" + fruit.toUpperCase());
        }
        System.out.println();

        // Stream
        fruit3.forEach( (fruit) -> System.out.println("forEach로 fruit 산출: " + fruit.toUpperCase()));
        System.out.println();

        for(Integer integer : integerList) {
            if(integer % 2 == 0 ) {
                System.out.println("for-loop로 산출: "+ integer);
            }else {
                continue;
            }
        }
        System.out.println();

        integerStream3.filter( (i) -> i % 2 == 0)
                .filter( ( i) -> i > 4)
                .forEach( i -> System.out.println("forEach로 산출: " + i));
        // 스트림은 한번만 사용 가능 integerStream3 이거 또 사용 불가
    }
}

