package exercise.chapter_64.builder;

//빌더 패턴은 복잡한 객체를 쉽게 만들기 위해 사용하는 방법이에요.
//
//보통 객체를 만들 때 생성자에 많은 매개변수를 넣어야 할 때가 있죠. 이럴 때 어떤 값이 어떤 의미인지 헷갈리기 쉽고, 코드도 지저분해집니다.
//
//빌더 패턴을 사용하면:
//
//가독성이 좋아져요: 어떤 값을 설정하는지 코드에서 바로 알 수 있어요.
//유연하게 객체를 만들 수 있어요: 필요한 값만 설정할 수 있어서, 꼭 모든 값을 다 넣지 않아도 돼요.
//메서드 체이닝: 여러 설정을 한 줄로 쭉 이어서 할 수 있어서, 코드를 짧고 간단하게 만들 수 있어요.

//즉, 빌더 패턴은 복잡한 객체 생성 과정을 더 직관적이고 간편하게 만들어주는 도구입니다!
public class BuilderTest { // 3

    public static void main(String[] args) {
        // 적용전
        User user1 = new User("John", "Doe", 30, "sdfoe@dkfose.fd"); // 3 - 1
        // 혹시 순서를 다릏게 넣을수 도있다 -> 빌더패턴으로 해결

        System.out.println("적용 전: " + user1);


        // build()적용 후
        User user2 = new User.UserBuilder() // 3 - 8 빌더 로 new하기
                .firstName("John")
                .lastName("Doe")
                .age(30)
                .email("sdfoe@dkfose.fd")
                .build();


        System.out.println("적용 후: " + user2);
    }


}
