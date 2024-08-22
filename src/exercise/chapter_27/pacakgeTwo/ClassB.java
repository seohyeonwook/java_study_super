package exercise.chapter_27.pacakgeTwo;

import exercise.chapter_27.pacakgeOne.ClassA;

public class ClassB {
    public void testPublish(ClassA classA){
        String str = classA.publicStr;
        classA.methodPublic();
    }

//    public void testPrivate(ClassA classA){
//        String str = classA.privateStr;
//        classA.methodPrivate(); // 접근불가

}
