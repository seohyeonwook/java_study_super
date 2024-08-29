package exercise.chapter_50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 { // checkexception - 실행하기 전에 빨간줄 뜨는거 - 무조건 try catch해야 할 의무가 있음
    public static void main(String[] args) {
        try{

            FileInputStream fs = new FileInputStream("src/exercise/chapter_50/test.txt");

            int i;
            while((i = fs.read()) != -1) {
                System.out.write(i);
            } // 파일 읽는 문법
        }catch (FileNotFoundException e) {
            System.out.println("File을 찾을 수 없습니다.");
            e.printStackTrace(); // 오류 출력
        }catch (IOException e) {
            System.out.println("입출력 과정에서 문제가 생겼숩니다");
            e.printStackTrace(); // 오류 출력
        }
    }
}
