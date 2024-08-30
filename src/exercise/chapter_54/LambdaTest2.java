package exercise.chapter_54;

public class LambdaTest2 {
    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum() {
            @Override
            public int calculate(int num) {
                return num * 1;
            }
        }; // 이거랑 Test1에 첫줄이랑 똑같다.
    }
}
