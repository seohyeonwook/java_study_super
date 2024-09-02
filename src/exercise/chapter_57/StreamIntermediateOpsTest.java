package exercise.chapter_57;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOpsTest { // 3
    public static void main(String[] args) {

        // List
        List<String> fruits = new ArrayList<>(); // 3 - 1
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
        fruits.add("Banananananan");


        // 1. filter(): fruite의 이름의 길이가 6이상인 과일만 선택 - 조건식을 람다식으로 넣는다 // 3 - 2
        fruits.stream().filter((fruit) -> fruit.length() >= 6) . // 안에 들어가는 매개변수 이름은 상관없다
                forEach((fruit) -> System.out.println("Filter적용 : " +fruit));

        System.out.println("===============================");

        // 2. distinct: 증복된 과일 제거 // 3 - 3
        List<String> fruitList = fruits.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct 적용 전:" + fruits);
        System.out.println("Distinct 적용 후:" + fruitList);

        System.out.println("===============================");


        // 3. map: 변화 - 과일 이름을 대문자로 변환 // 3 - 4
        List<String> fruitListMap = fruits.stream()
                .map((fruit) -> fruit.toUpperCase()) // 바꿀 내용
                .collect(Collectors.toList()); // 출력 할때
        System.out.println("Map 이후 : " + fruitListMap);

        System.out.println("===============================");

        List<Integer> fruitListMap2 = fruits.stream()
                .map((fruit) -> fruit.length()) // 바꿀 내용
                .collect(Collectors.toList()); // 출력 할때
        System.out.println("Map 이후 : " + fruitListMap2);

        System.out.println("===============================");

        // 4. Limit : 처음 3개의 과일만 선택 // 3 - 5
        List<String > fruitList3 = fruits.stream().limit(3).collect(Collectors.toList());
        System.out.println("limit 적용 후 : " +fruitList3);

        System.out.println("===============================");

        // 5. skip: 처음 3개의 과일을 제외한 나머지 과일 선택 // 3 - 6
        List<String > fruitList4 = fruits.stream().skip(3).collect(Collectors.toList());
        System.out.println("skip 적용 후 : " +fruitList4);

        System.out.println("===============================");

        // 6. sorted: 과일을 알파벳 순으로 정렬 // 3 - 7
        List<String> fruitList5 = fruits.stream().sorted().collect(Collectors.toList());
        System.out.println("알파벳 순: " + fruitList5);

        System.out.println("===============================");

        // 7. sorted: String 길이 짧은순 으로 정렬 // 3 - 8
        List<String> fruitList6 = fruits.stream()
                .sorted((fruit1, fruit2) -> fruit1.length() - fruit2.length())
                .collect(Collectors.toList());
        System.out.println("String 길이 짧은 순 : " + fruitList6);

    }
}
