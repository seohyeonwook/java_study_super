package exercise.chapter_50; // 에러와 예외는 다른거다

public class TryCatchTest1 { // try catch  // uncheck - 자바에서 알려주지않아서 실행해야 알 수 있다
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행합니다");

        try{
            int i = 3;
            int data = 50 / i; // 오류 안뜨면 catch문 실행 안한다
            System.out.println("data: " +data); // 오류 뜨면 이거 실행 안하고 바로 catch로 간다

        } catch (ArithmeticException e) { // 오류 떳을때 실행 구문
            System.out.println("0으로는 나눌 수 가 없습니다.");
            System.out.println("data: " + 0);
            e.printStackTrace(); // printStackTrace = 무슨에러인지 볼 수 있다 어디서 발생했는지도 볼 수 있다
        }


        System.out.println("메인 메소드 종료합니다");
    }
}
