package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {
    public static void main(String[] args) throws IOException {

        System.out.println("메인 메소드를 실행 합니다");
        FileInputStream fs = null;
        try{

            fs = new FileInputStream("src/exercise/chapter_51/test.txt");

            int i;
            while((i = fs.read()) != -1) {
                System.out.write(i);
            } // 파일 읽는 문법

            int myInt = 0;
            int data = 100 / myInt;



        }catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace(); // 오류 출력
        }catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 생겼숩니다");
            e.printStackTrace(); // 오류 출력
        }catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace(); // 오류 출력
        } finally {
            fs.close(); //이거 해야한다 파일 닫아줘야함

        }
        System.out.println("메인 메소드를 종료 합니다");
    }
}

