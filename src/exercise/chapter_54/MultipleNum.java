package exercise.chapter_54;

@FunctionalInterface // 람다식은 무조건 인터페이스에
public interface MultipleNum {
    int calculate(int num); //메소드 하나만 있어야한다 // 인터페이스라 구현 부 없다 명시만 되어있음
}
