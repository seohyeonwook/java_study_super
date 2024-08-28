package exercise.chapter_46;

// 컬렉션 프레임 워크 - collection 과 Map으로 나뉜다
//                      Collection 에는 List(ArrayList) 와 Set
//                      Map은 HashMap
// Data = RAM 에서 차지하는 집( 집 - 메모리 주소)
// 자료구조 = 여러 집들을 특정 규칙으로 묶은 동네
// Structure = Array구조 - 여러 집 일렬로 세워 묶기 - 각집 = 연속적인 메모리 주소  + 1만하면 바로 옆 집을 알수 있다
//
//             Node구조 - 떨어진 여러집을 끈처럼 연결해두는것 - 느리지만 새로운 데이터 추가가 쉽다 왜냐면 연결되어있는게 없기때문에

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {
    public static void main(String[] args) {
        //List 정의
        List<String> fruitList = new ArrayList<>(); // 정의 끝

        // add // 리스트의 끝에 요소를 추가합니다.
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");

        System.out.println(fruitList); // 배열로 넣은 순서대로 출력된다
        System.out.println("FruitList 요소: " +fruitList);

        // add(index, element) // 지정된 인덱스에 요소를 삽입합니다
        fruitList.add(3, "Mango");
        System.out.println("FruitList 요소: " +fruitList);

        // remove(index) // 지정된 인덱스의 요소를 제거합니다.
        fruitList.remove(3);
        System.out.println("FruitList 요소: " +fruitList);

        // get(index) // 지정된 인덱스의 요소를 반환합니다.
        String myFruit = fruitList.get(3);
        System.out.println("가져온 과일은 : " + myFruit);

        // set(index, element) // 지정된 인덱스의 요소를 새로운 요소로 대체합니다
        fruitList.set(1,"PineApple");
        System.out.println("FruitList 요소 : " +fruitList);

        // size // 리스트의 요소 수를 반환 합니다
        System.out.println("리스트 사이즈 : " + fruitList.size());

        // isEmpty //리스트가 비어있는지 여부 를 확인
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList.isEmpty()); // 안비었다
        System.out.println(fruitList2.isEmpty()); //비었다 - true

        // Contains // 리스트에 지정된 요소가 있는지 확인
        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("Apple"));

        // indexOf // 지정된 요소의 첫 번째 등장 인덱스를 반환합니다
        // clear // 리스트의 모든 요소를 제거합니다
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2)); // 0 번째 있어서 0 반환
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit2)); // 없어서 -1 뜬다

        fruitList.clear();
        System.out.println("FruitList 요소 : " +fruitList);



    }
}
