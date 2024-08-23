package exercise.chapter_31;

public class FishChild extends Fish{

    // 상속 1. 자식의 특성은 부모특성을 물려받는다
    //      2. 자식의 행위는 부모행위를 물려받는다
    // 사용 이유- 코드 재사용성 / 유지보수성

    private boolean eatable;

    // 새로운 메소드
    public void digging() {
        System.out.println(myInfo() + " 가 모래를 파고 있습니다.");
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }
}
