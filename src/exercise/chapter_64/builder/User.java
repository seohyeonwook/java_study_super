package exercise.chapter_64.builder;

public class User { // 4
    private String firstName;
    private String lastName;
    private int age;
    private String email;

    public User(String firstName, String lastName, int age, String email) { // 기본 하던 방식 new 아래는 빌더패턴
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }

    private User(UserBuilder userBuilder){ // 3 - 2 UserBuilder 생성안했는데 3 - 3 에서 정적클래스로 생성해준다

        this.firstName = userBuilder.firstName; // 3 - 7 this로 연결 해주기
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.email = userBuilder.email;
    }

    static class UserBuilder { // 3 - 3 정적 클래스 생성해주고 변수들 가지고 온다
        String firstName;
        String lastName;
        int age;
        String email;

        public UserBuilder() { // 3 - 4 그리고 빈 생성자 만들어준다 (클래스 내부에

        }

        public UserBuilder firstName(String firstName) {
            // 3 - 5 그리고 메소드도 하나만드느데 메소드이름을 보통 자기 필드이름으로만든다
            // 이렇게 총 변수 개수만큼 만든다
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build() { // 3 - 6 자기자신 User를 반환하는 메소드 만든다
            return new User(this);
        }
    } // 여기까지가 빌더 패턴 아래는 기본 생성자 getter

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
