package exercise.chapter_26; // 자바 클래스와 객체

public class ClassroomDay {
    public static void main(String[] args) {
        // 인스턴스 생성
        Student student1 = new Student("school", 1,3,20,"bob","Male");
        Student student2 = new Student("school", 1,3,25,"Alice","Female");
        Student student3 = new Student("school", 1,3,30,"Taylor","Female");
        Student student4 = new Student("school", 1,3,43,"Lula","Female");

        Teacher teacher = new Teacher("Tom", "Female","꾹어","AB002");

        String subjectName = "국어";
        // 본격 적인 로직 흐름 시작
        teacher.teach(student1, subjectName); // 호출
        student1.study(teacher,subjectName);

        teacher.teach(student2, subjectName);
        student2.study(teacher,subjectName);

        teacher.teach(student3, subjectName);
        student3.study(teacher,subjectName);

        teacher.teach(student4, subjectName);
        student4.study(teacher,subjectName);
    }
}
