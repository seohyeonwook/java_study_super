package exercise.chapter_58;// 입출력 스트림

import java.io.IOException;
import java.io.InputStream;

public class ConsoleTest { // 1
    public static void main(String[] args) {
        int i = 0;

        System.out.println("입력값을 넣어주세요.");
        try {
            StringBuilder sb = new StringBuilder();
            while ( ( i = System.in.read()) != '\n' ) {
                sb.append((char) i);
            }
            System.out.println("String 출력: "  + sb);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
