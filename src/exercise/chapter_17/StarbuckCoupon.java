package exercise.chapter_17;

public class StarbuckCoupon {
    public static void main(String[] args) {

        boolean clearCondition1 = true;
        boolean clearCondition2 = false;
        boolean clearCondition3 = false;
        boolean clearCondition4 = false;

        if( clearCondition1 ) {
            if(clearCondition2) {
                if (clearCondition3) {
                    if (clearCondition4) {
                        System.out.println("스벅 쿠폰 이벤트 신청 할 수 있게 되었습니다.");
                    }

                }else {
                    System.out.println("아니요 , 3번 만족 못했습니다");
                }

            } else {
                System.out.println("아니요 , 2번 만족 못했습니다");
            }

        } else {
            System.out.println("아니요 , 1번 만족 못했습니다");
        }

        // 그냥 논리 연산자로 한줄로 코드 줄일 수 있다
        if( clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4) {
            System.out.println("논리 연산자,스벅 쿠폰 이벤트 신청 할 수 있게 되었습니다.");
        }else {
            System.out.println("논리 연산자 만족 못했습니다");
        }
    }
}
