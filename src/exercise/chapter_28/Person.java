package exercise.chapter_28;

public class Person {// this는 다른 생성자를 호출 할 수 있다

    private String name;
    private String gender;
    private int age;

    public void showmyself() {
        System.out.printf("Person 인스턴스: name: %s, gender: %s, age: %d\n",this.name,this.gender,this.age);
    }

    public Person(String name) {
        this(name,  "unknown");
    }


    public Person(String name, String gender) {
        this(name, gender, -1); //생성자를 호출하기위해
    }

    public Person(String name, String gender, int age) {
        this.name = name; // 나자신을 호출하기 위해
        this.gender = gender;
        this.age = age;
    } // alt + insert  + constructor 해서 3개다 클릭하면
}
