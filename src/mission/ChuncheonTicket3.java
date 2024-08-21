package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args) {
//        - 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
//- Alice(나이: 70, 나라: 미국)
//Kim (나이: 65, 나라: 한국)
//Yoo (나이: 42, 나라: 한국)
//- 각각 손님의 반값 적용 여부가 true 또는 false로 출력되어야 한다.
        int age1 = 70;
        String country1 = "미국";

        int age2 = 65;
        String country2 = "한국";

        int age3 = 42;
        String country3 = "한국";

        // 65세 이상인지 여부를 변수에 저장
        boolean isSenior1 = age1 >= 65;
        boolean isSenior2 = age2 >= 65;
        boolean isSenior3 = age3 >= 65;

        // 반값 할인 적용 여부 확인
        boolean discount1 = isSenior1 && country1.equals("한국");
        boolean discount2 = isSenior2 && country2.equals("한국");
        boolean discount3 = isSenior3 && country3.equals("한국");

        // 결과 출력
        System.out.println("Alice의 반값 할인 적용 여부: " + discount1);
        System.out.println("Kim의 반값 할인 적용 여부: " + discount2);
        System.out.println("Yoo의 반값 할인 적용 여부: " + discount3);



    }
}
