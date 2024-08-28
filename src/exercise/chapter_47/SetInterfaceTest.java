package exercise.chapter_47;// set - 중복 없는 컬렉션 (검색할떄 )

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {
    public static void main(String[] args) {

        // Set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        // Add // Set에 요소 추가 이미 있으면 false반환 없으면 true 반환
        fruitSet. add("Orange" );
        fruitSet. add("Apple" );
        fruitSet. add("Banana");
        fruitSet. add("Kiwi");
        System.out.println("fruitSet: " +fruitSet); // Map과 마찬가지로 순서 없음

        // Add 중복 x
        fruitSet. add("Apple" );
        fruitSet. add("Mellon" );
        System.out.println("fruitSet: " +fruitSet);

        // Set은 순서 x중복 x
        // List 는 순서o 중복o

        // Remove // Set에서 주어진 요소 제거
        fruitSet.remove("Apple");
        System.out.println("Remove : " + fruitSet);

        // Contains // 요소가 있는지 확인
        System.out.println(fruitSet.contains("Apple 있는지 : " + fruitSet));

        // Size // 요소 크기
        System.out.println("fruitSet 크기 : " + fruitSet.size());

        // Clear // 요소 제거
        fruitSet.clear();

        // isEmpty // 비어있는지 확인
        System.out.println("Set이 비어있는지?? : " + fruitSet.isEmpty());

    }
}
