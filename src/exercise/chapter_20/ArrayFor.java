package exercise.chapter_20;

public class ArrayFor {
    public static void main(String[] args) {

        int[] studentScores = {90, 87, 88, 75, 99, 67};

        //for loop

        for(int i=0; i <studentScores.length; i++ ) {
            System.out.printf("이 Array의 %d 인덱스 값은 %d 이다\n" , i, studentScores[i]);

//            System.out.println("이 Array의"+ i +"인덱스 값은" + studentScores[i] + "이다");
        }

        //강화된 for loop - 많이 사용
        for(int score: studentScores) {
            System.out.printf("sutdent의 값은 %d이다.\n", score);
        }

    }
}
