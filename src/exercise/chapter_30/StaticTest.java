package exercise.chapter_30;

public class StaticTest {
    public static void main(String[] args) {
        // 클래스 변수 - new안해도 접근 가능하다
        int num = Student.getSerialNum(); //static으로 바꾸기
        String city = Student.city; //cv
        System.out.println(num);
        System.out.println(city);

        Student.setSerialNum(10); // 1을 10으로 바꿔준다 그럼 아래 인스턴스화에서 Id가 10부터 순서대로 나온다

//        String school = Student.schoolName; // 이건 cv가아니라서 인스턴스를 하고나서 접근해야한다

        // 4명 만들어 보기
        Student student1 = new Student("Alice","Female");
        Student student2 = new Student("Tom","Male");
        Student student3 = new Student("Taylor","Female");
        Student student4 = new Student("Mike","Male");

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
    }
}
