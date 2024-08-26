package exercise.chapter_36;

public interface Flyable {
    // interface - 메소드만 공유?? 한다고 생각해야하나
    // 속성
   long atmosphereLimit = 476; // 대기권
    // 자동 static final 이 적용 돼서 new없이 호출할수 있고 변수를 바꿀수 없다

    default void fly() { // default , static가능
        System.out.println("<정보> 현재 이 사물은 날고 있습니다,");
    }; // 무조건 작성해야함 fly 왼쪽에 동그라미 누르면 구현하고있는 클래스 보여준다
        // 하지만 default 붙이면 무조건 구현안해도된다 + 여기서 구현부 원래 없었는데 구현부 적어줘야함
    static void printLanding() { // static 도 가능
        System.out.println("<정보> 현재 이 사물은 공중에 있습니다,");
    }
}
