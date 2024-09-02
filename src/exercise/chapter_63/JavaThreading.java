package exercise.chapter_63;
//멀티쓰레드는 하나의 프로그램에서 여러 작업을 동시에 처리할 수 있게 해주는 기능입니다.
//
//멀티쓰레드 간단 요약
//쓰레드: 프로그램 내에서 독립적으로 실행되는 작은 작업 단위입니다.
//        멀티쓰레드: 여러 쓰레드가 동시에 실행되어, 프로그램이 여러 작업을 병렬로 처리할 수 있게 해줍니다.
//        예시로 이해하기
//        예를 들어, 유튜브 앱을 사용한다고 생각해보세요:
//
//비디오 재생 쓰레드: 비디오를 재생합니다.
//댓글 로딩 쓰레드: 댓글을 불러옵니다.
//추천 영상 로딩 쓰레드: 추천 영상을 보여줍니다.
//이처럼 멀티쓰레드를 사용하면, 비디오를 보면서 동시에 댓글을 읽거나 추천 영상을 볼 수 있게 됩니다. 각각의 작업이 별도의 쓰레드에서 실행되기 때문입니다.
//
//요약
//멀티쓰레드는 프로그램이 여러 작업을 동시에 할 수 있게 해주는 기능입니다.
//이를 통해 프로그램이 더 빠르고 효율적으로 실행될 수 있습니다.
//멀티쓰레드는 복잡한 작업을 동시에 처리하거나 응답성을 높여야 할 때 매우 유용합니다.

public class JavaThreading { // 1

    public static void main(String[] args) {
        // Thead 실행
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        System.out.println("Thread" +Thread.currentThread().getName()+ ": 실행 하고 있습니다");

        thread1.start();
        thread2.start();

        System.out.println("Thread" +Thread.currentThread().getName()+ ": 실행 하고 있습니다");

    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread" +Thread.currentThread().getName()+ ": 실행 하고 있습니다");
        }
    }
}
