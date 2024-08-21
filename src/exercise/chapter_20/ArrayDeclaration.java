package exercise.chapter_20;

import java.util.Arrays;

public class ArrayDeclaration {
    // 만약 학생 30명의 성적을 저장하고 평균값을 구하라고 하면
    // 30번의 선언과 30번의 연산이 필요함 - > 그래서 배열에 넣는다 (한 박스에 여러개으 ㅣ자료를 넣는다)
    public static void main(String[] args) {

        int[] scores = new int [30];
        // 어떤타입의 배열인지 선언 // 배열의 사이즈 선언
        int [] intArr = new int[10];
        int [] intArr2 ={1,2,3,4,5};

        System.out.println(intArr);
        System.out.println(intArr2); // 이렇게 출력하면 주소값이 나온다 배열을 출력하고싶으면
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr2));

        //boolean
        boolean [] booleans = new boolean[5];
        boolean [] booleans1 = {true, false, false};
        System.out.println(Arrays.toString(booleans));
        System.out.println(Arrays.toString(booleans1));

        // char String
        char [] chars = new char[5];
        char [] chars1 ={'a','b','d'};
        String [] strings = new String[5];
        String [] strings1 ={"ddd","ddww"};

        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(chars1));
        System.out.println(Arrays.toString(strings));// String 기본값은 null
        System.out.println(Arrays.toString(strings1));
    }



}
