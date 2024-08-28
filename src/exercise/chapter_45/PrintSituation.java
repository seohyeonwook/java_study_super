package exercise.chapter_45;

public class PrintSituation { // 제너릭 사용 안하고 Object 사용했을때
    public static void main(String[] args) {
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint print = new GeneralPrint();
        print.setMaterial("설계도");

        String material = (String) print.getMaterial(); // Object라서 앞에 형변환 타입 붙여줘야함
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint print2 = new GeneralPrint();
        print2.setMaterial(1235);

        Integer intMaterial = (Integer) print2.getMaterial(); // Object라서 앞에 형변환 타입 붙여줘야함
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint print3 = new GeneralPrint();
        print3.setMaterial(true);

        Boolean booleanMaterial = (Boolean) print3.getMaterial(); // Object라서 앞에 형변환 타입 붙여줘야함
        print3.printMyInfo();
    }
}
