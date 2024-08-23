package exercise.chapter_29;

// 시나리오 참고
// - 아메리카노 커피 는 물 500ml 와 원두 30g으로 만들어진다
// - 아메리카노 커피 는 테이크 아웃용으로 포장된다
public class Coffee {
    // 속성
    private String coffeeName;
    private long waterQuantity; // ml 단위
    private long coffeeBeanQuantity; // 원두의 양 g 단위
    private boolean isWrappedUp; // 포장 여부

    // 행위
    void beWrappedUp() { // 이 메서드 실행되면 포장이 true로 바뀐다
        this.isWrappedUp = true; // @@ public 붙이는거와 안붙이는 차이가 궁금하다 @@
    }

    // 생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false;
    }

    //getter
    public String getCoffeeName() {
        return coffeeName;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }
}
