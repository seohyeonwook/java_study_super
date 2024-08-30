package exercise.chapter_54;

public class LambdaUseTest {
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10; // 선언
        MultipleNum multipleNum2 = (num) -> num * 20; // 선언

        printNum(multipleNum); // 호출
        printNum2(multipleNum2); // 호출
        // 생략 된다 이것도
        printNum((x) -> x * 100);

        // Generic

        GenericLambda<String> stringGenericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> stringGenericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> stringGenericLambda3 = (myBool) -> myBool & true;

        System.out.println(stringGenericLambda1.calculate("abc"));
        System.out.println(stringGenericLambda2.calculate(100));
        System.out.println(stringGenericLambda3.calculate(true));
    }

    static void printNum(MultipleNum multipleNum){ // 매개변수로 넘어갈때 선언부가 들어간다
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
    static void printNum2(MultipleNum multipleNum){ // 매개변수로 넘어갈때 선언부가 들어간다
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
