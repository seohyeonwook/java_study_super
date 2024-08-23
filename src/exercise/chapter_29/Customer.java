package exercise.chapter_29;

// 시나리오 참고
// 1. 손님은 캐시어에게 아메리카노 가격 물어본다.
// 2. 손님은 자신의 현금 에서 돈을 뺀다.
// 3. 손님은 아메리카노를 테이크 아웃 으로 주문한다.
// 4. 손님은 아메리카노 커피 를 마신다.
// 5. 손님은 자신의 기분이 좋아진다
public class Customer {

    // 속성
    private long cashAmount;
    private String myFeeling;

    // 행위
    public void askCoffee(Cashier cashier, String coffeeName) { // 가격 물어본다
        System.out.println("손님: 커피" + coffeeName + "얼마인가요??");
    }

    public long withDrawCash(long amount) { // 돈을 뺀다
        this.cashAmount -= amount;
        return amount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUp) { // 커피 주문한다
        System.out.println("손님: 커피 " + coffeeName + "을 주문할게요" +
                "단, 포장 여부는 " + isWrappedUp +"으로 부탁드려요");
    }

    public void drinkCoffee (Coffee coffee) { // 커피 마신다
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님: 나는 커피" +coffeeName+ "을 마신다.");
    }

    public void upgradeMyFeeling() { // 기분이 좋아진다
        this.myFeeling = "기분이 좋아졌다.";
    }

    public void showMyInfo() {
        System.out.printf("손님: 지금 나의 기분은 %s 하고, 현금은 %d 있습니다.",this.myFeeling, this.cashAmount);
    }
    public void setCashAmount(long cashAmount) { // cashAmount 초기값 0인데 5만원으로 바꿔주려고
        this.cashAmount = cashAmount;
    }
}
