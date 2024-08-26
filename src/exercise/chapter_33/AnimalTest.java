package exercise.chapter_33;

// 업캐스팅 -자식 클래스의 객체를 부모 클래스 타입으로 변환하는 것을 말합니다.
//          이를 통해 부모 클래스에서 정의된 메서드와 변수를 사용할 수 있게 됩니다.
//          업캐스팅은 명시적으로 코드를 작성하지 않아도 자동으로 일어납니다.

// 다운 캐스팅 - 업캐스팅된 부모 클래스 타입의 객체를 다시 자식 클래스 타입으로 변환하는 것을 말합니다.
//              다운캐스팅을 통해 자식 클래스의 고유한 메서드나 변수를 사용할 수 있게 됩니다.
//              단,인스턴스의 그대로 돌아 가야함 => 인스턴스의 타입으로만 다운 캐스팅 가능
class AnimalTest { // 다형성
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        feed(animal,"빼빼로");
        feed(animal2,"별레");
        feed(animal3,"모의");



    }

    public static void feed(Animal animal, String food) {
        animal.eat(food); // 오버라이딩 된 3개 출력

    }

}