package exercise.chapter_37;

public interface FamilyRole extends DaddyRole,HusbandRole{
    @Override
    default void sayLoveEveryDay() { // 디폴트
        DaddyRole.super.sayLoveEveryDay();
        HusbandRole.super.sayLoveEveryDay();
    }
}
