package exercise.chapter_28;

public class Subject {
    private String subjectName; // private가져가서 사용하는 법 get set - 외부에서 접근해서 수정한다
    private String subjectCode;

    void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
}
