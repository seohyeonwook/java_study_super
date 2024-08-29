package exercise.chapter_51;

// try - catch - finally // try catch 영역이후 구현부에 return이 있어도 무조건 finally실행
//                      // 리소스 해제 할때 사용한다- 파일 읽고나서
public class TryCatchFinallyTest {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행");

        try{
            Integer myInt = 14;
            Integer data = 100 / myInt;

            if(myInt == 14) return;

            System.out.println("data: " + data);

        }catch (ArithmeticException e) {
            System.out.println("MyInt는 0이 될 수 없습니다.");
            e.printStackTrace();
        } finally { // 무조건 실행 에러 종류 달라서 잡지못해서 밑에 메인메소드 종료문 안떠도 이건 무조건 뜸
                    // 만약 예외가 안터져도 이건 무조건  실행 / retun이 있어도 무조건 실행

            System.out.println("여기는 무조건 실행되는 Finally영역입니다.");
        }

        System.out.println("메인 메소드 종료");
    }
}
