package exercise.chapter_45; //Wrapper - 제너릭 사용해야하는데 제너릭은 Wrapper 강제



public class WrapperClassTest {
    public static void main(String[] args) {

        // Integer

        Integer integer1 = new Integer(10); //boxing, int - > integer로
        Integer integer2 = new Integer(100);

        int int1 = integer1.intValue(); // unboxing , integer -> 바꾼것

        System.out.println("============================== 위에까진 수동 밑에부턴 오토");

        Integer integer3 = 30; // Autoboxing -요즘은 이렇게 한다 위에처럼 안한다

        int int2 = integer3; // AutoUnboxing int -> integer

        System.out.println(integer3);
        System.out.println(int2);

        // 연산자
        System.out.println(int2 + integer1);
        System.out.println(integer3 + integer1);

        // Character - 이제부터 오토 언박싱 방법만
        Character character1 = 'x';
        char ch2 = character1;

        System.out.println(character1);
        System.out.println(ch2);

        System.out.println("-------------------------------");

        Character[] characters = {'a','b','c'}; // 이거 안됨
        char [] chars = {'a','b','c'};

        String str = String.valueOf(characters); // 이건 안됨
        String str2= String.valueOf(chars);

        System.out.println(str);
        System.out.println(str2);

        // Boolean Type

        Boolean boolean2 = true;
        boolean b2 = boolean2;
        System.out.println();


    }
}
