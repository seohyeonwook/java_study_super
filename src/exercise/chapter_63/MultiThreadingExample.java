package exercise.chapter_63;

public class MultiThreadingExample { // 3
    public static void main(String[] args) {
        // 1 ~ 100 까지 출력하는데  Multi threading 일 분담해서 실행

        //2명 Thread
        Thread thread1 = new Thread(new PrintNumberRunnable(1, 50));
        Thread thread2 = new Thread(new PrintNumberRunnable(51, 100));

        thread1.start(); // 같이 동시에 ㅅ실행되는거라 순서가 없다
        thread2.start();

    }
}
