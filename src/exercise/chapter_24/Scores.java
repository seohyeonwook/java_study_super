package exercise.chapter_24;

public class Scores {
    public static void main(String[] args) {
        // A class 학생들 점수

        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        // B class 학생들 점수

        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // Average - 주석들은 그냥 메서드 사용안하고 계산하는것
//        int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
//        double averageAClass = (double) sumAClass/3;

        double averageAClass = calculateAverage(studentAClass1,studentAClass2,studentAClass3); // 호출

//        int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;
//        double averageBClass = (double) sumBClass/3;

        double averageBClass = calculateAverage(studentBClass1,studentBClass2,studentBClass3); // 호출

        System.out.printf("A학급의 평균 점수는 %.2f, B학급 평균은 %.2f\n",averageAClass,averageBClass);

    }
    // 메서드로 만들어보기
    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3 ) {
        int sumBClass = studentScore1 + studentScore2 + studentScore3;
        return  sumBClass / (double) 3;
        }
    }


