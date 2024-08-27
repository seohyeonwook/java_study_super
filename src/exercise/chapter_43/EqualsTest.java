package exercise.chapter_43;

public class EqualsTest {
    public static void main(String[] args) {
        // equals - 두 인스턴스가 같은 객체 인지 판단한다  - 두 인스턴스의 heap 주소 값을 비교하여 boolean값을 리턴해준다
        Customer customer1 = new Customer("id1","민철");
        Customer customer2 = customer1;

        Customer customer3 = new Customer("id1","민철");
        Customer customer4 = new Customer("id1","민철");

        System.out.println(customer1);
        System.out.println(customer3);

        System.out.println(customer1.equals(customer2)); // 바로 대입했으니까 true
        System.out.println(customer1.equals(customer3)); // 같은값을 넣어도 주소가 다르다 그래서flase
                                // 근데 일반클래스에 equals 메서드 작성해서 id같으면 true나오게 해서 지금 true 나옴
        System.out.println(customer1.equals(customer4));

    }
}
