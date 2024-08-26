package exercise.chapter_34;

public class DepartmentStoreSituation {
    public static void main(String[] args) {
        // 전제 상황
        int price = 10_000;
        Staff staff = new Staff();
        staff.setSalesAmount(1_000_000);// 가지고 있는 매상

        Customer customer = new VIPCustomer("아이유"); //단골

        Customer[] customerQueue = { // 고객 줄이라고 생각하자
                new Customer("권율"),new Customer("이순신"), new VIPCustomer("광해군"),
                customer, new Customer("김좌진"),customer,
                new Customer("장원영"), customer, new VIPCustomer("김혜수"),
                new GoldCustomer("정우영"), new GoldCustomer("정우성"), new GoldCustomer("서현욱")
        };

        // 시나리오
        for (Customer customerEach: customerQueue) {
            customerEach.printMyInfo(); // Customer배열 출력
            int cash = staff.helpPayment(customerEach, price);
            // 중요한건 여기에 배열에 있는 한명씩 다 호출한다는것
            System.out.printf("내가 내는 금액은 : %d\n",cash);
            // 손님은 점원에게 가격으로 결제요청한다
            // 점원은 손님 정보에 기반하여 물품 계산을 한다
            staff.addSalesAmount(cash);
            // 점원은 자신의 매상에 결제 금액을 추가한다

        }
        staff.printMySalesAmount();
    }
}
