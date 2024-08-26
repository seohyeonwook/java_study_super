package exercise.chapter_32;

public class FishChild extends Fish {

    // 상속 1. 자식의 특성은 부모특성을 물려받는다
    //      2. 자식의 행위는 부모행위를 물려받는다
    // 사용 이유- 코드 재사용성 / 유지보수성
    // this = 자기 자신 나의 iv

    private boolean eatable;

    // 새로운 메소드
    public void digging() {
        System.out.println(myInfo() + " 가 모래를 파고 있습니다.");
    }

    public boolean isEatable() { // getter인데 boolean값은 is로 나온다
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger() {
        this.havingPoison = true;
    }

    // 오버라이딩 - 부모클래스의 기존 행위를 수정 하고 싶을 때
    @Override // 부모가 가지고 있는 행위를 내가 재정의  (바꾼다는 뜻) ctrl + o
    void eat(String food) {
        System.out.printf(myInfo() + "는 %s를 아주 열심히 먹고 있습니다. \n", food);
    }

    void printSea() {
        System.out.println(myInfo() + "는" + this.leavingSea+ "바다 출신이고," +
                "부모 물고기는 " + super.leavingSea + "바다 출신이야.");
    }



    FishChild() { // 기본 생성자
        // super(); // 부모 가르키는것 나는 안보이지만 기본적으로 있다
//        System.out.println("자식 클래스 생성 되고 있습니다.");

    }

    public FishChild(String sex, boolean eatable, String leavingSea) {
        super(sex, true, "2022", "2022", leavingSea);
        this.eatable = eatable; // 부모클래스에 없는것
    }

}
