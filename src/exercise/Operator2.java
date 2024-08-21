package exercise;

public class Operator2 {
    public static void main(String[] args) {
        // 관계 연산자 = 참아니면 거짓으로 나온다 boolean
        int num1 = 10;
        int num2 = 20;
        String str1 = "ABC";
        String str2 = "ABC";

        boolean result = num1 > num2;
        boolean result2 = str1 == str2;
        System.out.println(result);
        System.out.println(result2);

        // 논리 연산자 && || !
        boolean condition1 = 5 < 3;
        boolean condition2 = 4 >= 4;
        boolean result3 = condition1 && condition2 ; // and - 둘다
        boolean result4 = condition1 || condition2 ; // or - 둘중 하나만
        boolean result5 = ! (condition1 || condition2) ; // not - 아니다

        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5); // true 인데 ! 붙였으니까 false가 나와야함

    }
}
