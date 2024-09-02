package exercise.chapter_63;

public class PrintNumberRunnable implements Runnable{ //2 - implements 해야함

    int start;
    int end;

    public PrintNumberRunnable(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i ++) {
            System.out.printf(i + " ");
        }
    }
}
