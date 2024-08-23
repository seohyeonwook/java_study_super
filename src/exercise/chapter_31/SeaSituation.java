package exercise.chapter_31;

public class SeaSituation {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild(); // 상속했기때문에 Fish객체 속성 사용가능
        fish2.setSex("Female");
        fish2.setLeavingSea("서해");
        fish2.setHavingPoison(false);

        fish1.printfMyInfo(); // 일반클래스에서 프린터문 만들어두고 여기서 호출만
        fish2.printfMyInfo();

        fish2.digging();
    }
}
