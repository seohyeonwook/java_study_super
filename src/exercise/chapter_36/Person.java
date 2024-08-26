package exercise.chapter_36;

public class Person extends Animal implements Walkable{
    private String name;
    private String jop;
    private int height;

    @Override
    public void eat(String food) {
//        super.eat(food);
        System.out.printf("사람이 %s을 젓가락으로 먹는다 \n", food);
    }


    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("사람이 자고있스빈다");
    }


    public String getName() {
        return name;
    }

    @Override
    public void wolk() {
        System.out.println("사람이 걷고 있스빈다");
    }

    public void setName(String name) {
        this.name = name;
    }
}
