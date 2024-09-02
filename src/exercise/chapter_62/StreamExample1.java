package exercise.chapter_62;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 { // 6
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));
//        빈 박스를 만들고 (빈 ArrayList 생성)
//
//        하나씩 물건을 넣는 것 (각 Customer 객체를 add 메서드로 추가)
//
//        장점: 나중에 물건을 더 넣거나, 빼거나 할 수 있어요. 리스트를 수정할 수 있습니다.

        customers.stream().map(customer -> customer.name) // isLongName 들어가보면 리턴 값에 길이가 >= 3이상 반환이다
                .filter(StringUtils :: isLongName)
                .forEach(System.out :: println);


        List<String> customerNames = Arrays.asList(
                "이순신",
                "민지",
                "오해원",
                "아이유"
        );

        List<Customer> customerList = customerNames.stream()
                .map(Customer::new)
                .collect(Collectors.toList());
        // 생성자가 3개가 있는데 어떻게 찾아가냐 도대체 매개변수도 명시안했는데
        // 걍 안다 위에 이름 스트링 하나들어간거보고 똑똑해서 찾아간다
        System.out.println(customerList);
    }

}
