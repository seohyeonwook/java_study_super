package exercise.chapter_17;

public class Taxi {
    public static void main(String[] args) {
        // 연속 if문
        // 심야 할증구간: 0~ 4시
        // 시외 할증 기준: 서울x , 서울 외곽o
        int goHomeTime = 3;
        String myHome = "용인";
        int payment = 10_000;

        if( 0 < goHomeTime && goHomeTime < 4) { // and 연산자
            payment = payment + (int) (payment * 0.2); // 10_000 -> 12_000
        } // 여기서 안걸리면 통과한다 그냥 if두개 쓴거임
        if(myHome != "서울") {
            payment = payment + (int) (payment * 0.2); // 12_000 -> 14_400
        }
        String result = String.format("고객님이 내셔야할 돈은 %d입니다",payment);
        System.out.println(result);


    }
}
