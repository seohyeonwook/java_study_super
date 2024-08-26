package exercise.chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.atmosphereLimit); //인스턴스화 없이 스태틱이라 바로 출력가능
//        Flyable.atmosphereLimit = 100; final이라 변수 못바꿈

        //Flyable
        Flyable bird = new Bird(); // Bird / Animal / Flyable 3개 타입 다 된다
        Flyable airplane = new Airplane("AB1111");
        bird.fly();
//        bird.eat(); // 당연히 Flyable 타입으로 했으니까 다른 타입에 메서드
//        못쓴다 만약 사용하고싶으면 다운캐스팅하자
        airplane.fly();

        //Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        // 다운캐스팅해야하는데 Walkable 에 person이름이 있어서 Person으로 다시만듬
        person2.setName("아이유");

        Walkable robot = new Robot("RDD@123");
        person.wolk();
        robot.wolk();

        if( robot instanceof Robot) { // 다운캐스팅
            Robot robot1 = (Robot) robot;
            robot1.helpPerson(person2);

        }

    }
}
