package exercise.chapter_43;

public class ObjectTest { //Object메서드 일반 클래스에 오버라이딩 해서 사용하는거 말하는거임
    public static void main(String[] args) {
        Customer customer = new Customer("민철");
        VIPCustomer vipCustomer = new VIPCustomer("철쑤");
        System.out.println(customer.toString());
        System.out.println(customer); // 변수명을 넣는다는건 뒤에 .toString 이랑 같다

        // 대문자로 시작하면 다 참조변수  eg) String
        //Object 중요 메서드  hashCode / clone / toString /equals

        // toString - 객체 정보를 문자열로 바꾸어 준다.

        customer.printMyInfo();

        System.out.println(vipCustomer); // toString 단축키사용
        System.out.println(customer); // 리턴값으로 사용





    }
}
