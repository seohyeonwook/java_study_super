package exercise.chapter_17;// 자바 조건문

public class Medal {
    public static void main(String[] args) {
        //
        int myRank = 2;
        String medal;

        switch (myRank) {
            case 1:
                medal = "금메달";
                break;
            case 2:
                medal = "은메달";
                break;
            case 3:
                medal = "동메달";
                break;
            default:
                medal = "메달 없음";
        }
        String result = String.format("선수님의 메달 색깔은 %s입니다", medal);
        // String 은 %s
        System.out.println(result);
    }
}
