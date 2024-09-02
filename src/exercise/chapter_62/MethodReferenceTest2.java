package exercise.chapter_62;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest2 {
    public static void main(String[] args) { // 4

        // Instance 메소드 참조 -- 클래스에서 뽑는거랑 무슨 차이인가
        Customer customer1 = new Customer("이순신");
        Customer customer2 = new Customer("아이유");

        Supplier<String> ex1 = customer1 :: toString;
        Supplier<String> ex2 = customer2 :: toString;
                            // 1. 정적 메서드 참조
                            //(클래스이름::정적메소드이름)
                            // 2. 인스턴스 메서드 참조 (특정 객체의 인스턴스 메서드):
                            //(인스턴스:: 메소드이름)
                            // 3. 인스턴스 메서드 참조 (특정 객체의 인스턴스가 아닌 일반 객체의 인스턴스 메서드):
                            //(클래스이름:: 메소드이름)

        System.out.println(ex1.get());
        System.out.println(ex2.get());

        // 임의 객체 메소드 호출
        List<Customer> customerList = Arrays.asList(
                new Customer("이순신"),
                new Customer("아이유"),
                new Customer("카리나"),
                new Customer("유재석")
        );
        // Test1에 생성과 같지만 Example1은 객체를 추가 삭제할수있지만 asList는 추가 삭제가 안된다
        // 미리 물건이 들어있는 박스를 만드는 것 (리스트를 생성하면서 Arrays.asList로 모든 Customer 객체를 한 번에 추가)
        //
        //장점: 박스를 만들면서 물건을 미리 넣기 때문에 코드가 더 간단하고 깔끔해요. 하지만, 이 박스에 들어있는 물건은 나중에 추가하거나 뺄 수 없습니다.

        customerList.forEach(Customer ::printMyInfo);
    }
}
