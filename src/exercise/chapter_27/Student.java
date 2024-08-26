package exercise.chapter_27; // 자바 정보 은닉 (캡슐화)

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

    // 생성자 - 오버로드 생성자 이름이 같아도 매개변수 다르면 됨
    Student() { // 기본생성자 내가 아무것도 안해도 생성자 만들면 자동으로 만들어진다 원래 안보임
                // 오버로드 할때는 기본생성자 하나 만들어 줘야함
    }
    Student (String pName, String pGender) { // 이렇게 똑같은 Student 이지만 하나는 매개변수 없고 하나는 2개 하나는6개로 만들수있다
        name = pName;
        gender = pGender;
    }

    Student(String pSchoolName, int pClassYear, int pClassroomNum, int pStudentNum, String pName, String pGender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classroomNumbers = pClassroomNum;
        studentNumber = pStudentNum;
        name = pName;
        gender = pGender;
    }

    public String getName() {
        return name;
    }
}
