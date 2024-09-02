package exercise.chapter_62;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest1 { // 2 = 메소드 레퍼런스 - 그냥 가독성 높이고 코드 줄이려고 기초안되면 기초 하자 그냥
    public static void main(String[] args) {
        // Consumer<String>은 자바의 java.util.function 패키지에 있는 함수형 인터페이스입니다. - 함수형 인터페이스 보기

        // Static method // 2 - 1
        Consumer<String> ex1 = Printer :: printSomething;// 메소드 레퍼런스
        Consumer<String> ex2 = (str) -> Printer.printSomething(str); // 람다식

        ex1.accept("메소드 레퍼런스 사용");
        ex2.accept("람다식 사용");

        // 빈 생성자 호출 // 2 - 2
        Supplier<Customer> ex3 = () -> new Customer();
        Supplier<Customer> ex4 = Customer :: new;

        System.out.println(ex3.get());
        System.out.println(ex4.get()); // 빈 생성자 호출인데 다른 생성자는 못부르나?? 아래에서

        // 특정 생성자 호출
        Function<String, Customer> ex5 = (str) -> new Customer(str); // 이거 호출하면  String name 생성자 호출 됨
        Function<String, Customer> ex6 =  Customer :: new;


        System.out.println("name 들어간 생성자: " + ex5.apply("이순신"));
        System.out.println("name 들어간 생성자: " + ex6.apply("아이유"));

//        Function<T, R> 인터페이스
//        Function<T, R>은 다음과 같은 구조를 가진 함수형 인터페이스입니다:
//

//        @FunctionalInterface
//        public interface Function<T, R> {
//            R apply(T t);
//        }

//        T: 입력 타입입니다.
//        R: 출력 타입입니다.
//        apply(T t): 입력값을 받아서 처리하고 결과를 반환하는 메서드입니다.



    }
}
