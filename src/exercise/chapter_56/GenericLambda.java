package exercise.chapter_56;
@FunctionalInterface

public interface GenericLambda<T> { // 7
    T calculate(T t);
    // 클래스이름 변수명 ( 매개변수 )
}
