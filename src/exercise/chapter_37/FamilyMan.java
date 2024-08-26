package exercise.chapter_37;

public abstract class FamilyMan  implements FamilyRole {
    protected String name;

    @Override
    public void educateBaby(Baby baby) {
        String name = baby.getName();
        System.out.println(name + " 아기를 교육 하고 있습니다.");

    }

    @Override
    public void takeCareWife(WifeRole wifeRole) {
        String name = wifeRole.getName();
        System.out.println(name +"인 아내를 성심성의껏 케어합니다");

    }

}
