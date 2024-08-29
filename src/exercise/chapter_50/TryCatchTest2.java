package exercise.chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {// try catch catch // uncheck - 자바에서 알려주지않아서 실행해야 알 수 있다
    public static void main(String[] args) {

        System.out.println("메인메소드 실행");


        List<String> stringList =new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("I");
        stringList.add("LOVE");
        stringList.add(null); // catch1
        stringList.add("Coding");

        for(int i = 0; i < stringList.size() + 5; i++ ) { //catch2
            try{
                System.out.println("i: " +i);
                String str = stringList.get(i); // 한번에 다담는게 아니다 하나씩 담아서 출력한다
                System.out.println(str.toUpperCase()); // toUpperCase 대문자로 출력해라

            } catch (NullPointerException e) {
                System.out.println("null은 안돼요");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index는 Array Bound를 넘어갈 수 없습니다.");
                break; //for문이 5번 더돌아야하는데 그냥 끝냄
            }
        }

        System.out.println("메인메소드 종료");
    }
}
