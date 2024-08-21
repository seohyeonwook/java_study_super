package exercise.chapter_16;

public class AvocardoSituation {
    public static void main(String[] args) {
        // 장보기 전

        int milks = 0; // 우유 0개
        int avocados = 0; // 아보카도 0개

        boolean existedAvocado = true; // 아보카도 있는가 true

        // 장보기


//        milks = 1;
        if(existedAvocado) {
//            avocados = avocados + 6;
            milks = 6;
        } else {
            milks = 1;
        }

        // 집으로 돌아오기

        String comment = String.format("아내야, 장보고 돌아왔어 %d 개 아보카도, %d개 우유 사왔어,", avocados,milks);
        // %d = 정수 값 의 변수를 넣는
        System.out.println(comment);


        // 삼항연산자 = 조건식 ? 값1(true) : 값2(false)
        int a =( 5 < 4 ) ? 50 : 40;
        System.out.println(a);

        if( 5 < 4 ) {
            System.out.println(50);
        }
        System.out.println(40);
    }

}
