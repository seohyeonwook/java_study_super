package exercise.chapter_57;

import java.util.ArrayList;
import java.util.List;

public class TravelTest { // 5

    public static void main(String[] args) {

        // List
        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(new TravelCustomer("아이유", 29, 200000)); // 이건 컬렉션 방법
        customers.add(new TravelCustomer("박보검", 28, 180000));
        customers.add(new TravelCustomer("송중기", 36, 250000));
        customers.add(new TravelCustomer("김태리", 32, 220000));
        customers.add(new TravelCustomer("전정국", 24, 190000));

        // 1. 고객 명단 추가된 순서로 출력
        customers.stream() // 객체가 들어가있기때문에 map으로 추출
                .map( (customer) -> customer.getName()) // map으로 변환 getname 람다식으로
                .forEach((name) -> System.out.println(name));

        // 2. 총 고객들의 여행 비용 계산
        long total = customers.stream()
                .map ((customer) -> customer.getPrice())
                .mapToInt( i -> i)
                .sum(); // sum 하려면 intStream 만 가능 그래서 mapToInt로 intStream바꿈
        System.out.println("total 비용 : " + total);

    }
}

