package exercise.chapter_14;

public class Encoding {
    public static void main(String[] args) {
        // "z" -> int
        char ch1 ='Z';
        System.out.println(ch1);
        System.out.println((int) ch1);

        // int -> char
        int num = 66;
        System.out.println(num);
        System.out.println((char) num);

        // 대소 비교
        char smallA = 'a';
        char largeA = 'A';
        boolean result = smallA > largeA;
        System.out.println(result);

    }
}
