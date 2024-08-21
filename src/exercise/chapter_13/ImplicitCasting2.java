package exercise.chapter_13;

public class ImplicitCasting2 {
    public static void main(String[] args) {
        // + * 사칙연산 Casting
        int myInt = 10;
        double myDouble = 55.1;
        double result = myInt + myDouble;
        System.out.println(result);

        int myInt2 = 19;
        long myLong = 20L;
        long result2 = myInt2 * myLong;
        System.out.println(result2);

        // "/"
        int number1 = 10;
        int number2 = 3;
        int result3 = number1 / number2;
        System.out.println(result3); // 인트는 소수점 버리기때문에 소수점은 안나온다
        // 해결법 - float number2 = 3.0f 하고 result3를 인트에 저장하지말고 float에 저장해서 나눈다
    }
}
