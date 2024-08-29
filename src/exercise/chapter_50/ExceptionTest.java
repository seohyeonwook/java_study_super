package exercise.chapter_50;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작 합니다");
//        makeUncheckExceptionTest(); // 10을  넣으면 실행이 안된다 인덱스 크기 초과
        makeCheckedException();

        System.out.println("메인 메소드가 종료 합니다");
    }

    public static void makeUncheckException() {
        int [] intArr ={1,2,3,4,5,6,7,8,9, 10};
        int index = 10;

        System.out.println("값:  " + intArr[index]);
    }

    public static void makeCheckedException() throws FileNotFoundException {
        File file = new File("exercise/chapter_50/test.txt");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("Fs 실행 됩니다");
    }
}
