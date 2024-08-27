package exercise.chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        // CharArray -> String
        char[] chars = { 'a', 'b'};

        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        // Str -> Charray
        char[] chars2 =str1.toCharArray();
        for( char ch: chars2) {
            System.out.println(ch);
        }
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
//        System.out.println(str1.charAt(2));
        System.out.println("--------------------------------");

        // 두 가지 생성 방법
        String str = "Cat";
        String str3 = "Cat"; // 이 두개는 상수 풀에 저장 된다 두개가 같은곳을 봄

        String str4 = new String("Cat");
        String str5 = new String("Cat"); // 이 두개는 힙메모리에 저장된다 서로 다른 메모리 주소를 가르킴


        System.out.println("--------------------------------");

        // 동등 비교 방법 - equals쓰는 습관 들이자
        // == - 항상 두 변수의 메모리 주소값 비교
        // equals - 기본은 == 과 같지만 , 하위 클래스에서 재정의 가능

        System.out.println(str == str3); // true
        System.out.println(str.equals(str3)); // true

        System.out.println(str4 == str5); // 메모리 주소값 비교라서 - false
        System.out.println(str4.equals(str5)); //equals하면 안에있는 cat을 비교함 - ture

        // str , str4

        System.out.println(str == str4); // 주소값이 다르다
        System.out.println(str.equals(str4)); // cat을 비교해서 -true


    }
}
