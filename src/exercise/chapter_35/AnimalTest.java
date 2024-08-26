package exercise.chapter_35;

class AnimalTest { // 추상화
    public static void main(String[] args) {
//        Animal animal = new Animal(); // 추상클래스로 만들어서 new못한다
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();
//        feed(animal,"빼빼로");
        feed(animal2,"별레");
        feed(animal3,"모의");
        feed(animal4,"김밥");
        feed(animal5,"고기");



    }

    public static void feed(Animal animal, String food) {
        // 객체를 호출하기 위해서 객체 매개변수로 받음
        animal.eat(food); // 오버라이딩 된 3개 출력

    }

}