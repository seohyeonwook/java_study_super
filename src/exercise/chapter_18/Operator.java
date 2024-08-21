package exercise.chapter_18;

public class Operator {
    public static void main(String[] args) {
        // 복합 대입 연산자 - 증감 연산자
        // += 기존 변수의 값에 값을 더합니다
        // -= 기존 변수의 값에 값을 뺍니다
        // *= 기존 변수의 값에 값을 곱합니다
        // /= 기존 변수의 값에 값을 나눕니다
        // eg) num1 += 2;
        //     num 1 = num1+ 2와 같음

        // += , *=
        int myInt = 5;
        myInt *= 10;
        System.out.println(myInt);

        // 단항 연산자 ++
        int myInt2 = 10;
//        myInt2++;
        // ++ 위치에 따라 다르다
        // 앞에 있으면 먼저 더하고 명령 구문 부르고
        // 뒤에 있으면 명령 구문 부르고 뒤에 더해
        System.out.println(++myInt2); // 11
        System.out.println(myInt2 ++); // 11
        System.out.println(myInt2); // 12
    }


}
