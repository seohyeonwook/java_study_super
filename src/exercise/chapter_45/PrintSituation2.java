package exercise.chapter_45;

public class PrintSituation2 { // 제너릭 사용하기
    public static void main(String[] args) {
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint2<String> print = new GeneralPrint2();
        print.setMaterial("설계도");

        String material = print.getMaterial(); // 형변환 필요없음 이제
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint2<Integer> print2 = new GeneralPrint2(); // 제너릭은 Wrapper타입/참조형 객체 만 가능 int안됨
        print2.setMaterial(1235);

        Integer intMaterial = print2.getMaterial();
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint2<Boolean> print3 = new GeneralPrint2();
        print3.setMaterial(true);

        Boolean booleanMaterial = print3.getMaterial();
        print3.printMyInfo();


    }
}
