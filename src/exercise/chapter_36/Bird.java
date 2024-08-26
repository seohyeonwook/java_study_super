package exercise.chapter_36;

public class Bird extends Animal implements Flyable {
    private long weight;
    private String color;

    @Override // 추상화 하게 되면 무조건 오버라이딩 해야함
    public void eat(String food) {
//        super.eat(food); 이거 안쓰고 새로 재정의 할거임
        System.out.printf("새가 %s 을 부리로 쪼아 먹고 있습니다. \n", food);
    }
     @Override
     public void sleep() {
         System.out.println("새가 잠을 자고 있습니다");
     }
     @Override
     public void fly() {
         System.out.println("새가 날고 있습니다");
     }
}
