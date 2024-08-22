package exercise.chapter_25;

public class Student {
    // 속성 - 클래스 필드
    String schoolName;
    int classYear; // 몇 학년
    int classroomNumbers; // 몇 반
    int studentNumber; // 몇 번

    // 기본정보
    String name;
    String gender;

    // 행위 - 클래스 메소드
    void study( Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s선생님에게 %s과목을 배웁니다.\n",teacherName,subjectName);

    }
}
