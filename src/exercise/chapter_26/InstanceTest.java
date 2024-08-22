package exercise.chapter_26;

public class InstanceTest {
    // 실행 클래스 - 메인 메소드가 있는 메소드 / 로직 실행 가능한 실행 클래스 - 이야기가 벌어지고있는 공간이라고 생각하자
    // 일반 클래스 - 메인 메소드가 없는 클래스 / 객체가 설계된 일반 클래스
    public static void main(String[] args) {
        // 짱구 곤약젤리마냥 찍어낸다고 생각하자 학생 4명을 만든다고 생각
        Student student1 = new Student("School", 1, 3, 20, "Bob","Male" );

//        student1.name= "Bob";
//        student1.gender= "Male";
//        student1.schoolName = "School";
//        student1.classYear = 1;
//        student1.classroomNumbers = 3;
//        student1.studentNumber = 20;   원래 이런작업을 해야하는데 매개변수로 받으면 이렇게 .찍어서 접근 안해도 된다

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.studentNumber);

        Student student2 = new Student("School", 1, 3, 15, "Alice","Female");
//        student2.name= "Alice";
//        student2.gender= "Female";
//        student2.schoolName = "School";
//        student2.classYear = 1;
//        student2.classroomNumbers = 3;
//        student2.studentNumber = 15;


        Student student3 = new Student();

        Student student4 = new Student();

        Teacher teacher = new Teacher("Tom","Femaile","korean","AB001");

        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectName);
        System.out.println(teacher.subject.subjectCode); // teacher클래스 보자


    }
}
