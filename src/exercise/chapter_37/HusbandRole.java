package exercise.chapter_37;

public interface HusbandRole {

    void takeCareWife(WifeRole wifeRole);
    default void sayLoveEveryDay() {
        System.out.println("우리 아내 사랑");
    };

    String getName();
}
