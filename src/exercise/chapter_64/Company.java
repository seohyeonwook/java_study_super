package exercise.chapter_64;

public class Company { //2

    private static Company instance = new Company(); // 2 - 2 얘가 이 전체에서 유일하게 사용 될 인스턴스
                // 자료형(클래스명) 변수명
    // 함부로 값이 바뀌면 안되기때문에 private
    // 여러개가 아니라 단 하나만 있을거기 때문에 static

    private Company() {} // 2 - 1 기본 생성자에 private붙인다
    // 외부에서 이 생성자 호출 하지 못하도록 하겠다 이렇게 되면 CompanyTest에 new 한것들 빨간줄 뜨면서 사용못한다

    public static Company getInstance() { // 2 - 3 외부에서 가져다 쓸수있도록 public하나 만든다 - 자기 자신을 부름
        if(instance == null) { // 만약 instance가 null이면 null을 반환할순 없으니 새로 하나만든다
            instance = new Company();
        }
        return instance;
        // 2 - 4 근데 외부에서 부르려고 하니까 이거 일반 메서드라 결국엔 또 객체를 생성하고 불러야한다 그래서 해결법이
        // static 붙이는거 - static 객체 안만들고 바로 부를 수 있음

    }
}
