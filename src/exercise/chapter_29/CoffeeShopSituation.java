package exercise.chapter_29;

// 손님 현금: 5만원
// 매상 : 100만원
public class CoffeeShopSituation {
    public static void main(String[] args) {
        // 미리 인스턴스화
        Customer customer = new Customer();
        customer.setCashAmount(50_000); //set로 5만원으로바꿔줌

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1_000_000);

        Barista barista = new Barista();

        // 로직 시작 - 호출 = 메서드 실행한다
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;

        customer.askCoffee(cashier, coffeeName); // 손님은 캐시어에게 아메리카노가 얼마인지 물어본다

        long price = cashier.checkCoffeePrice(coffeeName); // 캐시어는 아메리카노가 얼마인지 확인해서
        cashier.replyCoffeePrice(coffeeName, price);  // 가격을 답변해준다

        long cash = customer.withDrawCash(price); // 손님은 자신의 현금에서 돈을빼서
        customer.orderCoffee(coffeeName, isTakeOut); // 아메리카노를 테이크아웃으로 주문한다

        cashier.addAmount(cash); // 캐시어는 자신의 매상에 돈을 더하고
        cashier.sayOrder(coffeeName); // 주문확인을 알린다

        barista.noticeOrder(coffeeName); // 바리스타는 주문 확인을 하고
        Coffee coffee = barista.makeUpCoffee(coffeeName,500, 30); // 아메리카노 커피 만든다
        barista.sayCoffeeReady(coffee); // 커피 완성을 알린다

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee); // 캐시어는 아메리카노 커피를 테이크 아웃용으로 포장한다
        cashier.sayCoffeeReady(coffeeCompleted); // 캐시어는 아메리카노 커피 준비완료를 알린다

        customer.drinkCoffee(coffeeCompleted); // 손님은 아메리카노를 마시고 기분이 좋아진다
        if(coffeeCompleted.getCoffeeName() == coffeeName && // 자신이주문한 커피이름과 테이크아웃이 and로 만족하면
        coffeeCompleted.isWrappedUp() == isTakeOut) {
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo(); // 마지막 손님의 상태 확인
    }
}
