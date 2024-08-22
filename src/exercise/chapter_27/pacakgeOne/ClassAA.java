package exercise.chapter_27.pacakgeOne;

public class ClassAA {
    void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();// 접근가능

    }

    void testPrivate(ClassA classA) {
//        String str = classA.privateStr;
//        classA.methodPrivate(); // 접근 불가능
    }
}
