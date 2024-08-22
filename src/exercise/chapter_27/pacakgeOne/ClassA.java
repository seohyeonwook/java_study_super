package exercise.chapter_27.pacakgeOne;

public class ClassA {
    // publish
    public String publicStr; // 어디에서나 가능

    // private
    private String privateStr; // 같은 클래스 안에서만 근데 가지고 오고싶으면 get set 을 사용하면 가져올수있다

    // default
    String defaultStr; // 같은 패키지 안에서만 가능 ClassB에서는 불가능 AA에서는 가능

    public void methodPublic(){};

    private void methodPrivate(){};

    void methodDefault(){};

    void testPrivate() {
        String str = privateStr; // 같은 클래스 안에서는 가능
        methodPrivate();
    }
}
