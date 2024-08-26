package exercise.chapter_35; // 추상화 =abstract

public abstract class Animal {
    // 속성
     String gender; // private하게 되면 자식들이 못가진다

    // 행위

    public abstract void eat (String food ); // 구현부 사라짐

    public abstract void sleep ();
}
