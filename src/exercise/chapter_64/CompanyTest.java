package exercise.chapter_64; // 싱글톤 - 자원을 좀 효율적으로 다루자

public class CompanyTest { // 1
    public static void main(String[] args) {
//        Company company1 = new Company(); // 이렇게 여러개 생성할수있는데
//        Company company2 = new Company(); // 여러개 생성하면 메모리가 서로다르고 멤버변수가 서로 다르다

        // 하나만 만들어지도록 설계하자는게 싱글톤 // 2에서 만드는법 이어서 설명

        Company c1 = Company.getInstance(); // 2 - 5 주소값 한번 보자
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2); // 원래 c1 c2 new 두개하면 주소값이 다른데 이건 같다
    }
}
