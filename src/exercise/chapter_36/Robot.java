package exercise.chapter_36;

public class Robot implements Walkable {
    private String robotID;
    private String modelName;
    private String color;


    @Override
    public void wolk() {
        System.out.println("로봇ID : "+this.robotID+ "가 걷고있스빈다.");
    }

    public void helpPerson(Person person) {
        String name = person.getName();
        System.out.println("로봇이 인간 " + name + "을 돕습니다.");
    }

    public Robot(String robotID) { // 생성자를 만들어야 new에서 매개변수를 넣을 수 있다
        this.robotID = robotID;
    }
}
