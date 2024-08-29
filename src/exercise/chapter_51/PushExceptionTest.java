package exercise.chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 예외 미루기 호출한 곳으로 예외를 미룬다 - 메서드마다 예외처리하면 힘드니까 호출한곳에서 한번에 처리한다
// 주의 사항 = ㅁㅔ인 메소드는 미루면 안됨
public class PushExceptionTest {
    public static void main(String[] args) {

        try{ // 여기서 처리하자
            printFile("src/exercise/chapter_51/test.txt");

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void printFile(String fileName) throws FileNotFoundException, IOException { // 호출한 애가 또 미룬다
        FileInputStream fs = getFileStream(fileName);

        int i;
        while ((i = fs.read()) != -1) {
            System.out.write(i);
        }
    }

    static FileInputStream getFileStream(String filename) throws FileNotFoundException { //throws - 미루기 - 날 호출하는애가 처리해

        FileInputStream fs = new FileInputStream(filename);
        return fs;
    }
}
