package exercise.chapter_36;

public class Fish extends Animal {
    private boolean havingPoison;
    private String livingSea;

    @Override
    public void eat(String food) {
//        super.eat(food);
        System.out.printf("물고기가 %s 을 주둥이로 먹습니다 \n", food);
    }

    @Override
    public void sleep() {
//        super.sleep();
        System.out.println("물고기가 잠을 자고 있습니다");
    }

    public void swim() {
        System.out.println("물고기가 헤엄을 치고 있습니다.");
    }

}
