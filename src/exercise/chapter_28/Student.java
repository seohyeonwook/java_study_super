package exercise.chapter_28;

public class Student {
    // 속성 - 클래스 필드
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumbers; // 몇 반
    private int studentNumber; // 몇 번

    // 기본정보
    private String name;
    private String gender;

    // 행위 - 클래스 메소드
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s선생님에게 %s과목을 배웁니다.\n",teacherName,subjectName);

    }


    Student() {
    }
    Student (String name, String gender) { // this로 호출
//        this.name = name;
//        this.gender = gender;
        this("School", 1,3,-1,name,gender);
    }

    Student(String SchoolName, int classYear, int classroomNumbers, int studentNumber, String name, String gender) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumbers = classroomNumbers;
        this. studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
