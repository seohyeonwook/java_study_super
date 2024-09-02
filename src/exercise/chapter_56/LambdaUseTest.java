package exercise.chapter_56;

public class LambdaUseTest { // 6 // 8
    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num * 10; // 구현 - 다른 메소드의 인자로 보통 사용한다 1 -1
                                                        // MultipleNum 인터페이스 를 구현한거임
        MultipleNum multipleNum2 = (num) -> num * 20; // 구현

        printNum(multipleNum); // 호출 1- 3
        printNum2(multipleNum2); // 호출
        // 생략 된다 이것도
        printNum((num) -> num * 100); // 1- 4 결국엔 이게  1 - 1에 구현부를 호출하면서 바로 넣은거다
                                        // 호출 ( 구현부 )

        System.out.println("=====================================================================");

        // Generic

        GenericLambda<String> stringGenericLambda1 = (str) -> str.toUpperCase();
        GenericLambda<Integer> stringGenericLambda2 = (num) -> num * 2;
        GenericLambda<Boolean> stringGenericLambda3 = (myBool) -> myBool & true;

        System.out.println(stringGenericLambda1.calculate("abc"));
        System.out.println(stringGenericLambda2.calculate(100));
        System.out.println(stringGenericLambda3.calculate(true));
    }

    static void printNum(MultipleNum multipleNum){ // 매개변수로 넘어갈때 선언부가 들어간다 1 - 2
        int result = multipleNum.calculate(5); // 1 - 1 의 num 부분
        System.out.println(result);
    }
    static void printNum2(MultipleNum multipleNum){ // 매개변수로 넘어갈때 선언부가 들어간다
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
