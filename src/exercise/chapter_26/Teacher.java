package exercise.chapter_26;

public class Teacher {
    // 속성

    // 학교 정보
    String schoolName;

    //담당 과목
    Subject subject;

    //기본 정보
    String name;
    String gender;

    // 행위
    void teach(Student student, String subjectName) { // 매개변수 받는건 이름 상관없다 그냥 쉬우라고 표시하는것뿐 Student sdf 이거여도 똑같다
        // Student student 클래스 속성 자체를 가져와서 name 에 접근후 studentName 저장
        // Student name 을 받으면 주소값을 가져와서 안된다 - 맨 아래  추가 설명

        String studentName = student.name; // student.name 을 studentName 에 저장해서
        System.out.printf("선생: %s학생에게 %s과목을 가르치고 있습니다.\n",studentName,subjectName);
    }

    Teacher() {} // 숨겨저있던 기본생성자 오버로드 하려면 만들어줘야함
    Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode) {
        name = pName;
        gender = pGender;
        // 여기까지는 Teacher클래스에있는 속성이지만 pSubjectName, pSubjectCode은 Subject 클래스에있는 속성이다
        // subject 는 다른 클래스에서 정의해서 클래스를 형식으로 가져다써서
        Subject newsubject = new Subject();
        newsubject.subjectName = pSubjectName;
        newsubject.subjectCode = pSubjectCode;

        subject = newsubject; // 서브젝트 클래스에있는 name과 code에 대입

    }
}
//자바에서 객체를 출력할 때 왜 주소값처럼 보이는 게 나오는지 쉽게 설명해볼게요.
//
//간단한 비유
// 생각해봐, Student라는 객체는 일종의 우편물 상자라고 할 수 있어.
// 이 상자 안에는 이름, 나이, 학년 같은 정보들이 들어있지. 그런데 상자 자체를 printf로 출력하면,
// 상자 안의 내용물이 아니라 **상자 자체에 붙어있는 라벨(주소)**이 나오는 거야.
//
//Student student = new Student("Bob"); 이게 우편물 상자 하나를 만드는 것과 같아.
//System.out.printf("%s", student); 이렇게 하면 상자 안의 내용이 아닌 상자의 주소를 출력하게 되는 거야.
//왜냐하면 컴퓨터는 상자(객체) 자체를 표시하라고 하니까 라벨(주소)을 보여주는 거지.

//문제의 상황
//java
//코드 복사
//void teach(Student student, String subjectName) {
//    System.out.printf("선생: %s학생에게 %s과목을 가르치고 있습니다.\n", student, subjectName);
//}
//위 코드는 마치 우편물 상자 자체를 보여주라고 하는 거라서 주소값이 나오는 거야.
//
//해결 방법
//상자에 붙은 라벨(주소)이 아니라 상자 안의 내용물을 보여줘야 하는데, 그 내용물 중에서 name이라는 정보만 꺼내서 보여주면 돼.
//
//java
//코드 복사
//void teach(Student student, String subjectName) {
//    System.out.printf("선생: %s학생에게 %s과목을 가르치고 있습니다.\n", student.name, subjectName);
//}
//이렇게 하면 student라는 상자 안에 있는 name이라는 정보를 출력해서 원하는 결과가 나오게 돼.