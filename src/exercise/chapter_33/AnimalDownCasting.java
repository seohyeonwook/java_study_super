package exercise.chapter_33;

public class AnimalDownCasting {
    public static void main(String[] args) {
         // 다운 캐스팅 확인여부

        Animal animal = new Bird(); // 업캐스팅
//        Bird bird = (Bird) animal;
        checkBirdAndFly(animal);

        Animal animal2 = new Animal();
//        Bird bird2 = (Bird) animal2; //안됨
        checkBirdAndFly(animal2);

        Animal animal3 = new Person();
//        Bird bird3 = (Bird) animal3; //안됨
        checkBirdAndFly(animal3);
    }
    static void checkBirdAndFly(Animal animal) {
        if( animal instanceof  Bird ) {
            Bird bird = (Bird) animal; // 다운캐스팅
            bird.fly();
        }
        else {
            System.out.println("너는 새가 아니야");
        }
    }
}
//다운캐스팅은 상위 클래스 타입의 객체를 하위 클래스 타입으로 변환하는 과정입니다.
// 주로 상속 관계에서 사용되며, 업캐스팅의 반대 작업이라고 할 수 있습니다.
//
//        다운캐스팅 개념
//
//업캐스팅: 하위 클래스 객체를 상위 클래스 타입으로 변환하는 것.
//
//예: Animal animal = new Dog();
//이때 animal 변수는 Dog 객체를 참조하지만, Animal 타입으로만 사용할 수 있습니다. // Dog꺼 못씀

//
//다운캐스팅: 업캐스팅된 객체를 다시 원래 하위 클래스 타입으로 변환하는 것.
//
//예: Dog dog = (Dog) animal; // 다시 dog꺼 쓸래
//이때 animal 변수를 Dog 타입으로 변환하여, Dog 클래스의 메서드나 속성에 접근할 수 있게 됩니다.

//
//instanceof 연산자 사용: 다운캐스팅하기 전에 instanceof 연산자를 사용하여 객체가 특정 하위 클래스 타입인지 확인하는 것이 일반적입니다.
//
//java
//코드 복사
//if (animal instanceof Dog) {
//Dog dog = (Dog) animal;
//    dog.fetch();
//}