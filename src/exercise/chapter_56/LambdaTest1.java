package exercise.chapter_56;

public class LambdaTest1 {  //2 // 4
    public static void main(String[] args) {
        MultipleNum multipleNum1 = (x) -> x * 1; // 이걸로 생각하자 리턴문 생략가능 변수 형 생략가능 {} 대신 ->
        MultipleNum multipleNum2 = (i) -> i * 2;
        MultipleNum multipleNum3 = (x) -> {return x * 3; };
        MultipleNum multipleNum4 = (int myInt) -> {return myInt * 4;};
        // 다 같은 식이다

        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(3));
        System.out.println(multipleNum3.calculate(2));
        System.out.println(multipleNum4.calculate(6));

        System.out.println("--------------------------------------------------------");


        StringNum stringNum1 = (x, y) -> System.out.println("String num1: " + x); // 매개변수 두개 인터페이스에서 선언했기때문에 항상 두개써야함
                                                                                    // y 안썼다

        StringNum stringNum2 = (x, y) -> {
            for(int i = 0; i < y; i++) {
                System.out.println("String num2: " +x);
            }
        };
        StringNum stringNum3 =( String x, int y) -> {
            StringBuilder sb = new StringBuilder();// 합쳐서 이어서 붙인다
            for(int i =0; i < y; i++ ){
                sb.append(x);
            }
            System.out.println("String num3: " + sb.toString());
        };

        stringNum1.printString("Hello",5);
        stringNum2.printString("Hello",5);
        stringNum3.printString("Hello",5);

    }
//    public static int multipleNum(int x) {  // 이걸 위에 한줄로 나타낸거임
//        return x * 5;
//    }
}
