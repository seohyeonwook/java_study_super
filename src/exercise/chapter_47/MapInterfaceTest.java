package exercise.chapter_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {
    public static void main(String[] args) {
        // Map 정의 key ,value

        Map<String, Integer> fruitmap = new HashMap<>();

        // put // 특정 키에 대응하는 값을 Map에 추가
        fruitmap. put("Orange", 5);
        fruitmap. put("Apple", 10);
        fruitmap. put("Banana", 3);
        fruitmap. put("Kiwi", 20);
        System.out.println("Map : " + fruitmap); // 순서대로 안나옴

        // Get // 주어진 키에 대응하는 값을 반환 . 키가 존재하지않으면 null

        Integer appleCount = fruitmap.get("Apple");
        Integer appleCount2 = fruitmap.get("Banana");
        System.out.println("사과 갯수: " + appleCount);
        System.out.println("바나나 갯수: " + appleCount2);

        // Contains // 주어진 키가 Map에 존재하는지 확인 boolean
        Boolean isApple = fruitmap.containsKey("Orange");
        Boolean isMango = fruitmap.containsKey("Mango");
        System.out.println("Apple 있는지" + isApple);
        System.out.println("Mango 있는지" + isMango);

        // Remove // 주어진 키에 대응하는 항목을 Map에서 제거
        fruitmap.remove("Apple");
        System.out.println("fruitMap : " + fruitmap);

        // size
        System.out.println("fruit사이즈 :" + fruitmap.size());

        // keySet // key 만 알고싶다
        System.out.println("fruit :" + fruitmap.keySet());

    }

}
