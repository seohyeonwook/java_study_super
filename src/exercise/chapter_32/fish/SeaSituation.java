package exercise.chapter_32.fish;

public class SeaSituation {
    public static void main(String[] args) {
//        FishChild fishChild = new FishChild();
//        // 기본 생성자 호출한 적 없는데 printfMyInfo(); 호출하면 기본 생성자 호출된다 이부분에서 호출되는거임
//        // 근데 new는 자식물고기만 했는데 부모 생성자도 같이호출됨 = 자식 new하면 부모도 정의됨
//        // 우리는 보이지 않지만 기본생성자에 super(); 가 있음 부모를 가르키는것
//
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("동해");
//
//        fishChild.printfMyInfo();
//
//        FishChild fishChild1 = new FishChild("Female", true, "서해");
//        // 부모 super는 내가 매개변수 3개넘겨주더라도  super에서는 부모의 변수 다 넣어줘야함
//        fishChild1.printfMyInfo();

        // 핵심 타입 - 다형성
        // 타입선언: 부모, 인스턴스화: 자식
        // 타입선언: 부모, 인스턴스화: 부모
        // 타입선언: 자식, 인스턴스화: 자식
        // 타입선언: 자식, 인스턴스화: 부모 => 묵시적 변환x

        Fish fish1 = new FishChild();
        fish1.eat("새우");
        Fish fish2 = new Fish();
        fish2.eat("새우");
        FishChild fish3 = new FishChild();
        fish3.eat("새우");
//        FishChild fish4 = new Fish(); 이건 안됨
    }
}
