package exercise.chapter_57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// Stream API = 컬렉션/ 배열등 을 처리 조작 간단히 하는것
public class StreamTest1 { //1

    public static void main(String[] args) {

        // Stream.of, Arrays.Stream, Collection(= List) -> Stream // 3가지 종류

        // Stream.of
        Stream<String> fruits = Stream.of("Apple", "banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Array.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple", "banana", "Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

        // Collection - 가장 많이 사용 - 걍 이것만 보자
        List<String> fruitsList = new ArrayList<>(); // 1 - 1
        fruitsList.add("Apple");
        fruitsList.add("banana");
        fruitsList.add("Orange");
        fruitsList.add("mango");
        fruitsList.add("Grapes");

        Stream<String> fruit3 = fruitsList.stream(); // 1 - 2
        //stream() 메서드를 사용하면 List의 데이터를 처리할 수 있는 Stream을 생성합니다:

        List<Integer> integerList = new ArrayList<>(); // 1 - 5 // integerList 인티저 리스트
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

        Stream<Integer> integerStream3 = integerList.stream(); // 1 - 6
        // integerStream3 인티저 스트림  위에 리스트랑 다른거 1회용으로 스트림으로 만들어둔거다
        // 기존 데이터는 변경없다 말그대로 1회용으로 스트림에 담은거다
        // 스트림 재사용 불가

        System.out.println("=============================================");

        // Stream 가지고 For-loop  // 1 - 3
        for(String fruit: fruitsList) { // fruitsList에서 하나씩 꺼내서 fruit에 저장
            System.out.println("For -loop로 fruit 산출: " + fruit.toUpperCase());
        }
        System.out.println();

        //for-loop (향상된 for 문)
        //설명: for 문을 사용해서 리스트의 요소를 하나씩 꺼내와서 처리합니다.
        // 어떻게 작동하나요?
        //fruitsList에서 한 번에 하나씩 fruit에 넣고, fruit.toUpperCase()를 호출해서 대문자로 출력합니다.

        // Stream // 1 - 4
        fruit3.forEach( (a) -> System.out.println("forEach로 fruit 산출: " + a.toUpperCase())); // 람다식
        System.out.println();

        //2. forEach (Stream API) - 컬렉션에서도 사용가능
        //설명: Stream의 forEach 메서드를 사용해서 리스트의 요소를 처리합니다.
        //특징:
        //우리가 무엇을 할지만 알려주면, Stream이 알아서 리스트를 반복하면서 처리해줍니다.
        //Stream은 데이터를 흐름처럼 다루기 때문에, 반복의 상세한 부분은 신경 쓰지 않아도 됩니다.

//        차이점 쉽게 정리
//        어떻게 반복하나요?
//
//        For-loop: 우리가 직접 하나씩 꺼내서 처리해요. ("내가 반복 다 할게!")
//        forEach: Stream이 알아서 반복해줘요. ("반복은 내가 알아서 할 테니, 할 일만 알려줘!")
//        코드 스타일
//
//        For-loop: 직접적인 방식이라 코드가 더 구체적이에요.
//                forEach: 간단하고 선언적인 방식이에요. ("이걸 할 거야" 라고만 말하면 돼요.)

        for(Integer integer : integerList) { // 1 - 7
            if(integer % 2 == 0 ) {
                System.out.println("for-loop로 산출: "+ integer);
            }else {
                continue;
            }
        }
        System.out.println();

        integerStream3.filter( (i) -> i % 2 == 0) // 1 - 8  = 1 - 7과 같은 코드 필터 사용한거다
                .filter( ( i) -> i > 4)
                .forEach( i -> System.out.println("forEach로 산출: " + i));
        // 스트림은 한번만 사용 가능 integerStream3 이거 또 사용 불가
    }
}

