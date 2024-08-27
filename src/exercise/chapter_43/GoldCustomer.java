package exercise.chapter_43;

public class GoldCustomer extends Customer {
    private double discountRatio;// 구매 할인율

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }
    public GoldCustomer(String name) {
        super();
        this.customerID = "Customer" + Customer.serialNums++;
        // 따로 안하고 일반 고객과 공유하기때문에 그냥 Customer 클래스 변수 가지고와서 쓴다
        this.name = name;
        this.customerGrade = "GOlD";
        this.bonusPoint = 0;
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;

    }

}
