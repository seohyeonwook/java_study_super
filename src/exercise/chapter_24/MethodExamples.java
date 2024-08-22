package exercise.chapter_24;

public class MethodExamples {

        // 일반적인 입력값, 출력값도 있는경우
        // 둘 다 하나인 경우
        static int toUnicode(char ch) {
            return (int) ch;
        }


        static int sumAndMultiplyFour(int a, int b) {
            return ( a + b ) * 4;
        }

    public static void main(String[] args) { // 메인에서 호출 해주자
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println(result);

        String res = sayHello(); //sayHello(); 이렇게 호출만해주면 담을 그릇이 없다 앞에 형과 변수명 적어서 그릇만들어주자
        System.out.println(res);

        printHello("안녕하세요");

        printHi();

        // main 메서드에서 출력 하는것과 다른 메서드에서 출력하는것에 차이를 보자 return 형이 있으면 메인에서 출력 한다
    }
//------------------------------------------------------------------------------------------

    // 인자 값이 없을 수 있다, 출력값은 있음.
    static String sayHello() {
            return "Hello";
    }

    // 인자 값이 있는데, 출력값은 없다.
    static void printHello(String str) {
        System.out.printf("함수 안에서 실행합니다. %s \n",str);
    }

    // 인자도 없고 출력도 없다
    static void printHi() {
        System.out.println("Hi");
    }


}
