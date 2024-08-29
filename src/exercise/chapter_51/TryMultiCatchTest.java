package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/exercise/chapter_51/test.txt"); //1

            int i = 3; // 0이면 예외터짐
            int data = 100 / i; //2

            String str = "abc";
            System.out.println(str.toUpperCase()); //3

            int index = 10; // 4- 인덱스의 크기보다 많이 잡으면 (10 이상) 예외
            int[] intArr = new int[10];
            System.out.println(intArr[index]);


        } catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        } catch (ArithmeticException | NullPointerException e) { // 이렇게 묶을 수 있다
            System.out.println("Arittmetic Exception 또는 NullPointerException이 발생 했습니다");
            e.printStackTrace();
//        } catch (NullPointerException e) {
//            System.out.println("NullPointerException이 발생했습니다");
//            e.printStackTrace();
//        }
        } catch(Exception e) {
            // 무슨 에러가 뜰지 모를때 일단 이 최상위 catch로 잡으면 종료가 예외 터지고 정상적으로 다음 메소드 실행됨
            System.out.println("최종 Exception 필터에 걸렸습니다.");
            e.printStackTrace();
        }
        System.out.println("메인 메소드는 종료 됩니다");


    }
}

