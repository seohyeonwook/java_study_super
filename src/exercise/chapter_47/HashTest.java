package exercise.chapter_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class HashTest {
    public static String hashString(String input) {
        try {
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        String password = "1q2w3e4r";
        String hashPassword = hashString(password);
        System.out.println("패스 워드 원본 : " + password);
        System.out.println("패스 워드 해시 : " + hashPassword);


    }
}
