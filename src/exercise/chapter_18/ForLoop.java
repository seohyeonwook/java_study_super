package exercise.chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        // for ( 초기화식; 조건식; 증감식 ) {
        //          실행문장; - 조건이 참이면 반복
        //} 조건이 거짓이면 for문 종료

        int sum = 0;

        for( int num =1; num <= 10; num ++) {
            sum += num;
        }
//        System.out.println("1~10까지 더한 수는 %d 입니다", sum); - 빨간줄
        System.out.printf("1~10까지 더한 수는 %d 입니다", sum);
        System.out.println();
        System.out.println("1~10까지 더한 수는" + sum + "입니다" );
        // 자바에서 System.out.println 메서드는 포맷팅된 문자열을 출력할 수 없기 때문에 문제가 발생합니다.
        // 자바에서 포맷팅된 문자열을 출력하려면 System.out.printf 또는 String.format을 사용해야 합니다.

    }
}
