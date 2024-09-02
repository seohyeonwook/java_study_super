package exercise.chapter_56;

public class LambdaTest2 { // 5
    public static void main(String[] args) {
        MultipleNum multipleNum = new MultipleNum() { // 여긴 익명을 나타낸거 그냥 풀어서쓴거임  Test1보자
            @Override
            public int calculate(int num) {
                return num * 1;
            }
        }; // 이거랑 Test1에 첫줄이랑 똑같다.
    }
}
