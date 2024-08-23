package exercise.chapter_30;

import exercise.chapter_28.Teacher;

public class Student {
    private static int serialNum = 1; // static을 달면 설계도 자체에 영향을 미친다
    // static = 정적 변수 (설계도에 정적으로 있어서) = 클래스 변수 - 설계도에 속함 -프로그램이 처음 시작할 때
    // 프로그램 실행 시, 정적 생석 (인스턴스 생성 전 정의 되어있음)
    // new라는걸로 인스턴스화 시키지 않아도 생성이 된다

    static String city = "Seoul";
    String schoolName;
    private int classYear; // 인스턴스 변수 - 인스턴스 객체에 속한 변수 - 인스턴스가 생성될때 만들어짐
    private int classroomNumbers;
    private int studentNumber;

    private int serialNum2 = 1;

    private int studentID; // student 고유 Id;

    // 기본정보
    private String name;
    private String gender;

    // 정적 메소드
    public static int getSerialNum() {
        return serialNum;
    }
    public static void setSerialNum(int num) { // ( 로컬 변수 ) - 메소드에서 쓰이고 없어짐
        serialNum = num; // this 안됨 인스턴스에서만 가능
        // 안되는 이유 = 스태틱은 클래스와 같이만들어지기 때문에 얘들 입장에서 인스턴스는 아직 만들어지기 전이다
    }

    // 행위 - 클래스 메소드
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s선생님에게 %s과목을 배웁니다.\n",teacherName,subjectName);

    }

    public void printMyInfo() {
        System.out.printf("[Student] schoolName: %s, classYear: %d, classroomNumber : %d," +
                "studentNumber: %d, studentID: %d, name : %s, gender: %s \n",
                this.schoolName, this.classYear, this.classroomNumbers, this.studentNumber,
                this.studentID, this.name, this.gender);
    }


    Student() {
    }
    Student(String name, String gender) { // 이 생성자가 실행된거임

        this("School", 1,3,-1,name,gender);
        // 이 this가 아래를 호출한건가??
    }

    Student(String SchoolName, int classYear, int classroomNumbers, int studentNumber, String name, String gender) {
        this.studentID = serialNum++; // static이 있어서 Id가 1씩 증가한다 serialNum2++ 하고 출력하면 계속 1이됨
        this.schoolName = SchoolName;
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
