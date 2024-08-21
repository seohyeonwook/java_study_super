package exercise.chapter_13;

public class ExplicitCasting {
    public static void main(String[] args) {
        // 명시적 형변환
        float myFloat = 5.55f;
        int myInt = (int)myFloat;
        System.out.println(myInt); // 소수점 버리기때문에 자료손실이 난다

        int myInt2 = 600;
        byte myByte = (byte) myInt2;
        System.out.println(myByte);// 600인데 byte크기가 작아서 버리고 온다

        // 연산 " +"
        double myDouble1 = 5.5;
        double myDouble2 = 3.7;

        int result = (int)myDouble1 +(int)myDouble2 ;
        int result2 = (int)(myDouble1 +myDouble2) ;// 사칙연산 뭐 먼저 하는지에 따라 값이 다름
        System.out.println(result); // 소수점은 무조건 버린다 반올림 개념 아님

    }
}
